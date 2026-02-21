package com.academia.config;


import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.Step;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.infrastructure.item.data.RepositoryItemWriter;
import org.springframework.batch.infrastructure.item.data.builder.RepositoryItemWriterBuilder;
import org.springframework.batch.infrastructure.item.file.FlatFileItemReader;
import org.springframework.batch.infrastructure.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.academia.model.Producto;
import com.academia.processor.ProductoProcessor;
import com.academia.repository.ProductoRepository;

@Configuration
public class BatchConfig {
	
	@Bean
    public FlatFileItemReader<Producto> leerCsv() {
        return new FlatFileItemReaderBuilder<Producto>()
                .name("productoReader")
                .resource(new ClassPathResource("productos.csv"))
                .delimited()                          // separado por comas
                .names("id", "nombre", "precio", "stock") // columnas del CSV
                .targetType(Producto.class)            // mapea a nuestro POJO
                .linesToSkip(1)                        // saltar la linea de encabezado
                .build();
    }
	
	@Bean
    public ProductoProcessor procesarProducto() {
        return new ProductoProcessor();
    }
	
	@Bean
	public RepositoryItemWriter<Producto> writer(ProductoRepository repository) {
	    return new RepositoryItemWriterBuilder<Producto>()
	            .repository(repository)
	            .methodName("save") 
	            .build();
	}
	
	@Bean
    public Step step1(JobRepository jobRepository, 
                     PlatformTransactionManager transactionManager,
                     ProductoRepository repository) {
        return new StepBuilder("importar productos", jobRepository)
                .<Producto, Producto>chunk(10, transactionManager) // Procesa de 10 en 10
                .reader(leerCsv())
                .processor(procesarProducto())
                .writer(writer(repository))
                .build();
    }

    @Bean
    public Job importUserJob(JobRepository jobRepository, Step step1) {
        return new JobBuilder("import-productos-job", jobRepository)
                .start(step1)
                .build();
    }
	
	

}

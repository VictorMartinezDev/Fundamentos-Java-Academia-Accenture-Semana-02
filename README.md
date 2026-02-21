# Fundamentos Java - Academia Accenture (Semana 02)

## 📋 Descripción

Repositorio de ejercicios prácticos donde se implementan los conocimientos adquiridos en la **segunda semana de academia** de Java en Accenture. Este proyecto contiene una colección de ejercicios que cubren conceptos fundamentales y patrones de diseño en Java, además de un proyecto integral de procesamiento por lotes.

## 📁 Estructura del Proyecto

```
Fundamentos-Java-Academia-Accenture-Semana-02/
├── Ejercicio01_ExcepcionesPersonalizadas/
├── Ejercicio02_IteradorConInnerClass/
├── Ejercicio03_SistemaDeTicketsConEnumsAvanzados/
├── Ejercicio04_PipelineFuncionalDeProductos/
├── Ejercicio05_PizzasBuilderAndDecorator/
├── Ejercicio06_Framework de Eventos_ObserverAndStrategyAndDI/
├── ProyectoSemana02_Batch/
└── README.md
```

## 📚 Descripción de Ejercicios

### 📌 Ejercicio 01: Excepciones Personalizadas
Implementación de excepciones personalizadas para casos de uso específicos del negocio.

**Conceptos Cubiertos:**
- Creación de excepciones personalizadas
- Herencia de Exception
- Manejo de excepciones checked y unchecked

### 📌 Ejercicio 02: Iterador con Inner Class
Implementación del patrón Iterator usando clases internas (inner classes).

**Conceptos Cubiertos:**
- Clases internas (Inner Classes)
- Patrón Iterator
- Interfaz Iterator

### 📌 Ejercicio 03: Sistema de Tickets con Enums Avanzados
Sistema de gestión de tickets implementando enums con comportamiento avanzado.

**Conceptos Cubiertos:**
- Enums con métodos y atributos
- Enums abstractos
- Estado y comportamiento en enums

### 📌 Ejercicio 04: Pipeline Funcional de Productos
Implementación de un pipeline funcional usando Streams de Java.

**Conceptos Cubiertos:**
- Streams API
- Expresiones lambda
- Operaciones intermedias y terminales
- Filter, map, reduce

### 📌 Ejercicio 05: Pizzas - Builder and Decorator
Construcción de un sistema de pizzas usando patrones Builder y Decorator.

**Conceptos Cubiertos:**
- Patrón Builder
- Patrón Decorator
- Construcción fluida de objetos
- Composición sobre herencia

### 📌 Ejercicio 06: Framework de Eventos
Framework de eventos implementando Observer, Strategy e inyección de dependencias.

**Conceptos Cubiertos:**
- Patrón Observer
- Patrón Strategy
- Inyección de Dependencias (DI)
- Desacoplamiento de componentes

### 📌 ProyectoSemana02_Batch: Procesamiento por Lotes de Productos
Sistema integral de procesamiento batch con **Spring Batch** que lee productos desde un archivo CSV, los procesa y persiste en una base de datos.

**¿De qué va el proyecto?**
Este proyecto demuestra cómo implementar un pipeline ETL (Extract, Transform, Load) completo utilizando Spring Batch. El flujo procesa un archivo CSV de productos, aplica validaciones y transformaciones, y finalmente almacena los datos en una base de datos relacional mediante JPA.

**Arquitectura:**
- **Lectura**: `FlatFileItemReader` - Lee datos desde un archivo CSV
- **Procesamiento**: `ProductoProcessor` - Valida y transforma productos
- **Escritura**: `RepositoryItemWriter` - Persiste en base de datos
- **Configuración**: `BatchConfig` - Define Jobs y Steps configurables

**Requisitos para Implementarlo:**
- **Java 11 o superior**
- **Maven 3.6+** (para build)
- **Spring Boot 3.0+**
- **Spring Batch 5.0+**
- **JPA/Hibernate** (para persistencia)
- **Base de datos** (H2, MySQL, PostgreSQL, etc.)
- **Archivo CSV de entrada** con estructura de productos

**Dependencias Principales:**
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-batch</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

**Conceptos Cubiertos:**
- Spring Batch Framework
- ETL (Extract, Transform, Load)
- FlatFileItemReader y RepositoryItemWriter
- Job y Step configuration
- Chunk processing (procesa de N en N registros)
- Entity mapping con JPA
- Transaccionalidad en batch

## 🎓 Contenidos Aprendidos

Este repositorio cubre conceptos esenciales para un desarrollador Java:

✅ Manejo avanzado de excepciones
✅ Estructuras internas en Java
✅ Enumeraciones avanzadas
✅ Programación funcional y Streams
✅ Patrones de diseño (Builder, Decorator, Observer, Strategy)
✅ Principios SOLID
✅ Inyección de dependencias
✅ Spring Batch y procesamiento ETL
✅ Persistencia con JPA/Hibernate

## 🔧 Tecnologías

- **Lenguaje**: Java 11+
- **Build Tool**: Maven 3.6+
- **Framework**: Spring Boot 3.0+
- **Batch Processing**: Spring Batch 5.0+
- **Persistencia**: JPA/Hibernate
- **IDE Recomendado**: IntelliJ IDEA, Eclipse o NetBeans

## 👤 Autor

**VictorMartinezDev**
- GitHub: [@VictorMartinezDev](https://github.com/VictorMartinezDev)
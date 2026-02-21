package com.academia.principal;

import java.util.List;
import java.util.function.*;

record Product(String name, double price, String category, boolean inStock) {
    boolean isAvailable() { return inStock; }

    String toDisplayString() {
        return String.format("%-15s $%7.2f  %-12s [%s]",
            name, price, category, inStock ? "En stock" : "Agotado");
    }
}

class ProductPipeline {
    private Predicate<Product> filter = p -> true;
    private Function<Product, String> transform = Product::toDisplayString;

    public ProductPipeline where(Predicate<Product> predicate) {
        // TODO: encadenar con .and()
        this.filter = filter.and(predicate);
        return this;
    }

    public ProductPipeline transform(Function<Product, String> fn) {
        this.transform = fn;
        return this;
    }

    public void forEach(List<Product> products, Consumer<String> action) {
        // TODO: filtrar productos, aplicar transformacion, ejecutar accion
        for (Product p : products) {
            if (filter.test(p)) {
                action.accept(p.toDisplayString());
            }
        }
    }

    public long count(List<Product> products) {
        // TODO: contar productos que pasan el filtro
        long total = 0;
        for (Product p : products) {
            if (filter.test(p)) total++;
        }
        return total;
    }
}
package org.exercise7;

public class Product {
    private String name;
    private final BigDecimal price;

    public  Product(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}

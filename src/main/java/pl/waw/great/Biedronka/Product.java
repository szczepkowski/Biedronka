package pl.waw.great.Biedronka;

import java.math.BigDecimal;
import java.time.LocalDateTime;

class Product {

    private int id;

    private String name;
    private BigDecimal price;
    private int amount;

    private LocalDateTime created;

    public Product(int id, String name, BigDecimal price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.created = LocalDateTime.now();
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", created=" + created +
                '}';
    }

    public int calculate(int a,int b){
        int sum = a + b;
        return sum;
    }
}

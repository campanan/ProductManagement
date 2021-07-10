package br.com.gubeetest.productmanagement.product;

import io.micrometer.core.lang.Nullable;

import javax.persistence.*;

@Entity
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String description;

    @Column(nullable = false)
    String targetMarket;

    @Column(nullable = false)
    String stacks;

    public Product() {
    }

    public Product(String name, String description, String targetMarket, String stacks) {
        this.name = name;
        this.description = description;
        this.targetMarket = targetMarket;
        this.stacks = stacks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTargetMarket() {
        return targetMarket;
    }

    public void setTargetMarket(String targetMarket) {
        this.targetMarket = targetMarket;
    }

    public String getStacks() {
        return stacks;
    }

    public void setStacks(String stacks) {
        this.stacks = stacks;
    }
}

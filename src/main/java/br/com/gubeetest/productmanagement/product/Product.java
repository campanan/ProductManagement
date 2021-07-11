package br.com.gubeetest.productmanagement.product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    long id;

    @Column(nullable = false)
    String productName;

    @Column(nullable = false)
    String description;

    @Column(nullable = false)
    @ElementCollection
    @CollectionTable(name = "product_target_market", joinColumns = @JoinColumn(name = "product_id"))
    List<String> targetMarket;

    @Column(nullable = false)
    @ElementCollection
    @CollectionTable(name = "product_stack", joinColumns = @JoinColumn(name = "product_id"))
    List<String> stack = new ArrayList<>();

    public Product() {
    }

    public Product(String productName, String description, List<String> targetMarket, List<String> stack) {
        this.productName = productName;
        this.description = description;
        this.targetMarket = targetMarket;
        this.stack = stack;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTargetMarket() {
        return targetMarket;
    }

    public void setTargetMarket(List<String> targetMarket) {
        this.targetMarket = targetMarket;
    }

    public List<String> getStack() {
        return stack;
    }

    public void setStack(List<String> stack) {
        this.stack = stack;
    }
}

package br.com.gubeetest.productmanagement.product;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Stack;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByStack(String stack);

}

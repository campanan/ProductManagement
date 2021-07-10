package br.com.gubeetest.productmanagement.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Método será usado para implementar JSON de produtos no sistema web, para usos reais teriamos um list direto do BD.

    public Product saveOne(Product product){
        return productRepository.save(product);
    }

    public List<Product> saveAll(List<Product> productList){
         return productRepository.saveAll(productList);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public List<Product> findByStack(String stacks){

        return productRepository.findByStacks(stacks);

    }




}

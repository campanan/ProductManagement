package br.com.gubeetest.productmanagement.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/add2")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAll(@RequestBody List<Product> listProduct){
        productService.saveAll(listProduct);
    }

    @PostMapping("/add1")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveOne(@RequestBody Product product){
        productService.saveOne(product);
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

}

package br.com.gubeetest.productmanagement.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/products")
public class ProductController implements ProductControllerDocs {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAll(@RequestBody List<Product> listProduct){
        productService.saveAll(listProduct);
    }


    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }


    @GetMapping("/stack/{stack}")
    public List<Product> findAllByStack(@PathVariable("stack") String stack){
        return productService.findAllByStack(stack);
    }

    @GetMapping("/stack-used")
    public List<String> findAllStacksAvaliables(){
        return productService.findAllStacksAvaliables();
    }

    @GetMapping("/target-market-used")
    public List<String> findAllTargetMarketAvaliables(){
        return productService.findAllTargetMarketAvaliables();
    }

    @GetMapping("/target-market/{targetMarket}")
    public List<Product> findAllByTargetMarket(@PathVariable("targetMarket") String targetMarket){
        return productService.findAllByTargetMarket(targetMarket);
    }




}

package br.com.gubeetest.productmanagement.product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api("Product Management API")
public interface ProductControllerDocs {

    @ApiOperation(value = "Product creation operation")
    @ApiResponses( value = {
            @ApiResponse(code = 201, message = "Success, product created"),
            @ApiResponse(code = 400, message = "Missing required fields, or wrong field values")


    })
    public void saveAll(@RequestBody List<Product> listProduct);


}

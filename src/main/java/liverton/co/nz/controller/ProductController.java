package liverton.co.nz.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import liverton.co.nz.schema.Product;
import liverton.co.nz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Gets all products available", response = List.class)
    @ApiResponses({ @ApiResponse(code = 400, message = "Bad Request") })
    public List<Product> getProducts() {
        return this.productService.getProducts();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ApiOperation(value = "Creates a product", response = boolean.class)
    @ApiResponses({ @ApiResponse(code = 400, message = "Bad Request") })
    public boolean createProduct(@Valid @RequestBody Product product) {
        return this.productService.createProduct(product);
    }
}

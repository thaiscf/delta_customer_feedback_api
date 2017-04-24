package liverton.co.nz.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import liverton.co.nz.schema.Customer;
import liverton.co.nz.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ApiOperation(value = "Creates a new customer", response = boolean.class)
    @ApiResponses({ @ApiResponse(code = 400, message = "Bad Request") })
    public boolean createCustomer(@Valid @RequestBody Customer customer) {
        return this.customerService.createCustomer(customer);
    }
}

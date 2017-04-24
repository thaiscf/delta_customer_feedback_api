package liverton.co.nz.service;

import liverton.co.nz.repository.CustomerRepository;
import liverton.co.nz.schema.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public boolean createCustomer(Customer customer) {
        customerRepository.save(customer);
        return true;
    }
}

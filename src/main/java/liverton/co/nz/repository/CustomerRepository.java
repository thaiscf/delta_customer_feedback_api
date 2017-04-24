package liverton.co.nz.repository;

import liverton.co.nz.schema.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}

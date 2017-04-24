package liverton.co.nz.repository;

import liverton.co.nz.schema.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product, String> {
}

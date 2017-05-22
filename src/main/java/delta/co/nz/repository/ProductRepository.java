package delta.co.nz.repository;

import delta.co.nz.schema.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product, String> {
}

package liverton.co.nz.service;

import liverton.co.nz.repository.ProductRepository;
import liverton.co.nz.schema.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @Override
    public boolean createProduct(Product product) {
        productRepository.save(product);
        return true;
    }
}

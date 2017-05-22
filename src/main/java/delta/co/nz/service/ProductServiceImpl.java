package delta.co.nz.service;

import delta.co.nz.schema.Product;
import delta.co.nz.repository.ProductRepository;
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

package liverton.co.nz.service;

import liverton.co.nz.repository.FeedbackRepository;
import liverton.co.nz.repository.ProductRepository;
import liverton.co.nz.schema.Feedback;
import liverton.co.nz.schema.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public boolean createFeedback(Feedback feedback) {
        feedback.setProduct(productRepository.findOne(feedback.getProduct().getId()));
        feedbackRepository.save(feedback);
        return true;
    }

    @Override
    public List<Feedback> getFeedbacks() {
        return feedbackRepository.findAll();
    }

}

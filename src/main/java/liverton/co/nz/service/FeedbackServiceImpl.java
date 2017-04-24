package liverton.co.nz.service;

import liverton.co.nz.repository.FeedbackRepository;
import liverton.co.nz.schema.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public boolean createFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
        return true;
    }

    @Override
    public List<Feedback> getFeedbacks() {
        return feedbackRepository.findAll();
    }

}

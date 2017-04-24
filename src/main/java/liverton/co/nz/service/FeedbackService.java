package liverton.co.nz.service;

import liverton.co.nz.schema.Feedback;

import java.util.List;

public interface FeedbackService {

    boolean createFeedback(Feedback feedback);
    List<Feedback> getFeedbacks();
}

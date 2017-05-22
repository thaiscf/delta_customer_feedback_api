package delta.co.nz.service;

import delta.co.nz.schema.Feedback;

import java.util.List;

public interface FeedbackService {

    boolean createFeedback(Feedback feedback);
    List<Feedback> getFeedbacks();
}

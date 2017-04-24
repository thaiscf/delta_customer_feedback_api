package liverton.co.nz.repository;

import liverton.co.nz.schema.Feedback;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository extends MongoRepository<Feedback, String> {
}

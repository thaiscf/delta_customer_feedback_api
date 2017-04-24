package liverton.co.nz.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import liverton.co.nz.schema.Feedback;
import liverton.co.nz.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ApiOperation(value = "Creates a new feedback", response = boolean.class)
    @ApiResponses({ @ApiResponse(code = 400, message = "Bad Request") })
    public boolean createFeedback(@Valid @RequestBody Feedback feedback) {
        return feedbackService.createFeedback(feedback);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Gets all feedbacks", response = List.class)
    @ApiResponses({ @ApiResponse(code = 400, message = "Bad Request") })
    public List<Feedback> getFeedbacks() {
        return this.feedbackService.getFeedbacks();
    }
}

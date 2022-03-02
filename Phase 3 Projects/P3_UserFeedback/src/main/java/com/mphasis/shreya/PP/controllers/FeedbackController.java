package com.mphasis.shreya.PP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mphasis.shreya.PP.entity.Feedback;
import com.mphasis.shreya.PP.services.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	FeedbackService FeedbackService;
	
	@GetMapping("/feedback")
	public Iterable<Feedback>getAllFeedbacks(){
		return FeedbackService.GetAllFeedback();
	}
	@PostMapping(path="/feedback", consumes= {MediaType.APPLICATION_JSON_VALUE}) 
	public Feedback addNewFeedback(@RequestBody Feedback fb) {
		Feedback newFb = new Feedback(fb.getComments(), fb.getRating(), fb.getUser());
		FeedbackService.addNewFeedback(newFb);
		return newFb;
	}

}

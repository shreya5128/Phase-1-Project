package com.mphasis.shreya.PP.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mphasis.shreya.PP.entity.Feedback;
import com.mphasis.shreya.PP.repositories.FeedbackRepository;

@Service

public class FeedbackService {

	@Autowired
	FeedbackRepository FeedbackRepo;
	public Iterable<Feedback>GetAllFeedback() {
		return FeedbackRepo.findAll();
	}
	public Feedback addNewFeedback(Feedback fb) {
		return FeedbackRepo.save(fb);
	}

}

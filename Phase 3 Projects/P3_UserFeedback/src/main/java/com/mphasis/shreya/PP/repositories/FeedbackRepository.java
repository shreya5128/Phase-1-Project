package com.mphasis.shreya.PP.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mphasis.shreya.PP.entity.Feedback;
@Repository

public interface FeedbackRepository extends CrudRepository<Feedback, Integer>  {
	public Feedback findByUser(String feedback);
	}



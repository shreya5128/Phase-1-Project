package com.mphasis.shreya.PP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.mphasis.shreya.PP.entity.Feedback;
import com.mphasis.shreya.PP.services.FeedbackService;
@Controller

public class TestFormController {

	@Autowired
	FeedbackService FeedbackService;
	@GetMapping("/test_form")
	public String showTestForm(ModelMap model) {
		model.addAttribute("test", new Feedback());
		return "testformjsp";
	}
	@PostMapping("/test_form")
	public String submitTestForm(@ModelAttribute("testUser") Feedback fb, ModelMap m) {
		FeedbackService.addNewFeedback(fb);
		m.addAttribute("test", fb);
			return "post";
	}


}


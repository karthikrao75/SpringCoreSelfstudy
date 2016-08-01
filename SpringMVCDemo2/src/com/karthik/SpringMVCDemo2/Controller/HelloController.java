package com.karthik.SpringMVCDemo2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView getHelloMessage() {
		ModelAndView andView = new ModelAndView("HelloPage");
		andView.addObject("message", "Hi user, welcome to annotation based spring mvc application");
		return andView;
	}
}

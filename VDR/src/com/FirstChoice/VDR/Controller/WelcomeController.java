package com.FirstChoice.VDR.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public ModelAndView getWelcomePage(){
		ModelAndView view=new ModelAndView("welcome");
		return view;
	}
}

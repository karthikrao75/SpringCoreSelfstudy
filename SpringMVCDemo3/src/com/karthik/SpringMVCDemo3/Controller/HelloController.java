package com.karthik.SpringMVCDemo3.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("greet")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		ModelAndView andView = new ModelAndView("WelcomePage");
		andView.addObject("message", "welcome to spring MVC user");
		return andView;
	}

	@RequestMapping("/hello")
	public ModelAndView getHelloMessage() {
		ModelAndView andView = new ModelAndView("HelloPage");
		andView.addObject("message", "Hello user, this Spring MVC Application");
		return andView;
	}

	@RequestMapping("/welcome/{country}/{userName}")
	public ModelAndView getPathVariable(@PathVariable("country") String Country,
			@PathVariable("userName") String userName) {
		ModelAndView andView = new ModelAndView("PathVariablePage");
		andView.addObject("message", "Hello " + userName + ", your are from " + Country);
		return andView;

	}

	@RequestMapping("/hello/{country}/{userName}")
	public ModelAndView getPathVariableMap(@PathVariable Map<String, String> pathVar) {
		ModelAndView andView = new ModelAndView("PathVariablePage");
		andView.addObject("message", "Hello " + pathVar.get("userName") + ", your are from " + pathVar.get("country"));
		return andView;

	}
}

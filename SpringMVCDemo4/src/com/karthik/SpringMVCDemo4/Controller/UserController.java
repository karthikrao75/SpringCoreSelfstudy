package com.karthik.SpringMVCDemo4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		return new ModelAndView("AdmissionForm");
	}

	@RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="userName", defaultValue="Mr.XYZ") String name, @RequestParam("city") String city) {
		//map also can be used for requestparam like in pathvariable 
		ModelAndView andView = new ModelAndView("AdmissionSuccess");
		andView.addObject("message", "Congratulation "+name+" ! your admission for "+city+" is success");
		return andView;
	}
}

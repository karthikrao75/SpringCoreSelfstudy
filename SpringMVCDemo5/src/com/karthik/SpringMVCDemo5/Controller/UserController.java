package com.karthik.SpringMVCDemo5.Controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.karthik.SpringMVCDemo5.CustPropetyEditers.StudentNameEditer;
import com.karthik.SpringMVCDemo5.Model.Student;

@Controller
public class UserController {
	
	@ModelAttribute
	public void getCommonObjects(Model model){
		//all common objects can be added separate method with @modelAttribute 
		//this will run before all the other mapping methods 
		model.addAttribute("headerMessage", "GPS PRIVATE LIMITED");
	}

	@InitBinder
	public void initBinderMethod(WebDataBinder binder){
		// will remove this data from binding
		//binder.setDisallowedFields("mobileNumber");
		//default date binder in spring is date with delimiter /
		//to change the input date to corresponding value use binder.
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class, "dateOfJoining", new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditer() );
	}
	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws IOException {
		String exception="Null_Pointer";
		ModelAndView modelAndView=null;
		if(exception.equalsIgnoreCase("Null_Pointer")){

			throw new IOException();
		}
		modelAndView=new ModelAndView("AdmissionForm");
		return modelAndView;
	}

	@RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm( @Valid @ModelAttribute("student") Student student,BindingResult result) {
		// @modelAttribute will bind the student object by itself and send it to
		// next view.
		//in jsp page student attributes name must match
		//bindingresult is added to handle spring binding related errors 
		if(result.hasErrors()){
			ModelAndView andView=new ModelAndView("AdmissionForm");
			return andView;
		}
		ModelAndView andView = new ModelAndView("AdmissionSuccess");
		return andView;
	}
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception exception){
		
		return "NullPointerException";
	}

}

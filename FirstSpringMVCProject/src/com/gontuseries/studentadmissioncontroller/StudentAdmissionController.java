
package com.gontuseries.studentadmissioncontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class StudentAdmissionController {

	@InitBinder
	public void doNotPassList (WebDataBinder binder)
	{
	//	binder.setDisallowedFields(new String[] {"studentMobile"});
        binder.registerCustomEditor(String.class, "studentHobby", new MyCustomProperties());
		
	}
	
	@ModelAttribute 
	public void addCommanObjects(Model model1)
	{
	model1.addAttribute("headerMessage", "Punjab Engineering College, Chandigarh");

	}
	
//	*****************************************

	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)

	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");


		return model;
	}

	@RequestMapping(value ="/submitAdmissionForm.html", method = RequestMethod.POST)

	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result) {
		if (result.hasErrors()) {
			ModelAndView model = new ModelAndView ("AdmissionForm");
			return model;
		}


		ModelAndView model = new ModelAndView("AdmissionSuccess");

		return model;
	
	
	}

}
package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springboot.entity.FormData;
import com.example.springboot.service.HomeService;


@Controller
public class HomeController 
{
	@Autowired
	private HomeService homeservice;
	
	
	

	@RequestMapping("/home")
    
	public String home(org.springframework.ui.Model model)
	{
		
	model.addAttribute("message",homeservice.getWelcomeMessage() );
	
	model.addAttribute("formData", new FormData());
	
	 return "home.jsp";
	}
	
	
	@GetMapping("/api/message")
	@ResponseBody
	public String getMessage()
	{
		return homeservice.getWelcomeMessage();
	}
	
	
	

    @PostMapping("/submitForm")
    @ResponseBody
    public String submitForm(@ModelAttribute FormData formData, Model model) {
        // Handle form data
        model.addAttribute("message", "Form submitted successfully!");
        model.addAttribute("name", formData.getName());
        model.addAttribute("age", formData.getAge());
        return "result";
    }
}

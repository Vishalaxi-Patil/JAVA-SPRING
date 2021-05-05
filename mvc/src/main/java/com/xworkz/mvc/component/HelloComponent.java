package com.xworkz.mvc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")

public class HelloComponent {
	
	
	public HelloComponent() {
	System.out.println("creatred "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/get.do")
	public String submit() {
		System.out.println("Invoked submit");
		return "/index.jsp";
	}

}

package com.xworkz.mvc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")

public class DayComponent {
	
	public DayComponent() {
		System.out.println("cretaed "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/press.do")
	public String stress() {
		System.out.println("Invoked press");
		return "/day.jsp";
	}

}

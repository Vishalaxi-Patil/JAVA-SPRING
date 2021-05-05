package com.xworkz.mvc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SearchComponent {
	
	public SearchComponent() {
		System.out.println("create "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/search.do")
	public String onSerach() {
		System.out.println("invoked onSearch");
		return "/search.jsp";
	}

}

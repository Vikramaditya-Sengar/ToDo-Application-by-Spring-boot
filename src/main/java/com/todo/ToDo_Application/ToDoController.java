package com.todo.ToDo_Application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDoController {
	
	@RequestMapping("/home")
	public String login() {
		return "login.jsp" ;
	}
	
	@RequestMapping("/login")
	public String login(String uname, String pwd) {
		String res;
		if(uname.equals(pwd)) {
			res="welcome.jsp";
		}
		else {
			res = "login.jsp";
		}
		return "login.jsp";
	}

}

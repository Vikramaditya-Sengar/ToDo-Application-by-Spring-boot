package com.todo.ToDo_Application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ToDoController {

	@Autowired
	ToDoRepo tr;

	@RequestMapping("/home")
	public String login() {
		return "login.jsp";
	}

	@RequestMapping("/login")
	public String login(String uname, String pwd) {
		String res;
		if (uname.equals(pwd)) {
			res = "welcome.jsp";
		} else {
			res = "login.jsp";
		}
		return res;
	}

	@RequestMapping("/addtodo")
	public String addToDo() {
		return "addtodo.jsp";
	}

	@RequestMapping("/registertodo")
	public String registerToDo(ToDo t) {
		tr.save(t);
		return "todos";
	}
	
	

//	@RequestMapping("/todos")
//	public String todos() {
//		tr.findAll();
//		return "todos.jsp";
//	}

//	@RequestMapping("/todos")
//	public ModelAndView todos() {
//	    ModelAndView mv = new ModelAndView("todos.jsp");
//	    mv.addObject("obj", tr.findAll());
//	    return mv;
//	}
	@RequestMapping("/todos")
	public ModelAndView todos(ModelMap mp) {
		ModelAndView mv = new ModelAndView();
		mp.put("data", tr.findAll());
		mv.addAllObjects(mp);
		mv.setViewName("todos.jsp");
		return mv;
	}
	
	@RequestMapping("/deletetodo")
	public String deletetodo(int sno) {
		tr.deleteById(sno);

		return "todos";
	}

	@RequestMapping("/edittodo")
	public ModelAndView edittodo(int id) {
		ToDo td = tr.findById(id).get();
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", td);
		mv.setViewName("edittodo.jsp");

		return mv;
	}

	@RequestMapping("/updatetodo")
	public String updatetodo(ToDo t) {
		tr.save(t);
		return "todos";
	}
}
	


//	@RequestMapping("/logout")
//	public String logout() {
//		return "logout.jsp";
//	}
//

//	@RequestMapping("/deletetodo")
//	public String deletetodo(int sno) {
//		tr.deleteById(sno);
//
//		return "todos";
//	}
//
//	@RequestMapping("/edittodo")
//	public ModelAndView edittodo(int id) {
//		ToDo td = tr.findById(id).get();
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("obj", td);
//		mv.setViewName("edittodo.jsp");
//
//		return mv;
//	}
//
//	@RequestMapping("/updatetodo")
//	public String updatetodo(ToDo t) {
//		tr.save(t);
//		return "todos";
//	}
//
//	@RequestMapping("/todos")
//	public ModelAndView todos(ModelMap mp) {
//		ModelAndView mv = new ModelAndView();
//		mp.put("obj", tr.findAll());
//		mv.addAllObjects(mp);
//		mv.setViewName("todos.jsp");
//		return mv;
//	}

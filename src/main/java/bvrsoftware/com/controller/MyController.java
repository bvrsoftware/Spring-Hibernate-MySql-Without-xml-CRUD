package bvrsoftware.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import bvrsoftware.com.model.Student;
import bvrsoftware.com.sevice.MyService;


@Controller
@RequestMapping("/")
public class MyController {

	@Autowired
	private MyService sr;
	
	@RequestMapping(value = "/insertpage")
	String InserPage(Model m)
	{
		m.addAttribute("st", new Student());
		return "InserOrUpdate";
	}
	@RequestMapping(value = "/updatepage/{id}")
	String UpdatePage(@PathVariable("id")int id,Model m)
	{
		m.addAttribute("st", sr.getById(id));
		return "InserOrUpdate";
	}
	@RequestMapping(value = "/insert")
	String InserOrUpdateSubmit(@ModelAttribute("Student")Student st,Model m)
	{
		sr.InserOrUpdate(st);
		return "redirect:/students";
	}
	@RequestMapping(value = "students")
	String AllStudent(Model m)
	{
		m.addAttribute("list", sr.getAllstudent());
		return "allstudent";
	}
	@RequestMapping(value = "/delete/{id}")
	String Deletepage(@PathVariable("id")int id,Model m)
	{
		sr.DeleteById(id);
		return "redirect:/students";
	}
}

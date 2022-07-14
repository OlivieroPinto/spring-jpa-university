package jana60.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.spring.mvc.model.model_university;
import jana60.spring.mvc.repository.repository;

@Controller
@RequestMapping("/")
public class controller {

	@Autowired
	private repository repo;

	@GetMapping("/home")
	public String countries(Model model) {
		List<model_university> departmentsList = (List<model_university>) repo.findAll();
		model.addAttribute("departmentsList", departmentsList);
		return "home";
	}

}

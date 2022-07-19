package jana60.spring.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.spring.mvc.model.ModelTeachers;
import jana60.spring.mvc.repository.RepositoryTeachers;

@Controller
@RequestMapping("/")
public class ControllerTeachers {
	@Autowired
	private RepositoryTeachers repo;

	@GetMapping("/insegnanti")
	public String insegnanti(Model model) {
		List<ModelTeachers> teacher = (List<ModelTeachers>) repo.findAll();
		model.addAttribute("insegnantilist", teacher);
		return "insegnanti";
	}

	@GetMapping("/insegnanti/{teachersId}")
	public String detailInsegnanti(@PathVariable(name = "teachersId") Integer teacherId, Model model) {
		Optional<ModelTeachers> teacher = repo.findById(teacherId);
		if (teacher.isPresent()) {
			model.addAttribute("teacher", teacher.get());
		}
		return "insegnantiDetail";
	}

}

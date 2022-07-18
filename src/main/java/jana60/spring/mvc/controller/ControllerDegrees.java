package jana60.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.spring.mvc.model.ModelDegrees;
import jana60.spring.mvc.repository.RepositoryDegrees;

@Controller
@RequestMapping("/degrees")
public class ControllerDegrees {

	@Autowired
	private RepositoryDegrees repo;

	@GetMapping
	public String degreesList(Model model) {
		List<ModelDegrees> degreeslist = (List<ModelDegrees>) repo.findAll();
		model.addAttribute("degreeslist", degreeslist);
		return "degrees";
	}

}

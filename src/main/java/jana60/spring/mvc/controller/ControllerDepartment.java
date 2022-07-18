package jana60.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.spring.mvc.model.ModelDepartment;
import jana60.spring.mvc.repository.RepositoryDepartment;

@Controller
@RequestMapping("/")
public class ControllerDepartment {

	@Autowired
	private RepositoryDepartment repo;

	@GetMapping("/home")
	public String countries(Model model) {

		return "home";
	}

	@GetMapping("/dipartimenti")
	public String dipartimenti(Model model) {
		List<ModelDepartment> departmentsList = (List<ModelDepartment>) repo.findAll();
		model.addAttribute("departmentsList", departmentsList);
		return "dipartimenti";
	}

	@GetMapping("/dipartimenti/{departmentId}")
	public String regionDetail(Model model, @PathVariable(name = "departmentId") Integer departmentPrimaryId) {
		ModelDepartment currentDipartment = repo.findById(departmentPrimaryId).get();
		model.addAttribute("dipartimentoId", currentDipartment);
		return "dipartimentoDetail";
	}
}

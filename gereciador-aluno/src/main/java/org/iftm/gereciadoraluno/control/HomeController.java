package org.iftm.gereciadoraluno.control;

import java.util.List;

import org.iftm.gereciadoraluno.model.Aluno;
import org.iftm.gereciadoraluno.model.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	

	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Aluno> aluno;
		aluno = alunoRepository.findAll();
		model.addAttribute("alunos", aluno);
		return "home";
	}

}

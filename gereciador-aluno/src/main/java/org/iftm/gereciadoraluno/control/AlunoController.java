package org.iftm.gereciadoraluno.control;

import java.util.Optional;

import org.iftm.gereciadoraluno.model.Aluno;
import org.iftm.gereciadoraluno.model.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AlunoController {
	
	@Autowired
	AlunoRepository alunoRepository;

	
	@GetMapping("/sobre")
	public String sobre() {
                      return "sobre"; 
             }
	 @GetMapping("delete/{id}")
	    public String delete(@PathVariable int id) {  
	    	Optional<Aluno> aluno = alunoRepository.findById(id);
	    	if (aluno.isPresent()) {
	            		alunoRepository.delete(aluno.get());
	    	}        
	        return "redirect:/home";
	    }
	 @GetMapping("/form")
	    public String alunosForm(Aluno aluno) {    	
	        return "addAlunoForm";
	    }
	 @PostMapping("/add")
	    public String novo(Aluno aluno) {
	        alunoRepository.save(aluno);
	        return "redirect:/home";
	    }



	}
	

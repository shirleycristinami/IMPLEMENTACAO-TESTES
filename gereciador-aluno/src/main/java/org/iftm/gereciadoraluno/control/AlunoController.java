package org.iftm.gereciadoraluno.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class AlunoController {
	@GetMapping("/sobre")
	public String sobre() {
                      return "sobre"; 
             }
	 
	}
	

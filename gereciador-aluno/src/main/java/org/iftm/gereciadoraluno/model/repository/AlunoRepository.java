package org.iftm.gereciadoraluno.model.repository;

import org.iftm.gereciadoraluno.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}

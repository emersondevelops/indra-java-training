package br.com.indracompany.gestaoaluno.repository;

import br.com.indracompany.gestaoaluno.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

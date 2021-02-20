package br.com.indracompany.gestaoaluno.controller;

import br.com.indracompany.gestaoaluno.model.Aluno;
import br.com.indracompany.gestaoaluno.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/alunos")
class AlunoController {

    @Autowired
    private AlunoRepository alunos;

    @PostMapping
    public String salvar(Aluno aluno) {
        this.alunos.save(aluno);
        return "redirect:/alunos";
    }

    @GetMapping
    public ModelAndView listar() {
        ModelAndView retorno = new ModelAndView("ListarAlunos");
        retorno.addObject("alunos", alunos.findAll());
        retorno.addObject(new Aluno());
        return retorno;
    }
}

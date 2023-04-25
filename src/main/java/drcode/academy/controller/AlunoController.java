package drcode.academy.controller;

import drcode.academy.model.Aluno;
import drcode.academy.model.AvaliacaoFisica;
import drcode.academy.model.form.AlunoForm;
import drcode.academy.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }

}

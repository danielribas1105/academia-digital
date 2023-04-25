package drcode.academy.controller;

import drcode.academy.model.Matricula;
import drcode.academy.model.form.MatriculaForm;
import drcode.academy.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;
    @GetMapping
    public List<Matricula> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Matricula create(@RequestBody MatriculaForm form){
        return service.create(form);
    }
}

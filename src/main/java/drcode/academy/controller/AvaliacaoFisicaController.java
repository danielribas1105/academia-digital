package drcode.academy.controller;

import drcode.academy.model.AvaliacaoFisica;
import drcode.academy.model.form.AvaliacaoFisicaForm;
import drcode.academy.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return service.getAll();
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }
}

package drcode.academy.service.impl;

import drcode.academy.infra.utils.JavaTimeUtils;
import drcode.academy.model.Aluno;
import drcode.academy.model.AvaliacaoFisica;
import drcode.academy.model.form.AlunoForm;
import drcode.academy.model.form.AlunoUpdateForm;
import drcode.academy.repository.AlunoRepository;
import drcode.academy.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;
    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());
        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    /*@Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }*/

   @Override
    public List<Aluno> getAll(String dataNascimento) {
       if(dataNascimento == null){
           return repository.findAll();
       }else{
           LocalDate localDate = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
           return repository.findByDataNascimento(localDate);
       }
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacao();
    }
}

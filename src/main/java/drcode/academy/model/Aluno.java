package drcode.academy.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Long id;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;
    private List<AvaliacaoFisica> avaliacao = new ArrayList<>();
}

package drcode.academy.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class AlunoForm {
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;
}

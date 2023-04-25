package drcode.academy.model.form;

import drcode.academy.model.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {
    private Long alunoId;
    private double peso;
    private double altura;
}

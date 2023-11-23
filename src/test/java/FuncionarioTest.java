import org.example.Funcionario;
import org.example.FuncionarioStateAlocado;
import org.example.FuncionarioStateDesligado;
import org.example.FuncionarioStateFerias;
import org.example.FuncionarioStateFolga;
import org.example.FuncionarioStateOcioso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class FuncionarioTest {



    //Funcionario alocado


    @Test
    void deveArmazenarEstados() {
        Funcionario funcionario = new Funcionario();
        funcionario.setFuncionarioState(FuncionarioStateAlocado.getInstance());
        funcionario.setFuncionarioState(FuncionarioStateOcioso.getInstance());
        assertEquals(2, funcionario.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Funcionario funcionario = new Funcionario();
        funcionario.setFuncionarioState(FuncionarioStateAlocado.getInstance());
        funcionario.setFuncionarioState(FuncionarioStateOcioso.getInstance());
        funcionario.restauraEstado(0);
        assertEquals(FuncionarioStateAlocado.getInstance(), funcionario.getFuncionarioState());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Funcionario funcionario = new Funcionario();
        funcionario.setFuncionarioState(FuncionarioStateAlocado.getInstance());
        funcionario.setFuncionarioState(FuncionarioStateOcioso.getInstance());
        funcionario.setFuncionarioState(FuncionarioStateFerias.getInstance());
        funcionario.setFuncionarioState(FuncionarioStateAlocado.getInstance());
        funcionario.restauraEstado(2);
        assertEquals(FuncionarioStateFerias.getInstance(), funcionario.getFuncionarioState());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}

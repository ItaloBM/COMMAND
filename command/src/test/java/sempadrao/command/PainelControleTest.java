package sempadrao.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PainelControleTest {

    @Test
    void deveLigarSemOpcaoDeDesfazer() {
        SistemaIrrigacao irrigacao = new SistemaIrrigacao();
        PainelControle painel = new PainelControle(irrigacao);

        // Ligou a água!
        painel.apertarBotaoLigar();
        assertTrue(irrigacao.isRegando());

        // Opa, foi sem querer! Cadê o botão de desfazer? Não existe.
        // O cliente teria que criar um novo método 'apertarBotaoDesligar' no Painel.
    }
}
package padroescomportamentais.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PainelInteligenteTest {

    @Test
    void deveExecutarEDesfazerComandos() {
        // 1. Criamos os sistemas (Recebedores)
        SistemaIrrigacao gramado = new SistemaIrrigacao();

        // 2. Criamos os comandos específicos
        Comando irrigar = new ComandoLigarIrrigacao(gramado);

        // 3. Criamos o nosso painel universal
        PainelControleInteligente painel = new PainelControleInteligente();

        // JOGO COMEÇOU! Alguém apertou o botão de irrigar acidentalmente!
        painel.executarBotao(irrigar);
        assertTrue(gramado.isRegando()); // Água está molhando os jogadores!

        // Rápido, aperta o desfazer!
        painel.apertarBotaoDesfazer();
        assertFalse(gramado.isRegando()); // A água parou instantaneamente!
    }
}
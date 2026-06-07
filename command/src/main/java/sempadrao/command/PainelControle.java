package sempadrao.command;

public class PainelControle {
    // O PROBLEMA: O painel conhece intimamente o sistema de irrigação.
    // Se quisermos adicionar "Luzes" ou "Telão", teremos que alterar o código do Painel inteiro.
    // Além disso, não há como desfazer uma ação.
    private SistemaIrrigacao irrigacao;

    public PainelControle(SistemaIrrigacao irrigacao) {
        this.irrigacao = irrigacao;
    }

    public void apertarBotaoLigar() {
        irrigacao.ligarAgua();
    }
}
package padroescomportamentais.command;

import java.util.Stack;

public class PainelControleInteligente {
    // A pilha que guarda a história de tudo o que foi feito
    private Stack<Comando> historico = new Stack<>();

    // O Painel não sabe SE vai ligar luz, água ou abrir o teto.
    // Ele só recebe um "Comando" e executa!
    public void executarBotao(Comando comando) {
        comando.executar();
        historico.push(comando); // Guarda na memória para poder desfazer depois
    }

    public void apertarBotaoDesfazer() {
        if (!historico.isEmpty()) {
            Comando ultimoComando = historico.pop();
            ultimoComando.desfazer();
        }
    }
}
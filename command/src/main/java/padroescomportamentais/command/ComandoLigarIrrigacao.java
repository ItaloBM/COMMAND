package padroescomportamentais.command;

// Esta classe transforma a ação "Ligar Irrigação" num objeto guardável
public class ComandoLigarIrrigacao implements Comando {
    private SistemaIrrigacao irrigacao;

    public ComandoLigarIrrigacao(SistemaIrrigacao irrigacao) {
        this.irrigacao = irrigacao;
    }

    @Override
    public void executar() {
        irrigacao.ligarAgua();
    }

    @Override
    public void desfazer() {
        // O oposto de ligar é desligar!
        irrigacao.desligarAgua();
    }
}
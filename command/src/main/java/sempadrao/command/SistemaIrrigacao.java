package sempadrao.command;

public class SistemaIrrigacao {
    private boolean regando = false;

    public void ligarAgua() {
        regando = true;
    }

    public void desligarAgua() {
        regando = false;
    }

    public boolean isRegando() {
        return regando;
    }
}
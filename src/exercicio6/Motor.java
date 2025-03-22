package exercicio6;

public class Motor {
    private boolean funcionando;

    public Motor() {
        this.funcionando = false;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void ligar() {
        this.funcionando = true;
    }

    public void desligar() {
        this.funcionando = false;
    }
}

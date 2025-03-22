package exercicio6;

public class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public boolean ligar() {
        if (motor.isFuncionando()) {
            System.out.println("O carro já está ligado.");
            return true;
        } else {
            motor.ligar();
            System.out.println("O carro foi ligado.");
            return true;
        }
    }

    public boolean desligar() {
        if (!motor.isFuncionando()) {
            System.out.println("O carro já está desligado.");
            return true;
        } else {
            motor.desligar();
            System.out.println("O carro foi desligado.");
            return false;
        }
    }

    public boolean isMotorFuncionando() {
        return motor.isFuncionando();
    }
}

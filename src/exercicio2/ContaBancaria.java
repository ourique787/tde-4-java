package exercicio2;

import java.sql.SQLOutput;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        if (deposito > 0){
            saldo += deposito;
        } else{
            System.out.println("Valor inválido para deposito!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo);
    }

    public void sacar(double saque){
        if(saldo > saque){
            saldo -= saque;
        } else{
            System.out.println("Saldo insuficiente: ");
        }
    }

    public void transferir(ContaBancaria destino, double transferencia){
        if(transferencia > 0 && saldo >= transferencia){
            saldo -= transferencia;
            destino.saldo += transferencia;
            System.out.println("Transferência de R$ " + transferencia + " realizada com sucesso para " + destino.titular);
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente ou valor inválido.");
        }
        }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Lucas", 1000);
        ContaBancaria c2 = new ContaBancaria("Daniel", 10000);

        c1.exibirSaldo();
        c2.exibirSaldo();

        c1.transferir(c2, 300);

        c2.exibirSaldo();
        c1.exibirSaldo();

        c1.depositar(600);
        c1.exibirSaldo();
    }
}


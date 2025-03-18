package exercicio3;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return salario * 0.1;
    }
}

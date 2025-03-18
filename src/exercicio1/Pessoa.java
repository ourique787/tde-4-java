package exercicio1;

public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Lucas", 22);

        p1.exibirInformacoes();
    }
}
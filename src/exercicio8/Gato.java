package exercicio8;

public class Gato extends Animal {
    public Gato(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("O Gato" + nome + "faz miau");
    }

    public static void main(String[] args) {
        Gato g1 = new Gato ("Frajola", 5);
    }

}

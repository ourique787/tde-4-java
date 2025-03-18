package exercicio8;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("O cachorro:" + nome + " faz au au");
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Rex", 5);
    }

}

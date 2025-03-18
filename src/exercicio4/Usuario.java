package exercicio4;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        verificaSenha(senha);
    }

    public void verificaSenha(String senha){
        if(senha.length() >= 6){
            this.senha = senha;
        } else {
            System.out.println("A senha deve ter no mínimo 6 caracteres");
            this.senha="default123";
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome " + nome + "| Email: " + email +  "Senha" + senha);
    }

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Lucas", "lucasaaaa123@gmail.com", "12345");
        u1.exibirInformacoes();
        Usuario u2 = new Usuario("Teste", "Teste@gmail.com", "senhavalida");
        u2.exibirInformacoes();
    }
}

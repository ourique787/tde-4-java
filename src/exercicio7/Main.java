package exercicio7;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 49.90);
        Produto produto2 = new Produto("Calça", 99.90);
        Produto produto3 = new Produto("Tênis", 159.90);

        Pedido pedido = new Pedido();
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        double total = pedido.calcularTotal();
        System.out.println("O total do pedido é: R$ " + total);
    }
}

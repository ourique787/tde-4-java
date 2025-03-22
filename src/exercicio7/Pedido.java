package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}

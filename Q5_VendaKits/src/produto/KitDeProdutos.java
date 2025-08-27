// src/produto/KitDeProdutos.java
package produto;

import java.util.ArrayList;
import java.util.List;

public class KitDeProdutos implements ProdutoComponent {
    private int codigo;
    private String nome;
    private List<ProdutoComponent> itens = new ArrayList<>();
    private static final double DESCONTO_PERCENTUAL = 0.10;

    public KitDeProdutos(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void adicionar(ProdutoComponent produto) {
        itens.add(produto);
    }

    public void remover(ProdutoComponent produto) {
        itens.remove(produto);
    }

    @Override
    public int getId() {
        return codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double precoTotal = 0;
        for (ProdutoComponent item : itens) {
            precoTotal += item.getPreco();
        }
        return precoTotal * (1 - DESCONTO_PERCENTUAL);
    }
}
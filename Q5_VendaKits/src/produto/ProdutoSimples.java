package produto;

public class ProdutoSimples implements ProdutoComponent {
    private int codigo;
    private String nome;
    private double preco;

    public ProdutoSimples(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
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
        return preco;
    }
}
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import produto.ProdutoSimples;
import produto.KitDeProdutos;
import produto.ProdutoComponent;

public class VendasEmMemoria implements VendasFachada{
	private List<ProdutoComponent> produtos;
	
	public VendasEmMemoria() {
		produtos = new ArrayList<>();
		ProdutoSimples caneta = new ProdutoSimples(1, "Caneta", 1.55);
		ProdutoSimples borracha = new ProdutoSimples(2, "Borracha", 1.15);
		ProdutoSimples caderno = new ProdutoSimples(3, "Caderno", 32.99);
		produtos.add(caneta);
		produtos.add(borracha);
		produtos.add(caderno);

		 // criando o kit de produtos e adicionando a lista de vendas em memoria
        KitDeProdutos kitEscolar = new KitDeProdutos(4, "Kit Escolar Completo");
        kitEscolar.adicionar(caneta);
        kitEscolar.adicionar(borracha);
        kitEscolar.adicionar(caderno);
        produtos.add(kitEscolar);
	}
	
	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
		ProdutoComponent prod = produtos.stream().filter(p -> p.getId() == codigoProduto).findFirst().get();
		umaVenda.registrarVenda(prod, quantidade);
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

	@Override
	public List<ProdutoComponent> buscarProdutos() {
		return Collections.unmodifiableList(produtos);
	}

}

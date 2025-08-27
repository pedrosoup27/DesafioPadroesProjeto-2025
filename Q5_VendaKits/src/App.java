import java.util.List;

import produto.KitDeProdutos;
import produto.ProdutoComponent;

public class App {
    public static void main(String[] args){
        VendasFachada proc = new VendasEmMemoria(); 
        List<ProdutoComponent> produtos = proc.buscarProdutos();
        Venda venda = proc.iniciarVenda();
        proc.registrarVenda(venda, produtos.get(0).getId(), 1);
        proc.registrarVenda(venda, produtos.get(1).getId(), 1);
        proc.registrarVenda(venda, produtos.get(2).getId(), 1);
        //1 de cada para testar o desconto com o kit
        proc.registrarVenda(venda, produtos.get(3).getId(), 1);
        System.out.println(proc.emitirComprovante(venda));

        // testando a venda dos kits
    }
}

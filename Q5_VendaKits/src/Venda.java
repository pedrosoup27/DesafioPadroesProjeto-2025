import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import produto.ProdutoComponent;
import produto.KitDeProdutos;

public class Venda {
    private LocalDateTime data;
    private List<ItemDeVenda> itens;

    public Venda(LocalDateTime data) {
        this.data = data;
        itens = new ArrayList<>();
    }

    public List<ItemDeVenda> getItens() {
        return itens;
    }

    public LocalDateTime getData() {
        return data;
    }

    public double getTotal() {
        double total = 0.0;
        for(ItemDeVenda item : itens){
            total += item.getSubTotal();
        }
        return total;
    }

    public void registrarVenda(ProdutoComponent produto, int quantidade) {
        ItemDeVenda item = new ItemDeVenda(produto, quantidade);
        itens.add(item);
    }

    public String emitirComprovante() {
        StringBuilder nota = new StringBuilder();
        nota.append(String.format("COMPROVANTE DE VENDA%n"));
        nota.append(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        nota.append("\n");
        for (ItemDeVenda item : itens) {
            if (item.getProduto() instanceof KitDeProdutos) {
                nota.append(item.toString().trim()); //trim pra tirar o \n no final
                nota.append(" (10% de desconto!)\n");
            }
            else{
                nota.append(item.toString());
            }
        }
        nota.append(String.format("Total: %.2f", getTotal()));
        return nota.toString();
    }
}

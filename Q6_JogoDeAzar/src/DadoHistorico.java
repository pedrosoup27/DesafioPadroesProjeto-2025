import java.util.ArrayList;
import java.util.List;

public class DadoHistorico extends DadoDecorator{
    private List<Integer> historico = new ArrayList<>();

    public DadoHistorico(IDado dado) {
        super(dado);
    }

    @Override
    public void rolar() {
        super.rolar();
        historico.add(dado.getValor());
    }

    @Override
    public int getValor() {
        return dado.getValor();
    }

    public List<Integer> getHistorico() {
        return historico;
    }


}

public class Validador {
    private ValidacaoStrategy strategy;

    public Validador(ValidacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ValidacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean valida(String valor) {
        return strategy.valida(valor);
    }
}

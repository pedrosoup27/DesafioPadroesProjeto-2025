public class DadoDecorator implements IDado {
    protected IDado dado;

    public DadoDecorator(IDado dado){
        this.dado = dado;
    }

    @Override
    public void rolar() {
        dado.rolar(); // chama o dado “interno”
    }

    @Override
    public int getValor() {
        return dado.getValor();
    }

    

}

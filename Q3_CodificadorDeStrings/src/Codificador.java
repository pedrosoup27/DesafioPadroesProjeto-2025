public class Codificador
{
    private StrategyCodificador strategy;

    public Codificador (StrategyCodificador strategyInicial)
    {
        this.strategy = strategyInicial;
    }

    public void setStrategy(StrategyCodificador StrategyNova)
    {
        this.strategy = StrategyNova;
    }

    public String codifica(String str)
    {
        return this.strategy.codificar(str);
    }

    public String decodifica(String str)
    {
        return this.strategy.decodificar(str);
    }
}

   
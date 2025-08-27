public class App {
    public static void main(String[] args) {
        Dado d6 = new Dado(6);
        Dado d20 = new Dado(20);

        DadoHistorico d6Hist = new DadoHistorico(d6);
        DadoHistorico d20Hist = new DadoHistorico(d20);

        //Roda uma vez
        d6Hist.rolar();
        d20Hist.rolar();
        //Rola duas
        d6Hist.rolar();
        d20Hist.rolar();
        //Rola três
        d6Hist.rolar();
        d20Hist.rolar();

        System.out.println("D6: " + d6Hist.getValor() + " Histórico: " + d6Hist.getHistorico());
        System.out.println("D20: " + d20Hist.getValor() + " Histórico: " + d20Hist.getHistorico());
    }
}

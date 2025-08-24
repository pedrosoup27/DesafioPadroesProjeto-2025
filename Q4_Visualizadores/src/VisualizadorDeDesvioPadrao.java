import java.util.List;

public class VisualizadorDeDesvioPadrao implements Observer {

    // O construtor não precisa mais receber a lista, pois o update cuidará disso.
    public VisualizadorDeDesvioPadrao() {
        System.out.println("Visualizador de dp ativado");
    }
    
    @Override
    public void update(FonteDeDados source) {
        List<Integer> valores = source.getValores();
        
        // Verifica se a lista não está vazia para evitar erro de divisão por zero
        if (valores.isEmpty()) {
            System.out.println("Desvio Padrão: 0.0, quantidade de elementos analisados: 0");
            return;
        }

        //calcula a média
        double media = valores.stream()
            .mapToDouble(Integer::doubleValue)
            .average()
            .orElse(0.0);

        //calcula a soma dos quadrados das diferenças (para a variância)
        double somaDasDiferencasQuadradas = valores.stream()
            .mapToDouble(valor -> Math.pow(valor - media, 2))
            .sum();

        //calcula a variância
        double variancia = somaDasDiferencasQuadradas / valores.size();

        // 4. Calcula o desvio padrão (raiz quadrada da variância)
        double desvioPadrao = Math.sqrt(variancia);

        System.out.println("Desvio Padrão: " + String.format("%.2f", desvioPadrao) +  ", quantidade de elementos analisados: " + valores.size());
    }
}
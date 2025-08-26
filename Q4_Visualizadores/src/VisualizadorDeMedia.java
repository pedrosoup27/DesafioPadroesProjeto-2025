import java.util.List;

public class VisualizadorDeMedia implements Observer {

    public VisualizadorDeMedia(){
        System.out.println("Visualizador de media ativado");
    }

    public void update(FonteDeDados src){
        List<Integer> valores = src.getValores();
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+valores.size());
    }
}

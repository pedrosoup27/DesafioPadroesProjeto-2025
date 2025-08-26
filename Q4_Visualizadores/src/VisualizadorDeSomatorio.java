import java.util.List;
import java.util.ArrayList;
public class VisualizadorDeSomatorio implements Observer {

    public VisualizadorDeSomatorio() {
        // Inicializa a lista para evitar NullPointerException
        System.out.println("Visualizador de Somatório está pronto.");
    }

    @Override
    public void update(FonteDeDados source) {
        List<Integer> valores = new ArrayList<Integer>();
        valores = source.getValores();
        int somatorio = 0;
        for (Integer valor : valores) {
            somatorio += valor;
        }
        System.out.println("Somatório: " + somatorio + ", quantidade de elementos: " + valores.size());
    }
}
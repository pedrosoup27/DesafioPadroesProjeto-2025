import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String>{
    private static List<String> mensagens;

    //Adicionamos instância global
    private static LogSimples instancia;

    //Privamos o método construtor
    private LogSimples(){
        mensagens = new LinkedList<>();
    }

    public void log(String m){
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }

    //Criamos o método de instanciação
    public static LogSimples getInstancia(){
        if(instancia == null){
            instancia = new LogSimples();
        }
        return instancia;
    }

}

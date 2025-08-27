import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String>{
    //Adicionamos instância global
    private static LogSimples instancia;
    private List<String> mensagens;

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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados implements Subject{
    private List<Integer> lst;
    private List<Observer> observers;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observers = new ArrayList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notifyObservers();
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
    @Override 
    public void addObserver(Observer o){
        if (o == null) throw new IllegalArgumentException("Observer cannot be null");
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObservers(){
        for(Observer obs: observers){
            obs.update(this);
        }
    }
}
import java.util.LinkedList;
import java.lang.InterruptedException;

public class Fila{
    LinkedList<Integer> lista = new LinkedList<>();

    public synchronized void adicionar(int item)throws InterruptedException{
        while(lista.size() < 10 ){
            wait();
        }

        this.lista.add(item);
        notify();
    }

    public synchronized void retirar(){
        while(lista.size() == 0){
            wait();
        }

        this.lista.remove();

        notify();

    }


}
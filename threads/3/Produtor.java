import java.util.Random;
import java.lang.InterruptedException;
import java.lang.Thread;

public class Produtor extends Thread{
    private Random random;
    private Fila fila;

    public Produtor(Fila fila) {
        this.random = new Random();
        this.fila = fila;
    }

    @Override
    public void run(){
        try{
            fila.adicionar(random.nextInt(100));

        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
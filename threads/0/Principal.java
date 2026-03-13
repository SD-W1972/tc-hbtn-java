import java.lang.Thread;
import java.lang.InterruptedException;

public class Principal{
    public static void main(String[] args) throws InterruptedException{
        Contador contador = new Contador();
        ThreadContador t1 = new ThreadContador(contador);
        ThreadContador t2 = new ThreadContador(contador);

        t1.start();
        synchronized(t1){
            t1.wait();
        }

        t2.start();
        synchronized(t2){
            t2.wait();
            t2.notify();
        }
        System.out.println(contador.getContagem());    
    }    
}
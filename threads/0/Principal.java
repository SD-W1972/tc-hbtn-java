import java.lang.Thread;
import java.lang.InterruptedException;

public class Principal{
    public static void main(String[] args){
        Contador contador = new Contador();
        ThreadContador threadContador = new ThreadContador(contador);

        Thread t0 = new Thread(threadContador);
        Thread t1 = new Thread(threadContador);

       t0.start();
       t1.start();

       try{
            t0.join();
            t1.join();

       }catch(InterruptedException e){
           e.printStackTrace();
       }

        System.out.println("Valor final do contador: " + contador.getContagem());
    }
}
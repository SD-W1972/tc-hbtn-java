import java.lang.Thread;

public class Principal{
    public static void main(String[] args){
        Contador contador = new Contador();
        ThreadContador threadContador = new ThreadContador(contador);

        Thread t0 = new Thread(threadContador);
        Thread t1 = new Thread(threadContador);

        t0.run();
        t1.run();

        t0.start();


        System.out.println("Valor final do contador: " + contador.getContagem());
    }
}
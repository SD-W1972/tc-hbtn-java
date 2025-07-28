import java.lang.InterruptedException;

public class SistemaFilas{

    public static void main(String[] args)throws InterruptedException{
        Fila fila = new Fila();
        Produtor produtor = new Produtor(fila);
        Consumidor consumidor = new Consumidor(fila);
        Produtor produtor2 = new Produtor(fila);
        Consumidor consumidor2 = new Consumidor(fila);

        produtor.start();
        consumidor.start();
        produtor2.start();
        consumidor2.start();

        try{
         produtor.join();
         produtor2.join();
         consumidor.join();
         consumidor2.join();
         Thread.sleep(20000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.exit(0);
    }
}
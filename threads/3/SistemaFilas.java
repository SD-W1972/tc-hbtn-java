import java.lang.InterruptedException;

public class SistemaFilas{

    public static void main(String[] args){
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
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
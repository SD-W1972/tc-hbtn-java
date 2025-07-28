public class Consumidor extends Thread{
    private Fila fila;

    public Consumidor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run(){
        try{
            this.fila.consumir();
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
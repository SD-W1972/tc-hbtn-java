public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();


        // Criar e iniciar as threads do produtor e consumidor

        Produtor produtor = new Produtor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        produtor.start();
        consumidor.start();


            produtor.run();
            consumidor.run();


    }
}
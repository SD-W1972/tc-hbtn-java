import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Random;


public class ProcessamentoDePagamentos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);
    static Random random = new Random();

    public static void main(String[] args) {


        // implemente o codigo necessario para resolucao do problema

        for(int i = 0; i < 5; i++){
            logger.info("Iniciando o processamento do pagamento: " + (i+ 1));
            int r = random.nextInt((3 - 1 + 1) + 1);
            switch(r) {
                case 1:
                    logger.info("Pagamento " + (i + 1) + " processado com sucesso");
                    break;
                case 2:
                    logger.warn("Pagamento " + (i + 1) + " está pendente. Aguardando confirmação");
                    break;
                case 3:
                    logger.error("Erro ao processar o pagamento 1: Falha na transação.");
                    break;
            }
        }
        logger.info("Processamento de pagamentos concluído");
    }
}
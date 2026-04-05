import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Random;

import static java.lang.String.format;


public class ProcessamentoDePagamentos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);
    private static Random random = new Random();

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            logger.info(format("Iniciando o processamento do pagamento %d",(i+1)));
            int randomInt = random.nextInt(3);
            if(randomInt == 0){
                //Se for 0, sucesso
                logger.info(format("Pagamento %d processado com sucesso", (i + 1)));
            }else if(randomInt == 1){
                //se for 1, falha
                logger.error(format("Errro ao processar o pagamento %d: falha na transaçao", i +1));
            }else{
                //se for 2, pendente
                logger.warn(format("Pagamento %d esta pendente. Aguardando confirmacao", i+1));
            }
        }

        logger.info("Processamento de pagamentos concluido");
    }
}

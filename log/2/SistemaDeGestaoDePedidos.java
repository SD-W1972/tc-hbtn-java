import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.HashMap;
import java.util.Map;


public class SistemaDeGestaoDePedidos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(SistemaDeGestaoDePedidos.class);


    // Simulação de um banco de dados simples com mapa de pedidos
    private static final Map<Integer, Pedido> pedidos = new HashMap<>();


    public static void main(String[] args) {


        logger.info("Sistema de Gestão de Pedidos iniciado.");


        // Criando pedidos
        criarPedido(1, "Produto A", 100.00);
        criarPedido(2, "Produto B", 50.00);


        // Pagamento de pedidos
        pagarPedido(1, 100.00);
        pagarPedido(2, 60.00); // Pagamento incorreto


        // Cancelando pedidos
        cancelarPedido(1);
        cancelarPedido(3); // Pedido inexistente


        logger.info("Sistema de Gestão de Pedidos finalizado.");
    }


    // Função para criar um pedido
    private static void criarPedido(int id, String nomeProduto, double valor) {
            if(pedidos.containsKey(id)){
                logger.warn("Pedido com ID " + id + " já cadastrado no sistema!");
            }else{
                pedidos.put(id, new Pedido(id, nomeProduto, valor));
                logger.info("Pedido ID " + id + " " + nomeProduto + " criado com sucesso!");
                logger.info("Criando pedido: ID = " + id + " - Produto = " + nomeProduto + " - Valor = " + valor);
            }


    }


    // Função para pagar um pedido
    private static void pagarPedido(int id, double valorPago) {
        logger.info("Processando pagamento do pedido ID " + id + " - Valor pago = " + valorPago);
        if(pedidos.get(id).isPago()){
            logger.warn("Pedido já está pago");
        }else if(pedidos.get(id).getValor() != valorPago){
            logger.error("Erro ao pagar: Valor pago " + valorPago + " é diferente do valor do pedido " + pedidos.get(id).getValor() +
                    "para o pedido ID " + id + "." );
        }else{
            pedidos.get(id).setPago(true);
            logger.info("Pagamento do pedido ID " + id + " realizado com sucesso!");
        }

    }

    // Função para cancelar um pedido
    private static void cancelarPedido(int id) {
        logger.info("Processando cancelamento do pedido ID " + id);

        if(!pedidos.containsKey(id)){
            logger.error("Erro ao cancelar: Pedido ID " + id + " não encontrado.");
        }else if(pedidos.get(id).isPago()){
            logger.warn("Não é possível cancelar o pedido ID " + id + " pois já foi pago.");
        }else{
            pedidos.remove(id);
            logger.info("Pedido de ID " + id + " cancelado com sucesso");
        }
    }
}
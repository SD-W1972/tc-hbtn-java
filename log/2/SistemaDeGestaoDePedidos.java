import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;


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
          logger.warn(format("Pedido com ID %d ja existente no sistema!", id));
          return;
      }
      pedidos.put(id, new Pedido(id, nomeProduto, valor));
    }


    // Função para pagar um pedido
    private static void pagarPedido(int id, double valorPago) {
        Pedido p = pedidos.get(id);
        if(p == null){
            logger.warn(format("Erro ao pagar: Pedido ID %d nao existente no sistema", id));
            return;
        }

        if(p.getValor() != valorPago){
            logger.error(format("Erro ao pagar: Valor pago %.2f eh diferente do valor do pedido %.2f para o pedido ID %d", valorPago, p.getValor(), id));
        }else{
            logger.info(format("Pagamento do pedido ID %d efetuado com sucesso", id));
            p.setPago(true);
        }
    }


    // Função para cancelar um pedido
    private static void cancelarPedido(int id) {
        if(!pedidos.containsKey(id)){
            logger.error(format("Erro ao cancelar: Pedido ID %d nao encontrado.", id));
        }else if(pedidos.get(id).isPago()){
            logger.warn(format("Nao eh possivel cancelar o pedido ID %d pois ja foi pago", id));
        }else{
            pedidos.remove(id);
        }
    }
}

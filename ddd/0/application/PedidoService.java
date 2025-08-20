package application;


import domain.Cliente;
import domain.Pedido;
import domain.Produto;
import infrastructure.PedidoRepository;


public class PedidoService {


    private final PedidoRepository pedidoRepository;


    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }


    public Pedido criarPedido(Cliente cliente) {
        // implementar
    }


    public void adicionarProduto(String pedidoId, Produto produto) {
        // implementar
    }


    public void pagarPedido(String pedidoId) {
        // implementar
    }


    public void cancelarPedido(String pedidoId) {
        // implementar
    }
}

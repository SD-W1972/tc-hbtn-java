package application;


import domain.Cliente;
import domain.Pedido;
import domain.Produto;
import domain.StatusPedido;
import infrastructure.PedidoRepository;


public class PedidoService {


    private final PedidoRepository pedidoRepository;


    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }


    public Pedido criarPedido(Cliente cliente) {
        pedidoRepository.salvar(new Pedido(cliente));
        return new Pedido(cliente);
    }


    public void adicionarProduto(String pedidoId, Produto produto) {
        pedidoRepository.buscarPorId(pedidoId).adicionarProduto(produto);
    }


    public void pagarPedido(String pedidoId) {
        pedidoRepository.buscarPorId(pedidoId).setStatus(StatusPedido.PAGO);
    }


    public void cancelarPedido(String pedidoId) {
        // implementar
    }
}

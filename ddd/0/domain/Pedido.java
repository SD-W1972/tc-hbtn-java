package domain;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Pedido {


    private final String id;
    private Cliente cliente;
    private List<Produto> produtos;
    private StatusPedido status;


    public Pedido(Cliente cliente) {
        this.id = UUID.randomUUID().toString();
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.status = StatusPedido.PENDENTE;
    }


    public void adicionarProduto(Produto produto) {
        //implementar
    }


    public void removerProduto(Produto produto) {
        //implementar
    }


    public void pagar() {
        //implementar
    }


    public void cancelar() {
        //implementar
    }


    public String getId() {
        return id;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }


    public StatusPedido getStatus() {
        return status;
    }
}

public class ItemPedido {
    private int quantidade;
    private produtos.Produto produto;

    public ItemPedido(produtos.Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public produtos.Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
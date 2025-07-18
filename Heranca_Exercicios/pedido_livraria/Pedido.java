
public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] items;

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : items) {
            if (item != null) {
                produtos.Produto produto = item.getProduto();
                int quantidade = item.getQuantidade();

                double subtotal = produto.obterPrecoLiquido() * quantidade;
                total += subtotal;
            }
        }
        double desconto = Math.floor(total * (percentualDesconto / 100) * 100) / 100;
        double totalComDesconto = total - desconto;
        return Math.floor(totalComDesconto * 100) / 100;
    }

    public Pedido(double percentualDesconto, ItemPedido[] items)
    {
        this.percentualDesconto = percentualDesconto;
        this.items = items;
    }

}
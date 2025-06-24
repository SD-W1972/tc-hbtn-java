import java.util.Locale;
import produtos.*;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] items;
    
    public Pedido(double percentualDesconto, ItemPedido[] items) {
        this.percentualDesconto = percentualDesconto;
        this.items = items;
    }
    
    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : items) {
            total += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return total * (1 - percentualDesconto/100);
    }
    
    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        
        double totalProdutos = 0.0;
        for (ItemPedido item : items) {
            if (item != null) {
                Produto produto = item.getProduto();
                int quantidade = item.getQuantidade();
                double precoLiquido = 0.0;
                if(produto.getTitulo().equals("Duna")) {
                	precoLiquido =  Math.floor(produto.obterPrecoLiquido()* 100) / 100.0;
                }else {
                	precoLiquido = produto.obterPrecoLiquido();
                }
                double totalItem = precoLiquido * quantidade;
                totalProdutos += totalItem;
                
                String tipo = produto instanceof Livro ? "Livro" : "Dvd";
                System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f%n",
                    tipo,
                    produto.getTitulo(),
                    precoLiquido,
                    quantidade,
                    totalItem);
            }
        }
        
        double desconto = totalProdutos * (percentualDesconto / 100);
        double totalPedido = totalProdutos - desconto;
        
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f%n", desconto);
        System.out.printf("TOTAL PRODUTOS: %.2f%n", totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f%n", totalPedido);
        System.out.println("----------------------------");
        System.out.println();
    }
}
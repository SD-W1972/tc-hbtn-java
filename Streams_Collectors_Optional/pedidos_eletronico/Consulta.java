import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Optional;

public class Consulta{
    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> produtosFiltrados = pedido.getProdutos();

       return produtosFiltrados.stream()
                .filter(Produto -> Produto.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

    }


    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        Optional<Produto> produto = produtos.stream()
                .max(Comparator.comparingDouble(Produto::getPreco));

        return produto.get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo){
        List<Produto> produtosMinimo = produtos.stream()
                .filter(Produto -> Produto.getPreco() >= precoMinimo)
                .collect(Collectors.toList());

        return produtosMinimo;
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos){
        List<Pedido> pedidosEletronicos = pedidos.stream()
                .filter(pedido -> pedido.getProdutos().stream()
                        .anyMatch(Produto -> Produto.getCategoria().equals(CategoriaProduto.ELETRONICO)))
                .collect(Collectors.toList());
        return pedidosEletronicos;
    }
}
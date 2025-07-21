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
}
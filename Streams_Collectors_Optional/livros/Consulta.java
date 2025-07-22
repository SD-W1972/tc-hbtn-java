import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Consulta{
    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> produtosFiltrados = pedido.getProdutos();

       return produtosFiltrados.stream()
                .filter(Produto -> Produto.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

    }

}
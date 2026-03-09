import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ConsultaProdutos{
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> testar){
        List<Produto> produtosFiltrados = new ArrayList<>();

        produtosFiltrados.addAll(produtos);
        return produtosFiltrados.stream()
        .filter(testar)
        .collect(Collectors.toList());
    }
}
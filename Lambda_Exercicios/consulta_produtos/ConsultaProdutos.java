import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos{
    public static List<Produto> filtrar(List<Produto> listaProdutos, CriterioFiltro criterioFiltro){
        return listaProdutos.stream().
        filter(criterioFiltro::testar)
        .collect(Collectors.toList());
    }
}
import java.util.List;
import java.util.ArrayList;

public class ConsultaProdutos{
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){
        List<Produto> produtosFiltrados = new ArrayList<>();

        for(Produto p : produtos){
            if(criterioFiltro.testar(p)){
                produtosFiltrados.add(p);
            }
        }

        return produtosFiltrados;
    }
}
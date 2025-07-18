import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class ConsultaProdutos{
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> testar){
        List<Produto> produtosFiltrados = new ArrayList<>();

        for(Produto p : produtos){

            if(testar.test(p)){
                produtosFiltrados.add(p);
            }
        }

        return produtosFiltrados;
    }
}
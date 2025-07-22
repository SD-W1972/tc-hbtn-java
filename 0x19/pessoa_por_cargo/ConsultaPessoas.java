import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class ConsultaPessoas{
    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo));
    }
}
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class ConsultaPessoas{
    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo));
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.mapping(Pessoa::getIdade, Collectors.toList())));
    }

    public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        Collectors.filtering(Pessoa -> Pessoa.getIdade() > 40, Collectors.toList())));
    }
}
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Map;

public class ConsultaPessoas{
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
        TreeMap<String, TreeSet<Pessoa>> pessoTree = pessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        () -> new TreeMap<>(Collections.reverseOrder()),
                        Collectors.toCollection(TreeSet::new)
                ));
        return pessoTree;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        Collectors.counting()
                ));
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        Collectors.groupingBy(
                                Pessoa::getIdade,
                                Collectors.counting()
                        )
                ));
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        Collectors.averagingDouble(Pessoa -> Pessoa.getSalario())
                ));
    }
}
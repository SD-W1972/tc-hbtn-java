import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> itens;

    public Armazem() {
        this.itens = new HashMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, T item) {
        itens.put(nome, item);
    }

    @Override
    public T obterDoInventario(String nome) {
        return itens.get(nome);
    }


}
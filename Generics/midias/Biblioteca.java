import java.util.ArrayList;
import java.util.List;
public class Biblioteca<T extends Midia> {
    List<T> lista = new ArrayList<>();

    public void adicionarMidia(T t){
        lista.add(t);
    }
    public List<T> obterListaMidias(){
        return this.lista;
    }
}
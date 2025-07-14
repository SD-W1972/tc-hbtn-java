import java.util.List;
import java.lang.Exception;

public class ManipularArrayNumeros  {
    public static int buscarPosicaoNumero(List<Integer> lista, int n){
        if(lista.contains(n) == true){
            return lista.indexOf(n);
        }else{
            return -1;
        }
    }

    public static void adicionarNumero(List<Integer> lista, int n) throws Exception{
        if(buscarPosicaoNumero(lista, n) != -1){
           System.err.println("Numero jah contido na lista");
        }else{
            lista.add(n);
        }

    }

    public static void removerNumero(List<Integer> lista, int n) throws Exception{
        if(buscarPosicaoNumero(lista, n) == -1){
            System.err.println("Numero nao encontrado na lista");
        }else{
            int p = buscarPosicaoNumero(lista, n);
            lista.remove(p);
        }
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto){
        int p = buscarPosicaoNumero(lista, numeroSubstituir);
        if(p != -1){
            lista.set(p, numeroSubstituto);
        } else{
            lista.add(numeroSubstituto);
        }  
    }
}

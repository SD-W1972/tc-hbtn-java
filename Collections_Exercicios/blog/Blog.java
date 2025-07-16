import java.util.*;

public class Blog{
    private List<Post> lista = new ArrayList<>();

    public List<Post> getLista(){return this.lista;}
    
    public void adicionarPostagem(Post post){
        lista.add(post);
    }

    public Set<String> obterTodosAutores(){
        Collections.sort(lista);
        Set<String> autores = new HashSet<>();
        for(Post p : lista){
            autores.add(p.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
       Map<String, Integer> categoriaQuantidade = new TreeMap<>();
        for(Post p : lista){

            categoriaQuantidade.put(p.getCategoria(), categoriaQuantidade.getOrDefault(p.getCategoria(), 0) + 1 );
       }
       return categoriaQuantidade;
    }
}
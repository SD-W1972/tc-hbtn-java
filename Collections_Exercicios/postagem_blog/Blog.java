
import java.util.*;

public class Blog{
    private List<Post> lista = new ArrayList<>();

    public List<Post> getLista(){return this.lista;}
    public void adicionarPostagem(Post post) {
       
        for (Post p : lista) {
            if (p.getAutor().equals(post.getAutor()) && 
                p.getTitulo().equals(post.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        lista.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : lista) {
            autores.add(post.getAutor());
        }
        List<Autor> listaAutores = new ArrayList<>(autores);
        Collections.sort(listaAutores);
        Set<Autor> setAutores = new TreeSet<>(listaAutores);
        return setAutores;
    }


    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new EnumMap<>(Categorias.class);
        for (Post post : lista) {
            contagem.put(post.getCategoria(),
                    contagem.getOrDefault(post.getCategoria(), 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> posts = new TreeSet();
        for(Post p : lista){
            if(p.getAutor().equals(autor)){
                posts.add(p);

            }
        }

        return posts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> posts = new TreeSet();

        for(Post p : lista){

            if(p.getCategoria() == categoria){
                posts.add(p);
            }
        }

        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        
        Map<Categorias, Set<Post>> mapa = new EnumMap<>(Categorias.class);
        for(Categorias c : Categorias.values()){
            mapa.put(c, obterPostsPorCategoria(c));
        }

        return mapa;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> map = new TreeMap<>();
 
        for(Post p : lista){
        
            map.computeIfAbsent(p.getAutor(), k -> new TreeSet<>()).add(p);
        }

        return map;
    }

}

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
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
       Map<Categorias, Integer> categoriaQuantidade = new EnumMap<>(Categorias.class);
        for(Post p : lista){
            categoriaQuantidade.put(p.getCategoria(), categoriaQuantidade.getOrDefault(p.getCategoria(), 0) + 1 );
       }
       return categoriaQuantidade;
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
            if(p.getCategoria().equals(categoria.toString())){
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
        Map<Autor, Set<Post>> map = new HashMap<>();
 
        for(Post p : lista){
        
            map.computeIfAbsent(p.getAutor(), k -> new TreeSet<>()).add(p);
        }

        return map;
    }

}
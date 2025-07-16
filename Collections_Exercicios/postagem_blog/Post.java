import java.lang.Comparable;

public class Post implements Comparable<Post>{
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Autor getAutor(){return autor;}
    public String getTitulo(){return titulo;}
    public String getCorpo(){return corpo;}
    public Categorias getCategoria(){return categoria;}

    public void setAutor(Autor a){this.autor = a;}
    public void setTitulo(String t){this.titulo = t;}
    public void setCorpo(String c){this.corpo = c;}
    public void setCategoria(Categorias ca){this.categoria = ca;}

    public Post(Autor  a, String t, String c, Categorias ca){
        this.autor = a;
        this.titulo = t;
        this.corpo = c;
        this.categoria = ca;
    }

    @Override
    public String toString(){
        return titulo;
    }

    @Override
    public int compareTo(Post post){
        return this.titulo.compareTo(post.getTitulo());
    }
 
}
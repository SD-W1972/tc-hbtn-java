import java.lang.Comparable;

public class Post {
    private String autor;
    private String titulo;
    private String corpo;
    private String categoria;

    public String getAutor(){return autor;}
    public String getTitulo(){return titulo;}
    public String getCorpo(){return corpo;}
    public String getCategoria(){return categoria;}

    public void setAutor(String a){this.autor = a;}
    public void setTitulo(String t){this.titulo = t;}
    public void setCorpo(String c){this.corpo = c;}
    public void setCategoria(String ca){this.categoria = ca;}

    public Post(String a, String t, String c, String ca){
        this.autor = a;
        this.titulo = t;
        this.corpo = c;
        this.categoria = ca;
    }

 
}
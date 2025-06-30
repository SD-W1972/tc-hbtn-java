import exceptions.*;

public class Livro{

    private String titulo;
    private String autor;
    private double preco;

    public Livro (
            String t,
            String a,
            double p
    )throws LivroInvalidoException, AutorInvalidoException{
        setTitulo(t);
        setAutor(a);
        setPreco(p);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if(titulo.trim().length() >= 3){
            this.titulo = titulo;
        }else{
            throw new LivroInvalidoException("Titulo de livro invalido");
        }

    }

    public void setAutor(String autor) throws AutorInvalidoException{
        if(autor.split(" ").length >= 2){
            this.autor = autor;
        }else{
            throw new AutorInvalidoException("Nome de autor invalido");
        }


    }

    public void setPreco(double preco) throws LivroInvalidoException{
        if(preco > 0){
            this.preco = preco;
        }else{
            throw new LivroInvalidoException("Preco de livro invalido");
        }

    }

    public Livro(){

    }
}
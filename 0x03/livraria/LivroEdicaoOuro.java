import exceptions.*;

public class LivroEdicaoOuro extends Livro{

    @Override
    public double getPreco() {
        return ((super.getPreco() * 0.30) + super.getPreco());
    }

    public LivroEdicaoOuro(String title, String author, double price) throws AutorInvalidoException, LivroInvalidoException{
        super.setTitulo(title);
        super.setPreco(price);
        super.setAutor(author);
    }
}
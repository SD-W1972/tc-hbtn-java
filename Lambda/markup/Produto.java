import java.util.function.Supplier;
import java.util.function.Consumer;

public class Produto
{

    private String nome;
    private double preco;
    private double percentualMarkup = 10;

    Supplier<Double> precoComMarkup = () -> preco + ((percentualMarkup * preco)/100);
    Consumer<Double> atualizarMarkup = x -> setPercentualMarkup(x);

    public Produto( double preco,String nome) {
        this.nome = nome;
        this.preco = preco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }

}
import java.util.*;
import java.util.Locale;

public class Comida{
    private String nome;
    private int calorias;
    private double preco;
    static {
        Locale.setDefault(new Locale("pt", "BR"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {


        return String.format("[%s] %d R$ %.6f", nome, calorias, preco);

    }

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }
}
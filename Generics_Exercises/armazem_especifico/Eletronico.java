import java.util.*;
import java.util.Locale;

public class Eletronico{
    private String descricao;
    private double valor;

    static {
        Locale.setDefault(new Locale("pt", "BR"));
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {


        return String.format("[%s] R$ %.6f", descricao, valor);
    }

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
}
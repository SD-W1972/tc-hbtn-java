package produtos;

public abstract class Produto {
    String titulo;
    int ano;
    String pais;
    double precoBruto;

    public abstract double obterPrecoLiquido();
    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }
}
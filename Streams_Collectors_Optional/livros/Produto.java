public class Produto{
    private String nome;
    private CategoriaProduto categoria;
    private double preco;
    private int codigo;

    @Override
    public java.lang.String toString() {
        return String.format("[%d] %s %s R$ %.2f", codigo, nome, categoria, preco).replace(".", ",");
    }

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
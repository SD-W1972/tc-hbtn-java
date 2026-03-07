public class Produto{
    private String nome;
    private double preco;
    private double peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo){
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return getNome() + " " 
        + getPreco() + " " 
        + getPeso() + " "
        + getQuantidadeEmEstoque() + " "
        + getTipo() + ".";
    }

    public String getNome(){return this.nome;}
    public double getPreco(){return this.preco;}
    public double getPeso(){return this.peso;}
    public int getQuantidadeEmEstoque(){return this.quantidadeEmEstoque;}
    public TiposProduto getTipo(){return this.tipo;}

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque){
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setTipo(TiposProduto tipo){
        this.tipo = tipo;
    }
}
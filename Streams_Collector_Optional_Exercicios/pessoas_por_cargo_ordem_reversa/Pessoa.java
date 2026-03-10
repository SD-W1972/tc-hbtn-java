public class Pessoa implements Comparable<Pessoa>{
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo,
    int idade, double salario){
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo(){return this.codigo;}
    public String getNome(){return this.nome;}
    public String getCargo(){return this.cargo;}
    public int getIdade(){return this.idade;}
    public double getSalario(){return this.salario;}

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public int compareTo(Pessoa other){
        return Integer.compare(this.codigo, other.codigo);
    }

    @Override
    public String toString(){
        return this.codigo + " "
        + this.nome + " "
        + this.idade + " R$ "
        + this.salario;
    }
}
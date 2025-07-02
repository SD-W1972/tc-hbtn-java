import java.util.Objects;

public class Aluno{
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("Aluno{nome='%s', idade=%d}", nome, idade);
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno(){

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(nome, aluno.nome);
    }

}
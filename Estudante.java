public class Estudante {
    private String nome;
    private Integer idade;

    Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public Integer getIdade() { return idade; }
}
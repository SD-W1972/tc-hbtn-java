import java.util.Objects;

public class Autor implements Comparable<Autor> {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }

    @Override
    public int compareTo(Autor outro) {
        // Primeiro compara por sobrenome
        int cmp = this.sobrenome.compareTo(outro.sobrenome);
        if (cmp != 0) return cmp;
        // Se sobrenomes forem iguais, compara por nome
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return nome.equals(autor.nome) && sobrenome.equals(autor.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
}
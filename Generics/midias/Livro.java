public class Livro extends Midia{
    int edicao;

    public int getEdicao(){
        return this.edicao;
    }

    public Livro(String nome, int edicao) {
        super(nome);
        this.edicao = edicao;
    }
}
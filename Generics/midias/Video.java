public class Video extends Midia{
    int duracao;

    public int getDuracao(){
        return this.duracao;
    }

    public Video(String nome, int duracao) {
        super(nome);
        this.duracao = duracao;
    }
}
public class Jornal extends Midia{
    int quantidadeArtigos;

    public int getQuantidadeArtigos(){
        return this.quantidadeArtigos;
    }

    public Jornal(String nome, int quantidadeArtigos) {
        super(nome);
        this.quantidadeArtigos = quantidadeArtigos;
    }
}
import java.lang.Exception;

public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;
    
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String d){this.descricao = d;}
    public boolean getEstahFeita(){return this.estahFeita;}
    public void setEstahFeita(boolean e){this.estahFeita = e;}
    public int getIdentificador(){
        return this.identificador;
    }
    public void setIdentificador(int i){
        this.identificador = i;
    }

    public Tarefa(String d,  int i){
        this.descricao = d;
    
        this.identificador = i;
    }

    public void modificarDescricao()throws Exception{
        if(descricao.isBlank() || descricao.isEmpty() || descricao == null){
            throw new Exception("Descricao de tarefa invalida");
        }
    }


}

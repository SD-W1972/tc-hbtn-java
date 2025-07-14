import java.util.*;
import java.lang.IllegalArgumentException;

public class ListaTodo {
    List<Tarefa> tarefas;

    public ListaTodo(){
        this.tarefas = new ArrayList<>();
    }
    
    public void adicionarTarefa(Tarefa t) throws Exception{
        for(Tarefa ta : tarefas){
            if(ta.getIdentificador() == t.getIdentificador()){
                throw new IllegalArgumentException("Tarefa com identificador " + ta.getIdentificador() + " ja existente na lista");
            }
        }
        tarefas.add(t);
    }

    public boolean marcarTarefaFeita(int i){
        for(Tarefa t : tarefas){
            if(t.getIdentificador() == i){
                t.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int i){
        for(Tarefa t : tarefas){
            if(t.getIdentificador() == i){
                t.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for(Tarefa t : tarefas){
            t.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for(Tarefa t : tarefas){
            t.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for(Tarefa t : tarefas){
           if(t.getEstahFeita()){
                System.out.println("[X]  Id: " + t.getIdentificador() + " - Descricao: " + t.getDescricao());
           }else{
                System.out.println("[ ]  Id: " + t.getIdentificador() + " - Descricao: " + t.getDescricao());
           }
        }
    }
}
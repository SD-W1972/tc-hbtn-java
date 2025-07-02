import java.util.ArrayList;

public class GestaoAlunos{
    public static void main(String[] args){
        adicionarAluno("Joao", 15);
        adicionarAluno("José", 18);
        adicionarAluno("Maria", 20);

        listarAlunos();
        buscarAluno("Joao", 15);
        excluirAluno("José", 18);
        excluirAluno("Joaozinho", 27);
    }

    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public static void adicionarAluno(String nome, int idade){
        alunos.add(new Aluno(nome, idade));

    }

    public static void excluirAluno(String nome, int idade){
        Aluno aluno = new Aluno(nome, idade);

        if(alunos.contains(aluno)){
            alunos.remove(aluno);
        }else{
            System.out.println("Aluno não existe! Busque por outro aluno ");
        }
    }

    public static void buscarAluno(String nome, int idade){
        Aluno aluno = new Aluno(nome, idade);

        if(alunos.contains(aluno)){
            System.out.println(aluno);
        }
    }

    public static void listarAlunos(){
        for(Aluno a : alunos){
            System.out.println(a);
        }
    }

}
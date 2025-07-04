import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise{
    public static void main(String[] args)  throws IOException, FileNotFoundException{
        String fileName = "funcionarios.csv"; // Nome do arquivo fixo para leitura


        // efetue a leitura do arquivo
        BufferedReader bf;
        String linha;
        String[] items;
        try{
            bf =  new BufferedReader(new FileReader(fileName));
            while((linha = bf.readLine()) != null)
            {   
              items = linha.split(",");
              System.out.println("Funcionário: " + items[0]);
              System.out.println("Idade: " + items[1]);
              System.out.println("Departamento: " + items[2]);
              System.out.println("Salarial: " + items[3]);
              System.out.println("------------------------");
              
              }
            
        }catch(IOException e){
            throw new IOException("Ocorreu um erro ao ler o arquivo");
        }

        System.out.println("Leitura do arquivo concluída.");
    }
}
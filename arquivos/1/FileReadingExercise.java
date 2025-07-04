import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) throws IOException{
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura

        String linha;
        // efetue a leitura do arquivo
        System.out.println("Conteúdo do arquivo 'exemplo.txt':");
        System.out.println();
    try{
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        while((linha = bf.readLine()) != null){
            System.out.println(linha);
        }    
    }catch(IOException e){
        throw new IOException("Nao foi possivel ler o arquivo");
    }
        System.out.println();
    System.out.println("Leitura do arquivo concluída.");
    }


    
}
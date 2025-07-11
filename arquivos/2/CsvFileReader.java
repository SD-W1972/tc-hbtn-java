import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class CsvFileReader{
    public static void main(String[] args) throws FileNotFoundException{
        String path = "funcionarios.csv";

        BufferedReader br = new BufferedReader(new FileReader(path));

        ler(br, path);
    }

    public static void ler(BufferedReader br, String path){
        List<String> linhas = new ArrayList<>();

        try{
            String linha;
            while(( linha = br.readLine()) != null){
                linhas.add(linha);
            }
        }catch(IOException e){
            System.err.println("Erro ao ler arquivo " + path + ", por favor tente novamente" );
        }

        for(String s : linhas){
            String[] campos = s.split(",");

            System.out.println("Funcionário: " + campos[0]);
            System.out.println("Idade: " + campos[1]);
            System.out.println("Departamento: " + campos[2]);
            System.out.println("Salarial: " + campos[3]);
            System.out.println("------------------------");
        }

        System.out.print("Leitura do arquivo concluída.");
        System.out.println();
    }
}
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise{
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        String entrada;

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        try {
            System.out.println("Digite algo");
            entrada = scanner.nextLine();
            bw.write(entrada);
            bw.newLine();

            while (!entrada.equals("sair")) {
                System.out.println("Digite algo");
                entrada = scanner.nextLine();
                bw.write(entrada);
                bw.newLine();

            }
        }catch(IOException e){
            throw new IOException("Nao foi possível escrever no arquivo");
        }finally{
            bw.close();
        }

        System.out.println("Seu arquivo foi criado e o conteúdo devidamente salvo");
        scanner.close();
    }
}
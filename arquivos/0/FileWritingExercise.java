import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String path = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            System.out.println("Digita umas coisas maneiras");

            while(true) {

                String entrada = sc.nextLine();
                if (entrada.equalsIgnoreCase("sair")) {
                    break;

                }

                bw.write(entrada);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
        System.out.println("Arquivo '" + path + "' foi criado e seu conteúdo foi salvo");
        sc.close();
    }
}

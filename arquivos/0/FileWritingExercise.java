import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Digita umas coisas maneiras");
            
            String line;
            while (true) {
                System.out.print("> ");
                line = scanner.nextLine();
                
                
                if (line.equalsIgnoreCase("sair")) {
                    break;
                }
                
                writer.write(line);
                writer.newLine(); 
            }
            
            System.out.println("Arquivo '" + fileName + "' foi criado e seu conteúdo foi salvo");
            
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
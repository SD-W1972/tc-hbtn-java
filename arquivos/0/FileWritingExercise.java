//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String var2 = sc.nextLine();

        try (BufferedWriter var3 = new BufferedWriter(new FileWriter(var2))) {
            System.out.println("Digita umas coisas maneiras");

            while(true) {
                System.out.print("> ");
                String var4 = sc.nextLine();
                if (var4.equalsIgnoreCase("sair")) {
                    System.out.println("Arquivo '" + var2 + "' foi criado e seu conteúdo foi salvo");
                    break ;
                }

                var3.write(var4);
                var3.newLine();
            }
        } catch (IOException var8) {
            System.err.println("Erro ao escrever no arquivo: " + var8.getMessage());
        }

        sc.close();
    }
}

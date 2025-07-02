import java.util.Scanner;


public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");

        for(int i = 0; i < tamanhoArray; i++){
            System.out.printf("Digite o número %d:", i+1);
            numeros[i] = scanner.nextInt();

        }
        System.out.println();
        // Exibindo os resultados
        System.out.printf("%nConteúdo do array:%n");
        for(int i = 0; i < tamanhoArray; i++){
            System.out.printf("%d ", numeros[i]);
            soma += numeros[i];

            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];

            }
        }

        System.out.printf("%nSoma de todos os números: %d", soma);
        System.out.printf("%nMaior número do array: %d", maiorNumero);
        // Fechando o scanner
        scanner.close();
    }
}
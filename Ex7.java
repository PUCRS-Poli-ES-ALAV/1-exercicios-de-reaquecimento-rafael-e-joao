import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;
        int produto = 1;

        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i];
            produto = produto * vetor[i];
        }

        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Produto dos elementos: " + produto);

        scanner.close();
    }
}
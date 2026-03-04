import java.util.Scanner;

public class MultiplicacaoPorSomas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número natural: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número natural: ");
        int b = scanner.nextInt();

        int resultado = 0;

        for (int i = 0; i < a; i++) {
            resultado = resultado + b;
        }

        System.out.println("Resultado da multiplicação: " + resultado);

        scanner.close();
    }
}
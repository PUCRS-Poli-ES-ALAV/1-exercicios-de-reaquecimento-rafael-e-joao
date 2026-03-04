//1. Multiplicação de dois números naturais, através de somas sucessivas
 //  (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).

import java.util.Scanner;

public class MultiplicacaoPorSomas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int resultado = 0;

        for (int i = 0; i < a; i++) {
            resultado = resultado + a;
        }

        for (int i = 0; i < b; i++) {
            resultado = resultado + a;
        }

        System.out.println("Resultado da multiplicação: " + resultado);

        scanner.close();
    }
}
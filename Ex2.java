 //Soma de dois números naturais, através de incrementos sucessivos 
// (Ex.: 3 + 2 = + + (+ + + 1)).

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int resultado = a;

        for (int i = 0; i < b; i++) {
            resultado = resultado + 1;
        }

        System.out.println("Resultado da soma: " + resultado);

        scanner.close();
    } 
}
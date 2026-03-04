import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        System.out.print("Digite o número: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double resultado = 0.0;

        for (int i = 1; i <= n; i++) {
            resultado = resultado + (1.0 / i);
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
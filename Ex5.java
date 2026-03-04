import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = scanner.nextInt();

        int f1 = 1;
        int f2 = 2;
        int fn = 0;

        if (n == 1) {
            System.out.println("F(1) = " + f1);
        } 
        else if (n == 2) {
            System.out.println("F(2) = " + f2);
        } 
        else {

            for (int i = 3; i <= n; i++) {
                fn = 2 * f2 + 3 * f1;

                f1 = f2;
                f2 = fn;
            }

            System.out.println("F(" + n + ") = " + fn);
        }

        scanner.close();
    }
}
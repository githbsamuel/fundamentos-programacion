
import java.util.Scanner;

public class Patrones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, i, j;

        System.out.print("Ingrese el numero: ");
        int n = sc.nextInt();

        IO.println("\nPrimer patron: ");

        for (i = 1; i <= n; i++) {
            IO.print("\n");
            for (j = 1; j <= n; j++) {
                IO.print("* ");
            }
        }
        IO.println();

        IO.println("\nParamide de asteriscos al reves: ");
        IO.println(" ");

        for (i = n; i >= 1; i--) {

            for (j = 1; j <= n - i; j++) {
                IO.print(" ");
            }

            for (k = 1; k <= (2 * i - 1); k++) {
                IO.print("*");
            }
            IO.println();
        }

        IO.println();

        IO.println("\nPiramide de asteriscos: ");
        IO.println(" ");

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {
                IO.print(" ");
            }

            for (k = 1; k <= (2 * i - 1); k++) {
                IO.print("*");
            }

            IO.println();
        }

        sc.close();
    }

}

import java.util.Scanner;

public class PiramideNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            IO.println(" ");

            for (int k = 1; k <= i; k++) {
                IO.print(k);

            }

        }
        IO.println();

        sc.close();
    }

}

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, suma = 0;

        IO.print("Ingrese un numero N para sumar los primeros N numeros: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            suma = suma + i;
        }
        IO.println("La suma de los primeros " + n + " numeros es: " + suma);

        sc.close();

    }
}
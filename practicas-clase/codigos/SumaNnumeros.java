import java.util.Scanner;

public class SumaNnumeros {
    public void main() {
        Scanner ed = new Scanner(System.in);

        IO.print("Ingrese la cantidad de numeros a sumar: ");
        int n = ed.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            IO.print("Ingrese el numero " + i + ": ");
            int num = ed.nextInt();
            suma += num;
        }

        IO.println("La suma de los " + n + " numeros es: " + suma);

        ed.close();
    }

}

import java.util.Scanner;

public class NumeroMayor {
    public void main() {
        int n1, n2, n3;
        Scanner ed = new Scanner(System.in);

        IO.print("Ingrese el primer numero: ");
        n1 = ed.nextInt();
        IO.print("Ingrese el segundo numero: ");
        n2 = ed.nextInt();
        IO.print("Ingrese el tercer numero: ");
        n3 = ed.nextInt();

        if (n1 == n2 && n2 == n3) {
            IO.println("Los tres numeros son iguales");
        } else if (n1 == n2 && n1 > n3) {
            IO.println("El primero y segundo son iguales y mayores que el tercero: " + n1);
        } else if (n1 == n3 && n1 > n2) {
            IO.println("El primero y tercero son iguales y mayores que el segundo: " + n1);
        } else if (n2 == n3 && n2 > n1) {
            IO.println("El segundo y tercero son iguales y mayores que el primero: " + n2);
        } else if (n1 > n2 && n1 > n3) {
            IO.println("El primer numero es el mayor: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            IO.println("El segundo numero es el mayor: " + n2);
        } else {
            IO.println("El tercer numero es el mayor: " + n3);
        }
        ed.close();

    }
}
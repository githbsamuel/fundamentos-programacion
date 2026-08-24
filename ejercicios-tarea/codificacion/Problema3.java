import java.util.Scanner;

public class Problema3 {

    public void main() {
        Scanner ed = new Scanner(System.in);

        IO.print("Ingrese un número: ");
        int numero = ed.nextInt();

        if (numero == 0) {
            IO.println("El número es neutro.");
        } else if (numero % 2 == 0) {
            IO.println("El número es par.");
        } else {
            IO.println("El número es impar.");
        }

        ed.close();
    }
}
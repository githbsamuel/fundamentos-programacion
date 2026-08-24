import java.util.Scanner;

public class CuentaAhorro {
    static void main() {
        Scanner ed = new Scanner(System.in);

        double saldo = 0.0;

        IO.println("---------------------CUENTA DE AHORRO---------------------");

        for (int i = 1; i <= 12; i++) {

            IO.print("Ingrese el deposito del mes: " + i + ": ");
            double deposito = ed.nextDouble();
            saldo += deposito;

            IO.println("la cantidad de dinero en la cuenta es: " + saldo);
        }

        IO.println("El saldo final de la cuenta es: " + saldo);

        ed.close();
    }
}
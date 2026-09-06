import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numuero_uno, numero_dos, resultado = 0;
        String operacion, opcion;

        do {
            IO.println("\nIngrese dos numeros enteros: ");
            numuero_uno = sc.nextInt();
            numero_dos = sc.nextInt();

            IO.print("\nIngrese la operacion: ( * , + , - , / ): ");
            operacion = sc.next();

            switch (operacion) {
                case "+":
                    resultado = numuero_uno + numero_dos;
                    break;

                case "-":
                    resultado = numuero_uno - numero_dos;
                    break;

                case "*":
                    resultado = numuero_uno * numero_dos;
                    break;

                case "/":
                    resultado = numuero_uno / numero_dos;
                    break;

                default:
                    IO.println("Caracter no valido");
            }

            IO.println(
                    "\nEl resultado de " + numuero_uno + " " + operacion + " " + numero_dos + " es de : " + resultado);

            IO.print("\nDesea realizar otra operacion? si/no: ");
            opcion = sc.next();
        } while (opcion.equals("si"));

        sc.close();
    }
}
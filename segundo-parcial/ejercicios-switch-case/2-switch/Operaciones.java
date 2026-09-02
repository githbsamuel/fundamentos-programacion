import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numuero_uno, numero_dos, resultado = 0;
        String operacion;

        IO.print("Ingrese dos numeros enteros: ");
        numuero_uno = sc.nextInt();
        numero_dos = sc.nextInt();

        IO.print("Ingrese la operacion: ( * , + , - , / ): ");
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

        IO.println("El resultado de " + operacion + " es de : " + resultado);

        sc.close();
    }
}
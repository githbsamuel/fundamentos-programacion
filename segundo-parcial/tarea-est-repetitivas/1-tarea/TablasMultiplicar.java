import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int opcion;

        do {

            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();

            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            IO.print("¿Desea ingresar otro número? (1/0): ");
            opcion = sc.nextInt();
        } while (opcion == 1);

        sc.close();
    }
}

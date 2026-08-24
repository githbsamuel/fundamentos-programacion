import java.util.Scanner;

public class Problema6 {
    public void main() {
        Scanner ed = new Scanner(System.in);

        IO.println("Ingrese el número de horas que el cliente ha utilizado el estacionamiento: ");
        int horas = ed.nextInt();

        int costoTotal = 0;

        if (horas <= 2) {
            costoTotal = horas * 30;
        } else if (horas <= 5) {
            costoTotal = (2 * 30) + ((horas - 2) * 25);
        } else if (horas <= 10) {
            costoTotal = (2 * 30) + (3 * 25) + ((horas - 5) * 20);
        } else {
            costoTotal = 380;
        }

        IO.println("El costo total del estacionamiento es: $" + costoTotal);

        ed.close();

    }
}
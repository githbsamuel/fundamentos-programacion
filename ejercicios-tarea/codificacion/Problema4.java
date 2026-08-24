import java.util.Scanner;

public class Problema4 {

    public void main() {
        Scanner ed = new Scanner(System.in);

        int costoCita = 0;
        int totalPagado = 0;

        IO.print("Ingrese el número de cita: ");
        int cita = ed.nextInt();

        if (cita <= 3) {
            costoCita = 900;
            totalPagado = cita * 900;
        } else if (cita <= 5) {
            costoCita = 800;
            totalPagado = (3 * 900) + ((cita - 3) * 800);
        } else if (cita <= 8) {
            costoCita = 600;
            totalPagado = (3 * 900) + (2 * 800) + ((cita - 5) * 600);
        } else {
            costoCita = 500;
            totalPagado = (3 * 900) + (2 * 800) + (3 * 600) + ((cita - 8) * 500);
        }

        IO.println("El costo de la cita es: $" + costoCita);
        IO.println("El total pagado por el tratamiento es: $" + totalPagado);

        ed.close();

    }
}
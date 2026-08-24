import java.util.Scanner;

public class Problema5 {

    public void main() {
        Scanner ed = new Scanner(System.in);

        IO.println("Ingrese el peso del paquete en gramos: ");
        int peso = ed.nextInt();

        IO.println("Ingrese la zona de destino (1-5): ");
        int zona = ed.nextInt();

        int costoPorGramo = 0;

        if (zona == 1) {
            costoPorGramo = 11;
        } else if (zona == 2) {
            costoPorGramo = 10;
        } else if (zona == 3) {
            costoPorGramo = 12;
        } else if (zona == 4) {
            costoPorGramo = 25;
        } else if (zona == 5) {
            costoPorGramo = 30;
        } else {
            IO.println("Zona inválida");

        }

        int costoTotal = peso * costoPorGramo;
        IO.println("El costo total del envío es: $" + costoTotal);

        ed.close();

    }
}
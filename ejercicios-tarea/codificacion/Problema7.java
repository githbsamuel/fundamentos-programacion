import java.util.Scanner;

public class Problema7 {

    public void main() {
        Scanner ed = new Scanner(System.in);
        double beca = 0;

        IO.println("Ingrese la edad del estudiante: ");
        int edad = ed.nextInt();
        IO.println("Ingrese el promedio del estudiante: ");
        double promedio = ed.nextDouble();

        if (edad > 18) {
            if (promedio >= 9) {
                beca = 10000;
            } else if (promedio >= 7.5) {
                beca = 8000;
            } else if (promedio >= 6) {
                beca = 5000;
            } else {
                IO.println("estudie más en el próximo ciclo escolar.");
            }
        } else {
            if (promedio >= 9) {
                beca = 8000;
            } else if (promedio >= 8) {
                beca = 6000;
            } else if (promedio >= 6) {
                beca = 4000;
            } else {
                IO.println("estudie más en el próximo ciclo escolar.");
            }
        }

        if (beca > 0) {
            IO.println("El estudiante recibirá una beca de: $" + beca);
        }

        ed.close();

    }
}
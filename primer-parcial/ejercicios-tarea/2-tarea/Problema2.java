import java.util.Scanner;

public class Problema2 {

    public void main() {
        Scanner ed = new Scanner(System.in);

        /*
         * Conduces demasiado rápido y un policía te detiene. Escribe el código para
         * calcular el resultado, codificado como un valor entero: 0 = sin multa, 1 =
         * multa pequeña, 2 = multa grande. Si la velocidad es de 60 o menos, el
         * resultado es 0. Si la velocidad está entre 61 y 80 inclusive, el resultado es
         * 1. Si la velocidad es de 81 o más, el resultado es 2. A menos que sea tu
         * cumpleaños; ese día, tu velocidad puede ser 5 veces mayor en todos los casos.
         */

        IO.print("Ingrese la velocidad del conductor: ");
        int velocidad = ed.nextInt();
        IO.print("Ingrese el día del cumpleaños (true o false): ");
        boolean cumpleaños = ed.nextBoolean();

        int resultado = 0;

        if (cumpleaños) {
            if (velocidad <= 65) {
                resultado = 0;
            } else if (velocidad >= 66 && velocidad <= 85) {
                resultado = 1;
            } else if (velocidad >= 86) {
                resultado = 2;
            }
        } else {
            if (velocidad <= 60) {
                resultado = 0;
            } else if (velocidad >= 61 && velocidad <= 80) {
                resultado = 1;
            } else if (velocidad >= 81) {
                resultado = 2;
            }
        }

        IO.println("");
        IO.println("(0 = sin multa, 1 = multa pequeña, 2 = multa grande):");
        IO.println("");
        IO.println("El resultado es: " + resultado);

        ed.close();

    }
}
import java.util.Scanner;

public class Problema1 {
    public static void main() {
        Scanner ed = new Scanner(System.in);

        /*
         * Problema:
         * La sociación de vinicultores tiene como política fijar un precio inicial al
         * kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
         * Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se
         * requiere determinar cuánto recibirá un productor por la uva que entrega en un
         * embarque, considerando lo siguiente: si es de tipo A, se le cargan 20¢ al
         * precio inicial cuando es de tamaño 1; y 30¢ si es de tamaño 2. Si es de tipo
         * B, se rebajan 30¢ cuando es de tamaño 1, y 50¢ cuando es de tamaño 2
         */

        IO.print("Ingrese el precio inicial del kilo de uva:  ");
        double precio_inicial = ed.nextDouble();
        IO.print("Ingrese la cantidad de kilos de uva: ");
        double cantidad_kilos = ed.nextDouble();
        IO.print("Ingrese el tipo de uva (A o B):  ");
        String tipo_uva = ed.next();
        IO.print("Ingrese el tamaño de la uva (1 o 2):  ");
        int tamaño_uva = ed.nextInt();

        double precio_final = 0;

        if (tipo_uva.equals("A")) {
            if (tamaño_uva == 1) {
                precio_final = precio_inicial + 0.20;
            } else if (tamaño_uva == 2) {
                precio_final = precio_inicial + 0.30;
            }
        } else if (tipo_uva.equals("B")) {
            if (tamaño_uva == 1) {
                precio_final = precio_inicial - 0.30;
            } else if (tamaño_uva == 2) {
                precio_final = precio_inicial - 0.50;
            }
        }
        double total = precio_final * cantidad_kilos;

        IO.println("");
        IO.println("El total a recibir por la uva es: " + total);
        IO.println("El precio final por kilo de uva es: " + precio_final);

        ed.close();

    }
}
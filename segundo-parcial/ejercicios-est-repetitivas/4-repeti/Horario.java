import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour;
        String opcion;

        do {

            IO.print("\nIngrese la hora (sin minutos): ");
            hour = sc.nextInt();

            if (hour >= 0 && hour <= 5 || hour >= 21 && hour <= 24) {
                IO.println("Buenas noches! :)");
            } else {
                if (hour >= 6 && hour <= 12) {
                    IO.println("Buenos dias! :)");
                } else {
                    if (hour >= 13 && hour <= 20) {
                        IO.println("Buenas tardes! :)");
                    } else {
                        IO.println("Hora no valida, ingrese de nuevo!.");
                    }
                }
            }

            IO.print("\nDesea ingresar otra hora? (s/n): ");
            opcion = sc.next();
        } while (opcion.equals("s"));

        sc.close();
    }
}
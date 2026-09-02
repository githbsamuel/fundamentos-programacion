import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour;

        IO.print("Ingrese la hora (sin minutos): ");
        hour = sc.nextInt();

        if (hour >= 0 && hour <= 5) {
            IO.println("Buenas noches! :)");
        } else {
            if (hour >= 6 && hour <= 12) {
                IO.println("Buenos dias! :)");
            } else {
                if (hour >= 13 && hour <= 20) {
                    IO.println("Buenas tardes! :)");
                } else {
                    if (hour >= 21 && hour <= 24) {
                        IO.println("Buenas noches! :)");
                    } else {
                        IO.println("Hora no valida, ingrese de nuevo!.");
                    }
                }
            }
        }

        sc.close();
    }
}
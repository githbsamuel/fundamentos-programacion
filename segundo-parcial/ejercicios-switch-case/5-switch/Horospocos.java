import java.util.Scanner;

public class Horospocos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes;

        IO.print("Ingresa tu día de nacimiento (número): ");
        dia = sc.nextInt();

        IO.print("Ingresa tu mes de nacimiento (1 a 12): ");
        mes = sc.nextInt();

        switch (mes) {
            case 1:
                if (dia <= 19) {
                    IO.println("Tu signo es Capricornio");
                } else {
                    IO.println("Tu signo es Acuario");
                }
                break;

            case 2:
                if (dia <= 18) {
                    IO.println("Tu signo es Acuario");
                } else {
                    IO.println("Tu signo es Piscis");
                }
                break;

            case 3:
                if (dia <= 20) {
                    IO.println("Tu signo es Piscis");
                } else {
                    IO.println("Tu signo es Aries");
                }
                break;

            case 4:
                if (dia <= 19) {
                    IO.println("Tu signo es Aries");
                } else {
                    IO.println("Tu signo es Tauro");
                }
                break;

            case 5:
                if (dia <= 20) {
                    IO.println("Tu signo es Tauro");
                } else {
                    IO.println("Tu signo es Géminis");
                }
                break;

            case 6:
                if (dia <= 20) {
                    IO.println("Tu signo es Géminis");
                } else {
                    IO.println("Tu signo es Cáncer");
                }
                break;

            case 7:
                if (dia <= 22) {
                    IO.println("Tu signo es Cáncer");
                } else {
                    IO.println("Tu signo es Leo");
                }
                break;

            case 8:
                if (dia <= 22) {
                    IO.println("Tu signo es Leo");
                } else {
                    IO.println("Tu signo es Virgo");
                }
                break;

            case 9:
                if (dia <= 22) {
                    IO.println("Tu signo es Virgo");
                } else {
                    IO.println("Tu signo es Libra");
                }
                break;

            case 10:
                if (dia <= 22) {
                    IO.println("Tu signo es Libra");
                } else {
                    IO.println("Tu signo es Escorpión");
                }
                break;

            case 11:
                if (dia <= 21) {
                    IO.println("Tu signo es Escorpión");
                } else {
                    IO.println("Tu signo es Sagitario");
                }
                break;

            case 12:
                if (dia <= 21) {
                    IO.println("Tu signo es Sagitario");
                } else {
                    IO.println("Tu signo es Capricornio");
                }
                break;

            default:
                IO.println("Mes no válido.");
        }

        sc.close();
    }
}
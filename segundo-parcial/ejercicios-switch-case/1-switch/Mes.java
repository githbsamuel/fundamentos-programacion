import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int moon;

        IO.print("Ingrese el mes (1-12): ");
        moon = sc.nextInt();

        switch (moon) {
            case 1:
                IO.println(" Enero tiene 31 dias");
                break;
            case 2:
                IO.println(" Febrero tiene 29 dias");
                break;
            case 3:
                IO.println(" Marzo tiene 31 dias");
                break;
            case 4:
                IO.println(" Abril tiene 30 dias");
                break;
            case 5:
                IO.println(" Mayo tiene 31 dias");
                break;
            case 6:
                IO.println(" Junio tiene 30 dias");
                break;
            case 7:
                IO.println(" Julio tiene 31 dias");
                break;
            case 8:
                IO.println(" Agosto tiene 31 dias");
                break;
            case 9:
                IO.println(" Septiembre tiene 30 dias");
                break;
            case 10:
                IO.println(" Octubre tiene 31 dias");
                break;
            case 11:
                IO.println(" Noviembre tiene 30 dias");
                break;
            case 12:
                IO.println(" Diciembre tiene 31 dias");
                break;
            default:
                IO.println(" Numero invalido. Ingrese de nuevo!");
        }

        sc.close();
    }
}
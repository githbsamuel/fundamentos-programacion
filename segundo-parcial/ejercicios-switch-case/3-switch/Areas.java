import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op, b, h, r;
        double area = 0;

        IO.println("1. - Cuadrado");
        IO.println("2. - Rectangulo");
        IO.println("3. - Triangulo");
        IO.println("4. - Circulo");
        IO.print("Ingrese la opcion: ");
        op = sc.nextInt();

        switch (op) {
            case 1:
                IO.println("---------- CUADRADO ----------");
                IO.print("Ingrese el tamnio del lado: ");
                b = sc.nextInt();

                area = b * b;

                IO.println("El area del cuadrado es: " + area + " m^2");
                break;

            case 2:
                IO.println("---------- RECTANGULO ----------");
                IO.print("Ingrese el tamnio de la base: ");
                b = sc.nextInt();

                IO.print("Ingrese el tamnio de la altura: ");
                h = sc.nextInt();

                area = b * h;

                IO.println("El area del rectangulo es: " + area + " m^2");
                break;

            case 3:
                IO.println("---------- TRIANGULO ----------");
                IO.print("Ingrese el tamnio de la base: ");
                b = sc.nextInt();

                IO.print("Ingrese el tamnio de la altura: ");
                h = sc.nextInt();

                area = (b * h) / 2.0;

                IO.println("El area del triangulo es: " + area + " m^2");
                break;

            case 4:
                IO.println("---------- CIRCULO ----------");
                IO.print("Ingrese el radio del circulo: ");
                r = sc.nextInt();

                area = 3.1416 * (r * r);

                IO.println("El area del circulo es: " + area + " m^2");
                break;

            default:
                IO.println("Caracter no valido. Ingrese de nuevo!");
        }

        sc.close();
    }
}
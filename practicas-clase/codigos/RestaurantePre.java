import java.util.Scanner;

public class RestaurantePre {

    public void main() {
        Scanner ed = new Scanner(System.in);

        int n_personas, costo;

        IO.print("Ingrese el numero de personas: ");
        n_personas = ed.nextInt();

        if (n_personas < 200) {
            costo = n_personas * 95;
            IO.println("Precio: 95 y Costo: " + costo);

        } else if (n_personas >= 200 && n_personas <= 300) {
            costo = n_personas * 85;
            IO.println("Precio: 85 y Costo: " + costo);

        } else {
            costo = n_personas * 75;
            IO.println("Precio: 75 y Costo: " + costo);

        }

        ed.close();

    }
}

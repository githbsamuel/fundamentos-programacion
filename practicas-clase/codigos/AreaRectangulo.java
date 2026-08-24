import java.util.*;

public class AreaRectangulo {
    public void main() {

        Scanner ed = new Scanner(System.in);

        IO.print("Ingrese la base del triangulo: ");
        float b = ed.nextFloat();

        IO.print("Ingrese la altura del triangulo: ");
        float h = ed.nextFloat();

        float area = b * h;

        IO.println("El area del triangulo es: " + area + " m^2");

        ed.close();

    }

}
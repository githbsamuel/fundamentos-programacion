import java.util.*;

public class MayorEdad {
    public void main() {

        Scanner ed = new Scanner(System.in);

        IO.print("Ingrese su edad: ");
        int years = ed.nextInt();

        if (years >= 18 && years < 65)
            IO.println("Mayor de edad");
        else if (years >= 65)
            IO.println("Adulto mayor");
        else
            IO.println("Menor de edad");

        ed.close();

    }

}

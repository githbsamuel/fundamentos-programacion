import java.util.Scanner;

public class VentasSep {
    public void main() {
        Scanner ed = new Scanner(System.in);

        int may_m = 0, may_p = 0;
        int med_m = 0, med_p = 0;
        int bajo_m = 0, bajo_p = 0;
        float global = 0;

        IO.print("Hay ventas: si/no: ");
        String venta = ed.next();

        while (venta.equals("si")) {
            IO.print("Ingrese el monto de la venta: ");
            float monto = ed.nextFloat();

            if (monto > 1000) {
                may_m += monto;
                may_p++;
                global += monto;
            } else if (monto > 500 && monto <= 1000) {
                med_m += monto;
                med_p++;
                global += monto;
            } else if (monto < 500) {
                bajo_m += monto;
                bajo_p++;
                global += monto;
            }

            IO.print("Hay otra venta? si/no:  ");
            venta = ed.next();
        }

        IO.println(" ");
        IO.println("Piezas vendidas mayores a 1000: " + may_p);
        IO.println("Monto de mayores a 1000: " + may_m);
        IO.println(" ");
        IO.println("Piezas vendidas mayores a 500 y menores que 1000: " + med_p);
        IO.println("Monto de mayores a 500 y menores que 1000: " + med_m);
        IO.println(" ");
        IO.println("Piezas vendidas menores que 500: " + bajo_p);
        IO.println("Monto de menores de 500: " + bajo_m);
        IO.println(" ");
        IO.println("Monto global: " + global);

        ed.close();

    }

}
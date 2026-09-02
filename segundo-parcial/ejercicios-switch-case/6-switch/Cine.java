import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numer_person, precio_base, parejas_dobles, precio_dobl;
        double monto_des, monto_pagar;
        String dia, membresia;

        precio_base = 50;
        precio_dobl = 75;
        monto_des = 0;

        IO.print("Ingrese el numero de personas: ");
        numer_person = sc.nextInt();

        IO.print("Ingrese el dia de la semana: ");
        dia = sc.next();

        IO.print("Usted tiene membresia: (si/no): ");
        membresia = sc.next();

        switch (dia) {
            case "miercoles":
                precio_base = 30;
                monto_pagar = numer_person * precio_base;
                break;

            case "jueves":
                if (numer_person % 2 == 0) {
                    parejas_dobles = numer_person / 2;
                    monto_pagar = parejas_dobles * precio_dobl;
                } else {
                    parejas_dobles = numer_person / 2;
                    monto_pagar = (parejas_dobles * precio_dobl) + precio_base;
                }
                break;

            default:
                monto_pagar = numer_person * precio_base;
        }

        if (membresia.equals("si")) {
            monto_des = monto_pagar * 0.10;
        }

        monto_pagar = monto_pagar - monto_des;

        IO.println("Monto a pagar: $" + monto_pagar);

        sc.close();
    }
}
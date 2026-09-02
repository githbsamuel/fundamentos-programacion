import java.util.Scanner;

public class Tartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sabor_tarta, add_snack, tipo_choco, snack, personalizar_nombre;
        int tarta_manz, tarta_fresa, tarta_choBlanco, tarta_choNegro;
        int numero_snack, precio_tarta = 0, precio_nombre;
        double precio_total;

        tarta_manz = 200;
        tarta_fresa = 250;
        tarta_choBlanco = 250;
        tarta_choNegro = 280;
        numero_snack = 0;
        precio_nombre = 0;

        IO.print("Ingrese el sabor de la tarta: ");
        sabor_tarta = sc.next();

        switch (sabor_tarta) {
            case "manzana":
                precio_tarta = tarta_manz;
                break;

            case "fresa":
                precio_tarta = tarta_fresa;
                break;

            case "chocolate":
                IO.print("Ingrese el tipo de chocolate (blanco o negro): ");
                tipo_choco = sc.next();

                if (tipo_choco.equals("negro")) {
                    precio_tarta = tarta_choNegro;
                } else {
                    if (tipo_choco.equals("blanco")) {
                        precio_tarta = tarta_choBlanco;
                    }
                }
                break;

            default:
                IO.println("Sabor implicito");
        }

        IO.print("Desea agregar snack (si/no): ");
        add_snack = sc.next();

        while (add_snack.equals("si")) {

            IO.print("Ingrese su sabor de snack: ");
            snack = sc.next();
            IO.println("Snack agregado: " + snack);
            numero_snack = numero_snack + 1;

            IO.print("Desea agregar otro snack (si/no): ");
            add_snack = sc.next();
        }

        IO.print("Desea personalizar con su nombre: (si/no): ");
        personalizar_nombre = sc.next();

        if (personalizar_nombre.equals("si")) {
            precio_nombre = 30;
        }

        precio_total = precio_tarta + (numero_snack * 25) + precio_nombre;

        IO.println("---------------- PRESUPUESTO --------------------");
        IO.println("Sabor tarta: " + sabor_tarta);
        IO.println("Precio total de tarta: " + precio_tarta);
        IO.println("Cantidad de snacks: " + numero_snack);
        IO.println("Precio total de snack: " + (numero_snack * 25));
        IO.println("Personalizado: " + personalizar_nombre);
        IO.println("Precio del personalizado: " + precio_nombre);
        IO.println("------------------------------------");
        IO.println("Precio Total: " + precio_total + "$");

        sc.close();
    }
}
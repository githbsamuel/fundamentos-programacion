import java.util.Scanner;

public class Tartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sabor_tarta, add_snack, tipo_choco, snack, personalizar_nombre, opcion;
        int tarta_manz, tarta_fresa, tarta_choBlanco, tarta_choNegro;
        int numero_snack, precio_tarta, precio_nombre;
        double precio_total;
        boolean tarta_valida = true;

        tarta_manz = 200;
        tarta_fresa = 250;
        tarta_choBlanco = 250;
        tarta_choNegro = 280;

        do {

            numero_snack = 0;
            precio_nombre = 0;
            precio_tarta = 0;

            do {

                IO.print("\nIngrese el sabor de la tarta: ");
                sabor_tarta = sc.next();

                switch (sabor_tarta) {
                    case "manzana":
                        precio_tarta = tarta_manz;
                        break;

                    case "fresa":
                        precio_tarta = tarta_fresa;
                        break;

                    case "chocolate":
                        IO.print("\nIngrese el tipo de chocolate (blanco o negro): ");
                        tipo_choco = sc.next();

                        if (tipo_choco.equals("negro")) {
                            precio_tarta = tarta_choNegro;
                            break;
                        } else {
                            if (tipo_choco.equals("blanco")) {
                                precio_tarta = tarta_choBlanco;
                                break;
                            }
                        }
                        break;

                    default:
                        IO.println("\nSabor implicito, Ingrese de nuevo! ");
                        tarta_valida = false;

                }

            } while (tarta_valida == false);

            IO.print("\nDesea agregar snack (si/no): ");
            add_snack = sc.next();

            while (add_snack.equals("si")) {

                IO.print("\nIngrese su sabor de snack: ");
                snack = sc.next();
                IO.println("Snack agregado: " + snack);
                numero_snack = numero_snack + 1;

                IO.print("\nDesea agregar otro snack (si/no): ");
                add_snack = sc.next();
            }

            IO.print("\nDesea personalizar con su nombre: (si/no): ");
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

            IO.println("\nDesea realizar otra compra (si/no): ");
            opcion = sc.next();

        } while (opcion.equals("si"));

        sc.close();
    }
}
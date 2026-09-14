import java.util.Scanner;

public class Automovil {

    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);

        int edad_Conductor, cantidad_Accidentes;
        double valor_Vehiculo;
        boolean seguro_Apto = false;
        boolean seguro_adicional;

        do {
            System.out.println();
            IO.print("Ingrese el valor del vehículo: ");
            valor_Vehiculo = ed.nextDouble();

            IO.print("Ingrese la edad del conductor: ");
            edad_Conductor = ed.nextInt();

            IO.print("Ingrese la cantidad de accidentes reportados durante el último año: ");
            cantidad_Accidentes = ed.nextInt();

            IO.print("¿Desea agregar un seguro adicional? (true/false): ");
            seguro_adicional = ed.nextBoolean();

            System.out.println();

            seguro_Apto = seguro(edad_Conductor, cantidad_Accidentes, valor_Vehiculo);
            IO.println(msj(seguro_Apto));

        } while (!seguro_Apto);

        double tarifaBase = calcularTarifaBase(valor_Vehiculo);
        double recargoEdad = calcularRecargoPorEdad(tarifaBase, edad_Conductor);
        double recargoAccidentes = calcularRecargoPorAccidentes(tarifaBase, cantidad_Accidentes);
        double descuento = calcularDescuentoSeguridad(recargoAccidentes, seguro_adicional);
        double tarifaFinal = caluclarTarifaFinal(tarifaBase, recargoEdad, recargoAccidentes, descuento);

        IO.println("Tarifa base: " + tarifaBase);
        IO.println("Recargo por edad: " + recargoEdad);
        IO.println("Recargo por accidentes: " + recargoAccidentes);
        IO.println("Descuento por medidas de seguridad: " + descuento);
        IO.println("Tarifa final: " + tarifaFinal);

        ed.close();

    }

    //
    public static boolean seguro(int edad_Conductor, int cantidad_Accidentes, double valor_Vehiculo) {
        if ((edad_Conductor >= 18 && edad_Conductor <= 100) && cantidad_Accidentes >= 0 && valor_Vehiculo > 0) {
            return true;
        } else {
            return false;
        }
    }

    //
    public static String msj(boolean mensaje) {
        if (mensaje) {
            return "";
        }
        return "Valores ingresados no aptos para asegurar el vehículo. Por favor, ingrese nuevamente los datos.";
    }

    //
    public static double calcularTarifaBase(double valorVehiculo) {
        return valorVehiculo * 0.04;
    }

    //
    public static double calcularRecargoPorEdad(double tarifaBase, int edad) {
        if (edad < 25) {
            return tarifaBase * 0.2;
        } else if (edad >= 25 && edad <= 65) {
            return 0;
        } else {
            return tarifaBase * 0.1;
        }
    }

    //
    public static double calcularRecargoPorAccidentes(double tarifaBase, int accidentes) {
        return tarifaBase * (0.08 * accidentes);
    }

    //

    public static double calcularDescuentoSeguridad(double subtotal, boolean tieneSeguridad) {
        if (tieneSeguridad) {
            return subtotal * 0.05;
        } else {
            return 0;
        }

    }

    public static double caluclarTarifaFinal(double tarifaBase, double recargoEdad, double recargoAccidentes,
            double descuento) {
        return tarifaBase + recargoEdad + recargoAccidentes - descuento;
    }

}

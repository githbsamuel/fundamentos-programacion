import java.util.*;

public class Control_consumo {

    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);

        IO.println("--------------SISTEMA DE CONjSUMO ELECTRICO---------------------\n");

        double lectura_anterior = 0, lectura_actual = 0, consumo = 0.0, costo_consumo = 0.0, descuento_apoyo = 0.0,
                impuesto = 0.0, total = 0.0, cargo_fijo = 95.0, baseImponible = 0.0;
        boolean validacion_Lecuturas = false, tieneApoyo = false;

        do {
            do {

                IO.print("Ingrese la lectura acutal: ");
                lectura_actual = ed.nextDouble();

                IO.print("Ingrese la lecutra anterior: ");
                lectura_anterior = ed.nextDouble();

                validacion_Lecuturas = validarLecturas(lectura_actual, lectura_anterior);

                if (!validacion_Lecuturas)
                    IO.println("Lecturas no validas. Ingrese de nuevamente! ");

            } while (!validacion_Lecuturas);

            consumo = calcularConsumo(lectura_anterior, lectura_actual);
            String mensaje = (consumo > 10000) ? "Supera el maximo permitido de 10,000 kWh, con : " + consumo + " kWh": "";
            IO.println(mensaje);

        } while (!validarConsumo(consumo));

        IO.println("Cuenta con apayo: (true / false) ");
        tieneApoyo = ed.nextBoolean();

        costo_consumo = calcularCostoConsumo(consumo);
        baseImponible = costo_consumo + cargo_fijo;
        impuesto = calcularImpuesto(baseImponible);
        descuento_apoyo = calcularDescuentoApoyo(consumo, baseImponible, tieneApoyo);
        total = calcularTotal(costo_consumo, cargo_fijo, descuento_apoyo, impuesto);

        mostrarRecibo(consumo, costo_consumo, descuento_apoyo, impuesto, total, baseImponible);

        ed.close();
    }

    // VALIDAR LECUTURAS
    public static boolean validarLecturas(double lectura_actual, double lectura_anterior) {
        if (lectura_anterior >= 0 && lectura_actual >= lectura_anterior)
            return true;
        else
            return false;
    }

    // CALCULAR CONSUMO
    public static double calcularConsumo(double lecturaAnterior, double lecturaActual) {
        return lecturaActual - lecturaAnterior;
    }

    // VALIDAR CONSUMO
    public static boolean validarConsumo(double consumo) {
        if (consumo <= 10000)
            return true;
        else
            return false;
    }

    // CALCULAR COSTO CONSUMO
    public static double calcularCostoConsumo(double consumo) {
        if (consumo <= 150) {
            return consumo * 1.20;
        } else if (consumo <= 400) {
            return (150 * 1.20) + ((consumo - 150) * 1.80);
        } else {
            return (150 * 1.20) + (250 * 1.80) + ((consumo - 400) * 2.75);
        }

    }

    // CALCULAR IMPUESTO
    public static double calcularImpuesto(double baseImponible) {
        return baseImponible * .16;
    }

    // CALCULAR DESCUENTO DE APOYO
    public static double calcularDescuentoApoyo(double consumo, double costoAntesImpuesto, boolean tieneApoyo) {
        if (tieneApoyo == true && consumo <= 250) {
            return costoAntesImpuesto * .3;
        }
        return 0.0;
    }

    // CALCULAR TOTAL
    public static double calcularTotal(double costoConsumo, double cargoFijo, double descuento, double impuesto) {
        return (costoConsumo - descuento) + cargoFijo + impuesto;
    }

    // MOSTRAR RECIBOimpuesto
    public static void mostrarRecibo(double consumo, double costoConsumo, double descuento, double impuesto,
            double total, double baseimponible) {

        IO.println("\n------------------------------TICKET----------------------------------");
        IO.println("Consumo: " + consumo + " kWh");
        IO.println("Costo consumo: " + costoConsumo + " $");
        IO.println("Descuento: " + ((descuento > 0.0) ? descuento + " $" : " No aplica"));
        IO.println("Costo con cargo fijo: " + baseimponible + " $");
        IO.println("Costo impuesto: " + impuesto + " $");
        IO.println("Total a pagar: " + total + " $");
        IO.println("------------------------------------------------------------------------");
    }
}

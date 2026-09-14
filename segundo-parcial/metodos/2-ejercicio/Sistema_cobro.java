import java.util.*;

public class Sistema_cobro {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("\n-----------------------SISTEMA DE COBRO-----------------------");

        int cantidad_producto = 0, tipo_cliente = 0, costo_envio = 0, suma_Tipoproductos = 0, suma_productos = 0;
        String codigo_postal = "", opcion = "";
        double precio_producto = 0.0, subtotal = 0.0, descuento = 0.0, subtotalConDescuento = 0.0, impuesto = 0.0,
                total = 0.0;

        do {

            do {
                IO.print("\nIngrese el precio del producto: ");
                precio_producto = sc.nextDouble();

                IO.print("Ingrese la cantidad de productos: ");
                cantidad_producto = sc.nextInt();

                if (!validarProducto(precio_producto, cantidad_producto)) {
                    IO.println("Productos no validos. Ingrese de nuevo! ");
                }

            } while (!validarProducto(precio_producto, cantidad_producto));

            subtotal += calcularSubtotal(precio_producto, cantidad_producto);
            suma_Tipoproductos++;
            suma_productos += cantidad_producto;

            IO.println("\nDesea agregar otro producto? (si/no): ");
            opcion = sc.next();

        } while (opcion.equals("si"));

        do {
            IO.print("\nIngrese el tipo de cliente: ");
            tipo_cliente = sc.nextInt();

            if (!validarTipoCliente(tipo_cliente)) {
                IO.println("\nTipo de cliente no válido. Ingrese nueva mente! ");
            }
        } while (!validarTipoCliente(tipo_cliente));

        do {
            IO.print("\n Ingrese el código postal: ");
            codigo_postal = sc.next();

            if (!validarCodigopostal(codigo_postal)) {
                IO.println("Codigo postal no valida, ingrese de nuevamente! ");
            }

        } while (!validarCodigopostal(codigo_postal));

        descuento = calcularDescuento(tipo_cliente, subtotal);
        costo_envio = calcularEnvio(subtotal);
        subtotalConDescuento = subtotal - descuento;
        impuesto = calcularImpuesto(subtotalConDescuento);
        total = calcularTotal(subtotal, descuento, impuesto, costo_envio);

        // MOSTRAR DATDOS

        tiket(tipo_cliente, codigo_postal, subtotal, suma_Tipoproductos, suma_productos, descuento,
                subtotalConDescuento, costo_envio, impuesto, total);

        sc.close();
    }

    // VALIDAR CANITIDAD Y PRECIO DEL PRODUCTO
    public static boolean validarProducto(double precio_producto, int cantidad_producto) {
        if (precio_producto > 0 && cantidad_producto > 0) {
            return true;
        } else {
            return false;
        }
    }

    // CALCULAR SUBTOTAL DE PRODUCTOS
    public static double calcularSubtotal(double precio_producto, int cantidad_producto) {
        return precio_producto * cantidad_producto;
    }

    // validar tipo de cliente
    public static boolean validarTipoCliente(int tipo_cliente) {
        if (tipo_cliente == 1 || tipo_cliente == 2) {
            return true;
        } else {
            return false;
        }
    }

    // Validar codigo postal
    public static boolean validarCodigopostal(String codigo_postal) {
        if (codigo_postal.length() == 5) {
            return true;
        } else {
            return false;
        }
    }

    // calcular Descuento
    public static double calcularDescuento(int tipo_cliente, double subtotal) {
        if (tipo_cliente == 1) {
            return 0.0;
        } else {
            return subtotal * 0.1;
        }
    }

    // Cacluclar envio
    public static int calcularEnvio(double subtotal) {
        if (subtotal < 1000) {
            return 150;
        } else if (subtotal >= 1000 && subtotal < 3000) {
            return 80;
        } else {
            return 0;
        }
    }

    // Calcular Envio

    public static double calcularImpuesto(double subtotalConDescuento) {
        return subtotalConDescuento * 0.16;
    }

    // Calcular total
    public static double calcularTotal(double subtotal, double descuento, double impuesto, double envio) {
        return (subtotal - descuento) + impuesto + envio;
    }

    public static void tiket(int tipoCliente, String postal, double subtotal, int tipoProductos, int sumaProductos,
            double descuento, double subtotalDescuento, double envio, double impuesto, double total) {

        IO.println("\n-----------------------------TICKET------------------------------");

        IO.println("\n----------------------------DATOS CLIENTE------------------------------");

        IO.println("Tipo de cliente: " + tipoCliente);
        IO.println("Codigo postal: " + postal);

        IO.println("\n--------------------------PRODUCTOS------------------------------");

        IO.println("Tipo de Productos: " + tipoProductos + " tipos");
        IO.println("Productos totales: " + sumaProductos + " productos");

        IO.println("\n-----------------------DESCUENTOS Y ENVIOS---------------------");

        IO.println("Total a pagar de productos : " + subtotal + " $");
        IO.println("Descuento: " + descuento + " $");
        IO.println("Total con descuento: " + subtotalDescuento + " $");
        IO.println("Total de envio: " + (envio == 0 ? "Gratis" : envio + " $"));
        IO.println("Total de impuesto: " + impuesto + " $");

        IO.println("\n----------------------------TOTAL A PAGAR------------------------------------");

        IO.println("Total a pagar: " + total + " $");

        IO.println("\n----------------------------------------------------------------");

    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Analisisestadistico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int respuesta = 0;
        do{
       
        System.out.print("Ingrese el número de sucursales a registrar: ");
        int numSucursales = scanner.nextInt();
        
        
        double[][] ventas = new double[numSucursales][12];
        
        
        for (int i = 0; i < numSucursales; i++) {
            System.out.println("\n--- Ingresando ventas para la Sucursal " + (i + 1) + " ---");
            for (int j = 0; j < 12; j++) {
                System.out.print("Ventas del mes " + (j + 1) + ": ");
                ventas[i][j] = scanner.nextDouble();
            }
        }

        double totalGlobal = 0;
        double[][] reporte = new double[numSucursales][5];

        System.out.println("\n--- REGISTRO ORIGINAL ---");
        for (int i = 0; i < numSucursales; i++) {
            double totalAnual = 0;
            double maxVenta = -1;
            int mejorMes = -1;
            
            double[] ventasSucursal = Arrays.copyOf(ventas[i], ventas[i].length);
            
            System.out.println("Sucursal " + (i + 1) + ": " + Arrays.toString(ventasSucursal));
            
           
            for (int mes = 0; mes < 12; mes++) {
                totalAnual += ventasSucursal[mes];
                if (ventasSucursal[mes] > maxVenta) {
                    maxVenta = ventasSucursal[mes];
                    mejorMes = mes + 1;
                }
            } 
            
            double promedioMensual = totalAnual / 12;
            totalGlobal += totalAnual;
            
            reporte[i][0] = i;              
            reporte[i][1] = totalAnual;    
            reporte[i][2] = promedioMensual;
            reporte[i][3] = mejorMes;       
            reporte[i][4] = maxVenta;      
        }

        double promedioGlobal = totalGlobal / numSucursales;

        
        Arrays.sort(reporte, (fila1, fila2) -> Double.compare(fila2[1], fila1[1]));

        System.out.println("\n--- REPORTE DE VENTAS (ORDENADO) ---");
        System.out.println("Promedio de ventas global: $" + String.format("%.2f", promedioGlobal));
        System.out.println("\nRanking de Sucursales:");
        
        for (int j = 0; j < reporte.length; j++) {
            int idSucursal = (int) reporte[j][0];
            double total = reporte[j][1];
            double promMensual = reporte[j][2];
            int mes = (int) reporte[j][3];
            double max = reporte[j][4];
            
            System.out.println("Sucursal " + (idSucursal + 1) + ":");
            System.out.println("  Total Anual: $" + String.format("%.2f", total));
            System.out.println("  Promedio Mensual: $" + String.format("%.2f", promMensual));
            System.out.println("  Mejor Mes: " + mes + " ($" + String.format("%.2f", max) + ")");
            
            if (total > promedioGlobal) {
                System.out.println("¡Superó el promedio global de la empresa!");
            }
            System.out.println();
            
        }
        System.out.println("¿Desea realizar otro análisis? (0/1): ");
         respuesta = scanner.nextInt();
    }while (respuesta == 1);
        
        scanner.close();
    }
}
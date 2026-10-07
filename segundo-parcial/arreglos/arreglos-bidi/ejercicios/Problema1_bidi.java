package ejercicios;
import java.util.Scanner;

public class Problema1_bidi {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de vendedores: ");
        int n = sc.nextInt();

        System.out.print("Cantidad de zonas: ");
        int m = sc.nextInt();

        int[][] ventas = new int[n][m];

    
        for (int i = 0; i < n; i++) {

            System.out.println("\nVendedor " + (i + 1));

            for (int j = 0; j < m; j++) {

                System.out.print("Computadoras vendidas en zona "
                        + (j + 1) + ": ");

                ventas[i][j] = sc.nextInt();
            }
        }

   
        System.out.println("\nVENTAS");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(ventas[i][j] + "\t");
            }

            System.out.println();
        }

    

        int total = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                total = total + ventas[i][j];
            }
        }

   

        int mayorZona = 0;
        int zonaMayor = 0;

        for (int j = 0; j < m; j++) {

            int sumaZona = 0;

            for (int i = 0; i < n; i++) {

                sumaZona = sumaZona + ventas[i][j];
            }

            if (sumaZona > mayorZona) {

                mayorZona = sumaZona;
                zonaMayor = j;
            }
        }

  

        int menorVenta = 0;
        int vendedorMenor = 0;

      
        for (int j = 0; j < m; j++) {

            menorVenta = menorVenta + ventas[0][j];
        }

      
        for (int i = 1; i < n; i++) {

            int sumaVendedor = 0;

            for (int j = 0; j < m; j++) {

                sumaVendedor = sumaVendedor + ventas[i][j];
            }

            if (sumaVendedor < menorVenta) {

                menorVenta = sumaVendedor;
                vendedorMenor = i;
            }
        }



        int mayorVenta = 0;
        int vendedorMayor = 0;

        for (int j = 0; j < m; j++) {

            mayorVenta = mayorVenta + ventas[0][j];
        }

        for (int i = 1; i < n; i++) {

            int sumaVendedor = 0;

            for (int j = 0; j < m; j++) {

                sumaVendedor = sumaVendedor + ventas[i][j];
            }

            if (sumaVendedor > mayorVenta) {

                mayorVenta = sumaVendedor;
                vendedorMayor = i;
            }
        }


  

        System.out.println("\nRESULTADOS");

        System.out.println("Zona que mas vendio: "
                + (zonaMayor + 1)
                + " con "
                + mayorZona
                + " computadoras.");

        System.out.println("Vendedor que menos vendio: "
                + (vendedorMenor + 1)
                + " con "
                + menorVenta
                + " computadoras.");

        System.out.println("Vendedor que mas vendio: "
                + (vendedorMayor + 1)
                + " con "
                + mayorVenta
                + " computadoras.");

        System.out.println("Total de computadoras vendidas: "
                + total);
                sc.close();
    }
}

package ejercicios;
import java.util.Scanner;

public class Problema3_bidi {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de estudiantes: ");
        int n = sc.nextInt();

        System.out.print("Cantidad de examenes: ");
        int m = sc.nextInt();

        double[][] calificaciones = new double[n][m];

        

        for (int i = 0; i < n; i++) {

            System.out.println("\nEstudiante " + (i + 1));

            for (int j = 0; j < m; j++) {

                System.out.print(
                        "Calificacion examen " + (j + 1) + ": ");

                calificaciones[i][j] = sc.nextDouble();
            }
        }

        

        double[] promedios = new double[n];

        for (int i = 0; i < n; i++) {

            double suma = 0;

            for (int j = 0; j < m; j++) {

                suma = suma + calificaciones[i][j];
            }

            promedios[i] = suma / m;
        }

        System.out.println("\nPROMEDIOS");

        for (int i = 0; i < n; i++) {

            System.out.println(
                    "Estudiante " + (i + 1)
                    + ": " + promedios[i]);
        }

        // ----------------------------------------
        // MEJOR PROMEDIO
        // ----------------------------------------

        double mejor = promedios[0];

        for (int i = 1; i < n; i++) {

            if (promedios[i] > mejor) {

                mejor = promedios[i];
            }
        }

        System.out.println("\nMEJOR PROMEDIO: " + mejor);

        System.out.println("Estudiantes con mejor promedio:");

        for (int i = 0; i < n; i++) {

            if (promedios[i] == mejor) {

                System.out.println(
                        "Estudiante " + (i + 1));
            }
        }

       

        System.out.println("\nESTUDIANTES ENTRE 9 Y 10");

        for (int i = 0; i < n; i++) {

            if (promedios[i] >= 9 && promedios[i] <= 10) {

                System.out.println(
                        "Estudiante " + (i + 1)
                        + " - Promedio: "
                        + promedios[i]);
            }
        }



        System.out.println("\nESTUDIANTES CON PROMEDIO MENOR A 7");

        for (int i = 0; i < n; i++) {

            if (promedios[i] < 7) {

                System.out.println(
                        "Estudiante " + (i + 1)
                        + " - Promedio: "
                        + promedios[i]);
            }
        }



        double mayorExamen = 0;
        int examenMayor = 0;

        for (int j = 0; j < m; j++) {

            double suma = 0;

            for (int i = 0; i < n; i++) {

                suma = suma + calificaciones[i][j];
            }

            double promedio = suma / n;

            if (j == 0 || promedio > mayorExamen) {

                mayorExamen = promedio;
                examenMayor = j;
            }
        }

        System.out.println("\nExamen con mayor promedio: "
                + (examenMayor + 1));

        System.out.println("Promedio: "
                + mayorExamen);



        double menorExamen = 0;
        int examenMenor = 0;

        for (int j = 0; j < m; j++) {

            double suma = 0;

            for (int i = 0; i < n; i++) {

                suma = suma + calificaciones[i][j];
            }

            double promedio = suma / n;

            if (j == 0 || promedio < menorExamen) {

                menorExamen = promedio;
                examenMenor = j;
            }
        }

        System.out.println("\nExamen con menor promedio: "
                + (examenMenor + 1));

        System.out.println("Promedio: "
                + menorExamen);

                sc.close();
    }
}
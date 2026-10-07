package ejercicios;
import java.util.Scanner;

public class Problema2_bidi {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        boolean llena = false;

        int opcion;

        do {

            System.out.println("\n===== MENU =====");

            System.out.println("1. Rellenar matriz");
            System.out.println("2. Suma de filas y columnas");
            System.out.println("3. Sumar una fila");
            System.out.println("4. Sumar una columna");
            System.out.println("5. Mayor y menor");
            System.out.println("6. Contar pares");
            System.out.println("7. Contar impares");
            System.out.println("8. Matriz con cuadrados");
            System.out.println("9. Sumar diagonal principal");
            System.out.println("10. Sumar diagonal inversa");
            System.out.println("11. Media de la matriz");
            System.out.println("12. Salir");

            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();


            if (opcion == 1) {

                for (int i = 0; i < 4; i++) {

                    for (int j = 0; j < 4; j++) {

                        boolean repetido;

                        do {

                            repetido = false;

                            System.out.print("Introduce valor ["
                                    + i + "][" + j + "]: ");

                            int numero = sc.nextInt();

                            // Revisar si ya existe
                            for (int x = 0; x < 4; x++) {

                                for (int y = 0; y < 4; y++) {

                                    if (matriz[x][y] == numero) {

                                        repetido = true;
                                    }
                                }
                            }

                            if (repetido) {

                                System.out.println(
                                        "Ese numero ya existe. Introduce otro.");

                            } else {

                                matriz[i][j] = numero;
                            }

                        } while (repetido);
                    }
                }

                llena = true;

                System.out.println("\nMatriz rellenada.");

            }

  
 

            else if (opcion >= 2 && opcion <= 11 && !llena) {

                System.out.println(
                        "Primero debes rellenar la matriz.");

            }

        
            else if (opcion == 2) {

                System.out.println("\nMatriz:");

                for (int i = 0; i < 4; i++) {

                    for (int j = 0; j < 4; j++) {

                        System.out.print(matriz[i][j] + "\t");
                    }

                    System.out.println();
                }

               
                System.out.println("\nSuma de filas:");

                for (int i = 0; i < 4; i++) {

                    int suma = 0;

                    for (int j = 0; j < 4; j++) {

                        suma = suma + matriz[i][j];
                    }

                    System.out.println(
                            "Fila " + (i + 1) + ": " + suma);
                }

                
                System.out.println("\nSuma de columnas:");

                for (int j = 0; j < 4; j++) {

                    int suma = 0;

                    for (int i = 0; i < 4; i++) {

                        suma = suma + matriz[i][j];
                    }

                    System.out.println(
                            "Columna " + (j + 1) + ": " + suma);
                }
            }

           

            else if (opcion == 3) {

                System.out.print("Que fila quieres sumar (1-4): ");
                int fila = sc.nextInt();

                if (fila >= 1 && fila <= 4) {

                    int suma = 0;

                    for (int j = 0; j < 4; j++) {

                        suma = suma + matriz[fila - 1][j];
                    }

                    System.out.println("Suma: " + suma);

                } else {

                    System.out.println("Fila incorrecta.");
                }
            }

            

            else if (opcion == 4) {

                System.out.print("Que columna quieres sumar (1-4): ");
                int columna = sc.nextInt();

                if (columna >= 1 && columna <= 4) {

                    int suma = 0;

                    for (int i = 0; i < 4; i++) {

                        suma = suma + matriz[i][columna - 1];
                    }

                    System.out.println("Suma: " + suma);

                } else {

                    System.out.println("Columna incorrecta.");
                }
            }

       

            else if (opcion == 5) {

                int mayor = matriz[0][0];
                int menor = matriz[0][0];

                int filaMayor = 0;
                int columnaMayor = 0;

                int filaMenor = 0;
                int columnaMenor = 0;

                for (int i = 0; i < 4; i++) {

                    for (int j = 0; j < 4; j++) {

                        if (matriz[i][j] > mayor) {

                            mayor = matriz[i][j];

                            filaMayor = i;
                            columnaMayor = j;
                        }

                        if (matriz[i][j] < menor) {

                            menor = matriz[i][j];

                            filaMenor = i;
                            columnaMenor = j;
                        }
                    }
                }

                System.out.println("Mayor: " + mayor);
                System.out.println("Posicion: ["
                        + filaMayor + "][" + columnaMayor + "]");

                System.out.println("Menor: " + menor);
                System.out.println("Posicion: ["
                        + filaMenor + "][" + columnaMenor + "]");
            }



            else if (opcion == 6) {

                int pares = 0;

                for (int i = 0; i < 4; i++) {

                    for (int j = 0; j < 4; j++) {

                        if (matriz[i][j] % 2 == 0) {

                            pares++;
                        }
                    }
                }

                System.out.println("Cantidad de pares: " + pares);
            }

            

            else if (opcion == 7) {

                int impares = 0;

                for (int i = 0; i < 4; i++) {

                    for (int j = 0; j < 4; j++) {

                        if (matriz[i][j] % 2 != 0) {

                            impares++;
                        }
                    }
                }

                System.out.println(
                        "Cantidad de impares: " + impares);
            }



            else if (opcion == 8) {

                int[][] cuadrados = new int[4][4];

                for (int i = 0; i < 4; i++) {

                    for (int j = 0; j < 4; j++) {

                        cuadrados[i][j] =
                                matriz[i][j] * matriz[i][j];
                    }
                }

                System.out.println("\nMatriz de cuadrados:");

                for (int i = 0; i < 4; i++) {

                    for (int j = 0; j < 4; j++) {

                        System.out.print(
                                cuadrados[i][j] + "\t");
                    }

                    System.out.println();
                }
            }



            else if (opcion == 9) {

                int suma = 0;

                for (int i = 0; i < 4; i++) {

                    suma = suma + matriz[i][i];
                }

                System.out.println(
                        "Suma diagonal principal: " + suma);
            }

            else if (opcion == 10) {

                int suma = 0;

                for (int i = 0; i < 4; i++) {

                    suma = suma + matriz[i][3 - i];
                }

                System.out.println(
                        "Suma diagonal inversa: " + suma);
            }


            else if (opcion == 11) {

                int suma = 0;

                for (int i = 0; i < 4; i++) {

                    for (int j = 0; j < 4; j++) {

                        suma = suma + matriz[i][j];
                    }
                }

                double media = suma / 16.0;

                System.out.println("Media: " + media);
            }


            else if (opcion == 12) {

                System.out.println("Programa terminado.");

            }

            else {

                System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 12);

        sc.close();
    }
}

import java.util.Scanner;

public class Cola {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] cola = new int[5];
        int frente = 0;
        int fin = 0;
        int opcion;

        do {
            System.out.println("\n--- COLAS ---");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar uno por uno");
            System.out.println("3. Eliminar por elemento");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    if (fin == cola.length) {
                        System.out.println(" cola  llena.");
                    } else {
                        System.out.print("Ingresa el elemento: ");
                        int elemento = sc.nextInt();
                        cola[fin] = elemento;
                        fin++;
                        System.out.println(" insertado.");
                    }
                    break;

                case 2:
                    if (frente == fin) {
                        System.out.println("La cola esta vacia.");
                    } else {
                        System.out.println("Elemento eliminado: " + cola[frente]);
                        frente++;

                        if (frente == fin) {
                            frente = 0;
                            fin = 0;
                        }
                    }
                    break;

                case 3:
    if (frente == fin) {
        System.out.println("Underflow (Cola Vacia).");
    } else {
        System.out.print("Ingrese el elemento a eliminar: ");
        int buscar = sc.nextInt();
        int posicionEncontrada = -1;

        
        for (int i = frente; i < fin; i++) {
            if (cola[i] == buscar) {
                posicionEncontrada = i;
                break; 
            }
        }

        if (posicionEncontrada == -1) {
            System.out.println("ELEMENTO NO ENCONTRADO");
        } else {
            
            int nuevosElementos = 0;
            for (int i = posicionEncontrada + 1; i < fin; i++) {
                cola[nuevosElementos] = cola[i];
                nuevosElementos++;
            }

            for (int i = nuevosElementos; i < fin; i++) {
                cola[i] = 0;
            }

            
            frente = 0;
            fin = nuevosElementos;

            System.out.println("Eliminados los primeros elementos hasta el buscado.");
        }
    }
    break;
                case 4:
                    if (frente == fin) {
                        System.out.println("colavacia.");
                    } else {

                        for (int i = frente; i < fin; i++) {
                            System.out.println(cola[i] + " ");
                        }

                    }
                    break;

                case 5:
                    System.out.println("");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}

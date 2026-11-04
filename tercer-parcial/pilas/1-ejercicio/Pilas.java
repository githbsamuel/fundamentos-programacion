
import java.util.Scanner;

public class Pilas {

    public static void main(String[] args) {

        Scanner ed = new Scanner(System.in);

        int[] pila = new int[5];
        int max = pila.length - 1, tope = -1;
        int op;

        do {
            System.out.println("----------- PILA ----------------------");
            System.out.println("1.- Insertar (Push)");
            System.out.println("2.- Eliminar ultimo (Pop)");
            System.out.println("3.- Eliminar por elemento");
            System.out.println("4.- Mostrar pila");
            System.out.println("0.- Salir");

            System.out.print("Ingrese una opcion: ");
            op = ed.nextInt();

            switch (op) {

                case 1:
                    if (tope == max) {
                        System.out.println("Overflow (PILA LLENA)");
                    } else {
                        System.out.print("Ingrese su valor: ");
                        tope++;
                        pila[tope] = ed.nextInt();
                        System.out.println("Elemento insertado.");
                    }
                    break;

                case 2:
                    if (tope == -1) {
                        System.out.println("Underflow (PILA VACIA)");
                    } else {
                        System.out.println("Pop: elemento eliminado: " + pila[tope]);
                        tope--;
                    }
                    break;

                case 3: 
                   if (tope < 0) {
                        System.out.println("Underflow (Pila Vacia).");
                    } else {
                        System.out.println("Ingrese el elemento a eliminar: ");
                        int buscar = ed.nextInt();
                        int posicionEncontrada = -1;

                        for (int i = tope; i >= 0; i--) {
                            if (pila[i] == buscar) {
                                posicionEncontrada = i;
                                break; 
                            }
                        }

                        if (posicionEncontrada == -1) {
                            System.out.println("ELEMENTO NO ENCONTRADO");
                        } else {
                            tope = posicionEncontrada - 1;
                            System.out.println("elimnado");
                        }
                    }
                    
                    break;

                case 4:
                    if (tope == -1) {
                        System.out.println("Pila vacia.");
                    } else {
                        System.out.println("Elementos de la pila:");

                        for (int i = tope; i >= 0; i--) {
                            System.out.println(pila[i]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

            System.out.println();

        } while (op != 0);

        ed.close();
    }
}

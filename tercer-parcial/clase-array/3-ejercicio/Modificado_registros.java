import java.util.Arrays;
import java.util.Scanner;

public class Modificado_registros {

    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        
        System.out.print("Ingrese el número de registros: ");
        int cantidad = ed.nextInt();
        
        int[] original = new int[cantidad];

        System.out.println("Ingrese los " + cantidad + " identificadores:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Registro " + (i + 1) + ": ");
            original[i] = ed.nextInt();
        }
        
        int[] copiaOrdenada = Arrays.copyOf(original, original.length);
        Arrays.sort(copiaOrdenada);
        
        int[] duplicadosTemp = new int[original.length];
        int countDuplicados = 0;
        
        for (int i = 0; i < copiaOrdenada.length - 1; i++) {
            if (copiaOrdenada[i] == copiaOrdenada[i + 1]) {
                
                boolean yaRegistrado = false;
                for (int j = 0; j < countDuplicados; j++) {
                    if (duplicadosTemp[j] == copiaOrdenada[i]) {
                        yaRegistrado = true;
                        break;
                    }
                }
                if (!yaRegistrado) {
                    duplicadosTemp[countDuplicados++] = copiaOrdenada[i];
                }
            }
        }
        
        int[] identificadoresDuplicados = Arrays.copyOf(duplicadosTemp, countDuplicados);

        int[] depuradoTemp = new int[original.length];
        int depuradoIndex = 0;
        int registrosEliminados = 0;
        
        for (int i = 0; i < original.length; i++) {
            int actual = original[i];
            boolean existe = false;
            
            for (int j = 0; j < depuradoIndex; j++) {
                if (depuradoTemp[j] == actual) {
                    existe = true;
                    break;
                }
            }
            
            if (!existe) {
                depuradoTemp[depuradoIndex++] = actual;
            } else {
                registrosEliminados++;
            }
        }
        
        int[] depuradoFinal = Arrays.copyOf(depuradoTemp, depuradoIndex);
        System.out.println();
        System.out.println("Arreglo original: " + Arrays.toString(original));
        System.out.println("Arreglo depurado: " + Arrays.toString(depuradoFinal));
        
        System.out.print("Identificadores duplicados: ");
        for (int i = 0; i < identificadoresDuplicados.length; i++) {
            System.out.print(identificadoresDuplicados[i] + (i < identificadoresDuplicados.length - 1 ? ", " : "\n"));
        }
        
        System.out.println("Registros eliminados: " + registrosEliminados);

        // ==========================================
        // CAMBIOS A PARTIR DE AQUÍ
        // ==========================================
        
        // Creamos la copia exacta sin los 5 espacios extra (para evitar que se llenen de 0s)
        int[] copia = Arrays.copyOf(depuradoFinal, depuradoFinal.length);
        
        System.out.println();
        System.out.println("-----------MENU---------");
        int op = 0;

        do {
            System.out.println("\n1.- Mostrar arreglo");
            System.out.println("2.- Insertar datos");
            System.out.println("0.- Salir");
            System.out.print("Opcion: ");
            op = ed.nextInt();
            
            switch(op) {
                case 1:
                    Arrays.sort(copia);
                    System.out.println("Arreglo: " + Arrays.toString(copia));
                    break;

                case 2:
                    System.out.print("Ingrese su valor: ");
                    int nuevoValor = ed.nextInt();
                    
                    // Verificar si el valor ya existe
                    boolean existeValor = false;
                    for (int i = 0; i < copia.length; i++) {
                        if (copia[i] == nuevoValor) {
                            existeValor = true;
                            break;
                        }
                    }
                    
                    if (existeValor) {
                        System.out.println("Error: El valor ya existe en el arreglo.");
                    } else {
                   
                        copia = Arrays.copyOf(copia, copia.length + 1);
                        
                     
                        copia[copia.length - 1] = nuevoValor;
                        System.out.println("Elemento insertado correctamente.");
                    }
                    break;

                case 0: 
                    System.out.println("Saliendo del programa...");
                    break;

                default: 
                    System.out.println("Opcion no valida");
            }

        } while(op != 0);
        
        ed.close();
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Deteccion_registros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuesta = 0;
        do{
        System.out.print("Ingrese el número de registros: ");
        int cantidad = scanner.nextInt();
        
        int[] original = new int[cantidad];
        

        System.out.println("Ingrese los " + cantidad + " identificadores:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Registro " + (i + 1) + ": ");
            original[i] = scanner.nextInt();
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

      
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Arreglo original: " + Arrays.toString(original));
        System.out.println("Arreglo depurado: " + Arrays.toString(depuradoFinal));
        
        System.out.print("Identificadores duplicados: ");
        if (identificadoresDuplicados.length == 0) {
            System.out.println("Ninguno");
        } else {
            for (int i = 0; i < identificadoresDuplicados.length; i++) {
                System.out.print(identificadoresDuplicados[i] + (i < identificadoresDuplicados.length - 1 ? ", " : "\n"));
            }
        }
        
        System.out.println("Registros eliminados: " + registrosEliminados);

        System.out.println("¿Repetir? (0/1): ");
        respuesta = scanner.nextInt();
    }while (respuesta == 1);
        scanner.close();
    }
}
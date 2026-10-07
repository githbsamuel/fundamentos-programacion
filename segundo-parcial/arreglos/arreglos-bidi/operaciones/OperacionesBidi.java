package operaciones;
import java.util.Scanner;

public class OperacionesBidi {
    
    public static void main(String[] args){
        
        Scanner ed = new Scanner(System.in);  
        int op;
        int filas = 2, columnas = 2;
        int[][] numeros = new int[filas][columnas]; 
        int cantidad = 0;
        
        do{
            menuOperaciones(cantidad);
            op = ed.nextInt();
            
            switch(op){ 
                
                case 1:  cantidad = rellenarArreglo(ed, cantidad, numeros, filas, columnas);                    break;               
                case 2:  insertar(ed, numeros, filas, columnas);                                                break;               
                case 3:  ordenar(numeros, filas, columnas);                                                     break;
                case 4:  editar(ed, numeros, filas, columnas);                                                  break;                
                case 5:  eliminar(ed, numeros, filas, columnas);                                                break;                
                case 6:  buscar(ed, numeros, filas, columnas);                                                  break;               
                case 7: mostrarArreglo(cantidad, numeros, filas, columnas);                                     break;
               
                case 0:  
                                          
                    break;
                
                default:
                    System.out.println("Opcion invalida");
                break;
            }
            
        } while(op != 0);
        
    }
    
    public static void menuOperaciones(int cantidad){
        System.out.println("\n----------OPERACIONES CON ARREGLOS BIDIMENSIONALES-----------");
        System.out.print(cantidad > 0 ? "" : "1.- Rellenar arreglo\n");
        System.out.println("2.- Insertar (en una posicion especifica)");
        System.out.println("3.- Ordenar (Metodo Insercion)");
        System.out.println("4.- Editar (buscar un valor y cambiarlo)");
        System.out.println("5.- Eliminar");
        System.out.println("6.- Buscar (Busqueda Secuencial)");
        System.out.println("7.- Mostrar");
        System.out.println("0.- Salir");
        System.out.print("Ingresa una opcion: ");
    }
    
    public static int rellenarArreglo(Scanner ed, int cantidad, int[][] numeros, int filas, int columnas){
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j ++){
                System.out.print("Ingrese el numero en ["+(i+1)+"] ["+(j+1)+"]: ");
                numeros[i][j] = ed.nextInt();
            }
        }
        cantidad++;
        return cantidad;
    }

    public static void insertar(Scanner ed, int[][] numeros, int filas, int columnas){
        System.out.print("Ingresa la fila (1 o 2): ");
        int f = ed.nextInt() - 1; 
        System.out.print("Ingresa la columna (1 o 2): ");
        int c = ed.nextInt() - 1;
        
        if(f >= 0 && f < filas && c >= 0 && c < columnas){
            System.out.print("Ingresa el nuevo valo:: ");
            numeros[f][c] = ed.nextInt();
            System.out.println("Insertado correctamente.");
        } else {
            System.out.println("fuera de rango.");
        }
    }

    public static void ordenar(int[][] numeros, int filas, int columnas){
        int totalDatos = filas * columnas;
        int[] temporal = new int[totalDatos];
        int k = 0;
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                temporal[k] = numeros[i][j];
                k++;
            }
        }
        
        for(int i = 1; i < totalDatos; i++){
            int actual = temporal[i];
            int j = i - 1;
            
            while(j >= 0 && temporal[j] > actual){
                temporal[j + 1] = temporal[j];
                j--;
            }
            temporal[j + 1] = actual;
        }
        
        k = 0;
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                numeros[i][j] = temporal[k];
                k++;
            }
        }
        System.out.println("arreglo ordenado.");
    }


    public static void editar(Scanner ed, int[][] numeros, int filas, int columnas){
        System.out.print("Ingrese el numero a editar: ");
        int viejo = ed.nextInt();
        boolean encontrado = false;
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                if(numeros[i][j] == viejo){
                    System.out.print("Nuevo valor: ");
                    numeros[i][j] = ed.nextInt();
                    encontrado = true;
                    System.out.println("actualizado");
                }
            }
        }
        
        if(encontrado == false){
            System.out.println("El numero no existe en el arreglo.");
        }
    }

    
    public static void eliminar(Scanner ed, int[][] numeros, int filas, int columnas){
        System.out.print("Ingrese el numero a eliminar: ");
        int borrar = ed.nextInt();
        boolean encontrado = false;
        
        for(int i = 0; i < filas; i++){
            if(encontrado == true ) break;
            for(int j = 0; j < columnas; j++){
                if(numeros[i][j] == borrar){                   
                    numeros[i][j] = -99; 
                    encontrado = true;
                    System.out.println("Valor eliminado.");
                    break;
                }
            }
        }
        
        if(encontrado == false){
            System.out.println("Ese numero no existe en el arreglo.");
        }
    }

    public static void buscar(Scanner ed, int[][] numeros, int filas, int columnas){
        System.out.print("Ingrese el numero a buscar: ");
        int busqueda = ed.nextInt();
        boolean encontrado = false;
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                if(numeros[i][j] == busqueda){
                    System.out.println("Numero encontrado en la fila [" + (i+1) + "] columna [" + (j+1) + "]");
                    encontrado = true;
                }
            }
        }
        
        if(encontrado == false){
            System.out.println("El numero no existe en el arreglo.");
        }
    }
    

    public static void mostrarArreglo(int cantidad, int[][] numeros, int filas, int columnas){
        if(cantidad == 0){
            System.out.println("Arreglo vacio");
        }
        else{
            System.out.println("Matriz: ");
            for(int i = 0; i < filas; i++){ 
                System.out.print("[");
                for(int j = 0; j < columnas; j ++){ 
                   
                    if(numeros[i][j] == -99) {
                        System.out.print("  ");
                    } else {
                        System.out.print(" " + numeros[i][j] + " ");
                    }
                }
                System.out.print("] \n");
            }
        }
    }
}
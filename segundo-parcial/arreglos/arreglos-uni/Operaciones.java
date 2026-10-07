


import java.util.*;
/**
 *
 * @author samuel_fd
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        
        int[] arreglo = new int[5];
        int cantidad = 0,opcion = 0;
        
        
        
        
        do{
            mostrarMenu();
            opcion = ed.nextInt(); 
            
            switch(opcion){
                case 1: cantidad = insertar(ed, cantidad, arreglo);              break;
                case 2: ordenarArreglo(cantidad, arreglo);                       break;
                case 3:  buscarDato(ed, cantidad, arreglo);                      break;
                case 4:  modicarDato(ed, cantidad, arreglo);                     break;
                case 5:  cantidad = eliminar(ed, cantidad, arreglo);                       break;
                case 6:  mostrarArreglo(cantidad, arreglo);                      break;
                
                case 0:  System.out.println("Salida!");                          break;
                
                default:   System.out.println("Opcion no valida!");               break;
                    
            }
            
            
            
            
        }while(opcion != 0);
        
        
    }
    public static void mostrarMenu(){
         System.out.println("\n---------- OPERACIONES CON ARREGLO ----------");
            System.out.println("1. Insertar");
            System.out.println("2. Ordenar por inserción");
            System.out.println("3. Buscar secuencialmente");
            System.out.println("4. Modificar");
            System.out.println("5. Eliminar");
            System.out.println("6. Mostrar arreglo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
    }
    public static int insertar(Scanner ed, int cantidad, int[] arreglo) {
        if (cantidad < arreglo.length) {
            System.out.print("Introduce el número a insertar: ");
            int numero = ed.nextInt();
            
            arreglo[cantidad] = numero; 
            cantidad++; 
            System.out.println("¡Número insertado con éxito!");
        } else {
            System.out.println("¡Arreglo lleno! No se puede insertar.");
        }
        return cantidad; 
    }
    
    public static void ordenarArreglo(int cantidad, int[] arreglo){
        int aux;
        
        if(cantidad == 0 ){
            System.out.println("Arreglo vacio");   
        }
        else if(cantidad < 2){
            System.out.println("No hay suficientes datos para ordenar");
        }
        else{
            for(int i = 0; i < cantidad ; i++){
                int pos = i;
                aux = arreglo[i];
                while((pos > 0) && (arreglo[pos - 1] > aux)){
                    arreglo[pos] = arreglo[pos - 1];
                    pos--;
                }
               arreglo[pos] = aux;
            }
            System.out.println("Arreglo Ordenado!");
        }
        
        
    }
    
    public static void mostrarArreglo(int cantidad, int[] arreglo) {
        if (cantidad == 0) {
            System.out.println("El arreglo está vacío.");
        } else {
            System.out.print("\nArreglo actual: [ ");
            for (int i = 0; i < cantidad; i++) {
                System.out.print(arreglo[i] + "  ");
            }
            System.out.println(" ]");
        }
    }
    
    public static void buscarDato(Scanner ed, int cantidad, int[] arreglo ){
        int encontrado = 0;
        
        if(cantidad == 0 ){
            System.out.println("Arreglo vacio");
        }
        else{
            System.out.print("Ingrese el dato para buscar: ");
            int busqueda = ed.nextInt();
            for(int i = 0; i < cantidad; i++){
                if(busqueda == arreglo[i]){
                    encontrado = i;    
                    break;
                }        
            }
             if(encontrado == 0 ){
                 System.out.println("Dato no encontrado!");
                 
             }
             else{
                 
                  System.out.println("Dato encontrando!, en la posicion: "+ (encontrado + 1));
             }
            
        }
      
    }
    public static void modicarDato(Scanner ed, int cantidad, int[] arreglo){
       int posicionModificar = 0;
        
        if(cantidad == 0 ){
            System.out.println("Arreglo vacio");
        }
        else{
            System.out.print("Ingrese el dato para moficar: ");
            int viejo = ed.nextInt();
            for(int i = 0; i < cantidad; i++){
                if(arreglo[i] == viejo ){
                    posicionModificar = i;    
                    break;
                }        
            }
             if(posicionModificar == 0 ){
                 System.out.println("Dato no encontrado!");
                 
             }
             else{
                  System.out.print("Ingresa el nuevo número: ");
                  int nuevo = ed.nextInt();

                  arreglo[posicionModificar] = nuevo;

                  System.out.println("Elemento modificado correctamente.");
                 
                  
             }
            
        }
        
      
    }
    public static int eliminar(Scanner ed, int cantidad, int[] arreglo){
        int posicionEliminar = -1;
        
        if(cantidad == 0 ){
            System.out.println("Arreglo vacio");
        }
        else{
            System.out.print("Ingrese el dato para eliminar: ");
            int viejo = ed.nextInt();
            for(int i = 0; i < cantidad; i++){
                if(arreglo[i] == viejo ){
                    posicionEliminar = i;    
                    break;
                }        
            }
             if(posicionEliminar != 0 ){
                 System.out.println("Dato no encontrado!");
                 
             }
             else{
                  for (int i = posicionEliminar; i < cantidad - 1; i++) {
                            arreglo[i] = arreglo[i + 1];
                        }
                        cantidad--;
                        System.out.println("Elemento eliminado correctamente.");
                 
                  
             }
            
        }
        return cantidad;
    }
    
}

import java.util.Scanner;

public class Pilas {

    
    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        
        int[] pila = new int[5];
        int max = pila.length - 1, tope = -1;
        int op = 0;
        do{
            
        System.out.println("----------- PILA ----------------------");
        System.out.println("1 . - Insertar ");
        System.out.println("2 . - Eliminar ");
        System.out.println("3 . - Mostrar pila");
        System.out.println("0 . - Salir ");
        
        System.out.println("Ingrese una opcion: ");
         op = ed.nextInt();
        
        System.out.println("\n");
        switch(op){
            case 1:
                if(tope == max){
                    System.out.println("Overflow (PILA LLENA)");
                    break;
                }
                else{
                for(int i = 0 ; i <= max ; i++){
                    
                    tope++;
                    System.out.print("Ingrese su valor: ");
                    pila[tope] = ed.nextInt();
                    break;  
                } 
                }
                break;
                
            case 2:
                
                   
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
            
            case 3:
                if(tope < 0){
                
                    System.out.println("Pila Vacia");     
                } 
                 else {
                    System.out.println("\n");
                    for(int i = tope;  i >=0 ; i--){
                    
                    System.out.println(pila[i]);
                   
               }
                }
                
                break;
            
            case 0: break;
            
            
            default:
                System.out.println("Opcion no valida!");
                
                break;
        }
        }while(op != 0);
       
        ed.close();
    }
}
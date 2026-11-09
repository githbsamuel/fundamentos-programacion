import java.util.*;

public class Sistema_clientes {
    void main(){
        Scanner ed = new Scanner(System.in);

        List<Integer> turno = new LinkedList<>();
        List<String> nombre = new LinkedList<>();

        int op = 0;

        System.out.println("========= SISTEMA DE ATENCION DE CLIENTES ============\n");

        do {
            mostrarMenu();
            op = ed.nextInt();

            switch (op) {
                case 1:
                  
                    int existe = 0;
                    do {
                        System.out.print("\nNumero de turno: ");
                        int tur = ed.nextInt();

                        if (turno.contains(tur)) {
                            System.out.println("\nTurno existente\n");
                            existe = -1;
                        } else {
                            turno.add(tur); 
                            break;
                        }
                    } while (existe == -1);

                    System.out.print("Nombre del cliente: ");
                    String nom = ed.next();
                    nombre.add(nom);
                    
                    System.out.println("Cliente registrado en la fila.");
                    break;
                
                case 2: 
                    
                    if (turno.isEmpty()) {
                        System.out.println("No hay clientes en espera.");
                    } else {
                        System.out.println("\nAtendiendo al cliente:");
                        System.out.println("Turno: " + turno.get(0) + " | Nombre: " + nombre.get(0));
                        
                      
                        turno.remove(0);
                        nombre.remove(0);
                    }
                    break;

                case 3:
                   
                    if (turno.isEmpty()) {
                        System.out.println("No hay clientes en espera.");
                    } else {
                        System.out.println("\nSiguiente cliente a atender:");
                      
                        System.out.println("Turno: " + turno.get(0) + " | Nombre: " + nombre.get(0));
                    }
                    break;

                case 4:
                   
                    if (turno.isEmpty()) {
                        System.out.println("No hay clientes en espera.");
                    } else {
                        System.out.println("\nClientes en la fila de espera:");
                        for (int i = 0; i < nombre.size(); i++) {
                            System.out.println("Turno: " + turno.get(i) + " | Nombre: " + nombre.get(i));
                        }
                    }
                    break;

                case 5:
                    
                    int cantidad = nombre.size();
                    System.out.println("\nActualmente hay " + cantidad + " clientes esperando en la fila.");
                    break;

                case 6:
                  
                    System.out.print("\nIngrese el numero de turno a cancelar: ");
                    int tur_cancelar = ed.nextInt();

                    if (turno.contains(tur_cancelar)) {
                        
                        int indice = turno.indexOf(tur_cancelar);
                        System.out.println("El turno " + turno.get(indice) + " de " + nombre.get(indice) + " ha sido cancelado.");
                        
                        turno.remove(indice);
                        nombre.remove(indice);
                    } else {
                        System.out.println("Turno no econtrado");
                    }
                    break;

                case 0:
                    
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (op != 0);

        ed.close();
    }

    static void mostrarMenu() {
        System.out.println("\n1. Registrar cliente");
        System.out.println("2. Atender al siguiente cliente");
        System.out.println("3. Mostrar el proximo a ser atendido");
        System.out.println("4. Mostrar todos los clientes pendientes");
        System.out.println("5. Consultar total de clientes en espera");
        System.out.println("6. Cancelar un turno especifico");
        System.out.println("0. Salir\n");
        System.out.print("Selecciona una opcion: ");
    }
    
}

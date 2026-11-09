import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sistema_tareas {

    void main(){
        Scanner ed = new Scanner(System.in);

        
        List<String> identificador = new LinkedList<>();
        List<String> descripcion = new LinkedList<>();
        List<String> prioridad = new LinkedList<>();
        List<String> estado = new LinkedList<>(); 

        int op = 0;

        System.out.println("========= SISTEMA DE GESTION DE TAREAS ============\n");

        do {
            mostrarMenu();
            op = ed.nextInt();

            switch (op) {
                case 1:
                    
                    System.out.println("\ndonde deseas agregar la tarea?");
                    System.out.println("1. al inicio de la lista");
                    System.out.println("2. al final de la lista");
                    System.out.print("Opcion: ");
                    int lugar = ed.nextInt();

                    int existe = 0;
                    String id_tarea = "";
                    do {
                        System.out.print("\nIdentificador de la tarea: ");
                        id_tarea = ed.next();

                        if (identificador.contains(id_tarea)) {
                            System.out.println("\nIdentificador existenten");
                            existe = -1;
                        } else {
                            existe = 0;
                        }
                    } while (existe == -1);

                    System.out.print("dscripcion: ");
                    String desc = ed.next();

                    System.out.print("prioridad alta,media,baja): ");
                    String prio = ed.next();

                    if (lugar == 1) {
                        
                        identificador.add(0, id_tarea);
                        descripcion.add(0, desc);
                        prioridad.add(0, prio);
                        estado.add(0, "pendiente");
                        System.out.println("tarea agregada al inicio");
                    } else {
                        
                        identificador.add(id_tarea);
                        descripcion.add(desc);
                        prioridad.add(prio);
                        estado.add("pendiente");
                        System.out.println("Tarea agregada al final");
                    }
                    break;
                
                case 2: 
                   
                    System.out.print("\nIngrese la posicion (0 inicio): ");
                    int pos = ed.nextInt();

                    

                    if (pos >= 0 && pos <= identificador.size()) {
                        System.out.print("identificador: ");
                        String id_nueva = ed.next();
                        
                        if (identificador.contains(id_nueva)) {
                            System.out.println("El identificador ya existe ");
                        } else {
                            System.out.print("descripcion: ");
                            String desc_nueva = ed.next();
                            System.out.print("Prioridad: ");
                            String prio_nueva = ed.next();

                            
                            identificador.add(pos, id_nueva);
                            descripcion.add(pos, desc_nueva);
                            prioridad.add(pos, prio_nueva);
                            estado.add(pos, "pendiente");
                            System.out.println("Tarea insertada en la posicion " + pos);
                        }
                    } else {
                        System.out.println("Posicion no valida");
                    }
                    break;

                case 3:
                   
                    System.out.print("\nIngrese el identificador a eliminar: ");
                    String id_eliminar = ed.next();

                    int indice = identificador.indexOf(id_eliminar);

                    if (indice == -1) {
                        System.out.println("Tarea no encontrada");
                    } else {
                        identificador.remove(indice);
                        descripcion.remove(indice);
                        prioridad.remove(indice);
                        estado.remove(indice);
                        System.out.println("Tarea eliminada");
                    }
                    break;

                case 4:
                   
                    System.out.print("\nIngrese la descripcion a buscar: ");
                    String desc_buscar = ed.next();
                    boolean encontrada = false;

                    for (int i = 0; i < descripcion.size(); i++) {
                       
                        if (descripcion.get(i).toLowerCase().contains(desc_buscar.toLowerCase())) {
                            System.out.println("id: " + identificador.get(i) + " | desc: " + descripcion.get(i) + " | prio: " + prioridad.get(i) + " | etado: " + estado.get(i));
                            encontrada = true;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("no se encontro ninguna tarea");
                    }
                    break;

                case 5:
                   
                    System.out.println("\n--- TAREAS PENDIENTES ---");
                    int pendientes = 0;
                    for (int i = 0; i < identificador.size(); i++) {
                        if (estado.get(i).equals("Pendiente")) {
                            System.out.println("id: " + identificador.get(i) + " | desc: " + descripcion.get(i) + " | Prioridad: " + prioridad.get(i));
                            pendientes++;
                        }
                    }
                    if (pendientes == 0) {
                        System.out.println("No hay tareas pendientes");
                    }
                    break;

                case 6:
                    
                    System.out.print("\nIngrese el identificador de la tarea completada: ");
                    String id_completar = ed.next();

                    indice = identificador.indexOf(id_completar);

                    if (indice == -1) {
                        System.out.println("Tarea no encontrada");
                    } else {
                        estado.set(indice, "Completada");
                        System.out.println("La tarea " + id_completar + " a sido completada");
                    }
                    break;

                case 7:
                   
                    if (identificador.isEmpty()) {
                        System.out.println("\nLa lista de tareas esta vacia");
                    } else {
                        System.out.println("\n--- PRIMERA TAREA ---");
                        System.out.println("id: " + identificador.get(0) + " | desc: " + descripcion.get(0));
                        
                        System.out.println("--- ULTIMA TAREA ---");
                        int ultimo = identificador.size() - 1;
                        System.out.println("id: " + identificador.get(ultimo) + " | desc: " + descripcion.get(ultimo));
                    }
                    break;
                        
                case 8:
                    
                    System.out.println("\n--- TAREAS EN ORDEN INVERSO ---");
                    if (identificador.isEmpty()) {
                        System.out.println("No hay tareas");
                    } else {
                      
                        for (int i = identificador.size() - 1; i >= 0; i--) {
                            System.out.println("id: " + identificador.get(i) + " | desc: " + descripcion.get(i) + " | dstado: " + estado.get(i));
                        }
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
        System.out.println("\n1. Agregar tarea (al inicio o final)");
        System.out.println("2. Insertar tarea en posicion especifica");
        System.out.println("3. Eliminar tarea por identificador");
        System.out.println("4. Buscar tarea por descripcion");
        System.out.println("5. Mostrar todas las tareas pendientes");
        System.out.println("6. Marcar tarea como completada");
        System.out.println("7. Mostrar la primera y ultima tarea");
        System.out.println("8. Recorrer la lista en orden inverso");
        System.out.println("0. Salir\n");
        System.out.print("Selecciona una opcion: ");
    
    }
    
}

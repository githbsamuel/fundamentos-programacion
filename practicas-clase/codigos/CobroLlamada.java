import java.util.Scanner;

public class CobroLlamada {
    void main() {
        Scanner ed = new Scanner(System.in);

        double tiempo_llamada, cobro_llamada, total, imp;
        String dia, turno;

        IO.println("Ingrese el tiempo de llamada:  ");
        tiempo_llamada = ed.nextDouble();
        IO.println("Ingrese el dia: ");
        dia = ed.next();
        IO.println("Ingrese el turno: ");
        turno = ed.next();

        if (tiempo_llamada <= 5) {
            cobro_llamada = tiempo_llamada * 1;
        } else if (tiempo_llamada > 5 && tiempo_llamada <= 8) {
            cobro_llamada = 5 + ((tiempo_llamada - 5) * .80);
        } else if (tiempo_llamada > 8 && tiempo_llamada <= 10) {
            cobro_llamada = 7.4 + ((tiempo_llamada - 8) * .70);
        } else {
            cobro_llamada = 8.8 + ((tiempo_llamada - 10) * .50);

        }

        if (dia.equals("domingo")) {
            imp = cobro_llamada * .03;
        } else if (turno.equals("matutino")) {
            imp = cobro_llamada * 0.15;
        } else {
            imp = cobro_llamada * 0.10;
        }
        total = cobro_llamada + imp;
        IO.println(" ");
        IO.println("Dia: " + dia + " y turno: " + turno);
        IO.println("Impuestos por llamada: " + imp);
        IO.println("El total a cobrar es: " + total);

        ed.close();
    }
}

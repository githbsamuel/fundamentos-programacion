Algoritmo Problema4
    
    Definir costoCita, totalPagado, cita Como Entero
    
    costoCita = 0
    totalPagado = 0
    
    Escribir "Ingrese el número de cita: "
    Leer cita
    
    Si cita <= 3 Entonces
        costoCita = 900
        totalPagado = cita * 900
    Sino
        Si cita <= 5 Entonces
            costoCita = 800
            totalPagado = (3 * 900) + ((cita - 3) * 800)
        Sino
            Si cita <= 8 Entonces
                costoCita = 600
                totalPagado = (3 * 900) + (2 * 800) + ((cita - 5) * 600)
            Sino
                costoCita = 500
                totalPagado = (3 * 900) + (2 * 800) + (3 * 600) + ((cita - 8) * 500)
            FinSi
        FinSi
    FinSi
    
    Escribir "El costo de la cita es: $", costoCita
    Escribir "El total pagado por el tratamiento es: $", totalPagado
    
FinAlgoritmo

Algoritmo Problema6
    
    Definir horas, costoTotal Como Entero
    
    Escribir "Ingrese el número de horas que el cliente ha utilizado el estacionamiento: "
    Leer horas
    
    costoTotal = 0
    
    Si horas <= 2 Entonces
        costoTotal = horas * 30
    Sino
        Si horas <= 5 Entonces
            costoTotal = (2 * 30) + ((horas - 2) * 25)
        Sino
            Si horas <= 10 Entonces
                costoTotal = (2 * 30) + (3 * 25) + ((horas - 5) * 20)
            Sino
                costoTotal = 380
            FinSi
        FinSi
    FinSi
    
    Escribir "El costo total del estacionamiento es: $", costoTotal
    
FinAlgoritmo

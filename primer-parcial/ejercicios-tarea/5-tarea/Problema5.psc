Algoritmo Problema5
    
    Definir peso, zona, costoPorGramo, costoTotal Como Entero
    
    Escribir "Ingrese el peso del paquete en gramos: "
    Leer peso
    
    Escribir "Ingrese la zona de destino (1-5): "
    Leer zona
    
    costoPorGramo = 0
    
    Si zona == 1 Entonces
        costoPorGramo = 11
    Sino
        Si zona == 2 Entonces
            costoPorGramo = 10
        Sino
            Si zona == 3 Entonces
                costoPorGramo = 12
            Sino
                Si zona == 4 Entonces
                    costoPorGramo = 25
                Sino
                    Si zona == 5 Entonces
                        costoPorGramo = 30
                    Sino
                        Escribir "Zona inválida"
                    FinSi
                FinSi
            FinSi
        FinSi
    FinSi
    
    costoTotal = peso * costoPorGramo
    Escribir "El costo total del envío es: $", costoTotal
    
FinAlgoritmo

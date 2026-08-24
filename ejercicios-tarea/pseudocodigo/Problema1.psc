Algoritmo Problema1
    

    Definir precio_inicial, cantidad_kilos, precio_final, total Como Real
    Definir tipo_uva Como Caracter
    Definir tamano_uva Como Entero
    

    Escribir "Ingrese el precio inicial del kilo de uva: "
    Leer precio_inicial
    Escribir "Ingrese la cantidad de kilos de uva: "
    Leer cantidad_kilos
    Escribir "Ingrese el tipo de uva (A o B): "
    Leer tipo_uva
    Escribir "Ingrese el tamaño de la uva (1 o 2): "
    Leer tamano_uva
    
    precio_final = 0
    
 
    Si tipo_uva == "A" Entonces
        Si tamano_uva == 1 Entonces
            precio_final = precio_inicial + 0.20
        Sino
            Si tamano_uva == 2 Entonces
                precio_final = precio_inicial + 0.30
            FinSi
        FinSi
    Sino
        Si tipo_uva == "B" Entonces
            Si tamano_uva == 1 Entonces
                precio_final = precio_inicial - 0.30
            Sino
                Si tamano_uva == 2 Entonces
                    precio_final = precio_inicial - 0.50
                FinSi
            FinSi
        FinSi
    FinSi
    
 
    total  = precio_final * cantidad_kilos
    
     Salida de resultados
    Escribir ""
    Escribir "El total a recibir por la uva es: ", total
    Escribir "El precio final por kilo de uva es: ", precio_final
    
FinAlgoritmo

Algoritmo Problema2
    
    Definir velocidad, resultado Como Entero
    Definir cumpleanos Como Logico
    
    Leer velocidad
    Leer cumpleanos
    
    resultado = 0
    
    Si cumpleanos == Verdadero Entonces
        Si velocidad <= 65 Entonces
            resultado = 0
        Sino
            Si velocidad >= 66 Y velocidad <= 85 Entonces
                resultado = 1
            Sino
                Si velocidad >= 86 Entonces
                    resultado =  2
                FinSi
            FinSi
        FinSi
    Sino
        Si velocidad <= 60 Entonces
            resultado = 0
        Sino
            Si velocidad >= 61 Y velocidad <= 80 Entonces
                resultado = 1
            Sino
                Si velocidad >= 81 Entonces
                    resultado == 2
                FinSi
            FinSi
        FinSi
    FinSi
    
    Escribir ""
    Escribir "(0 = sin multa, 1 = multa pequeña, 2 = multa grande):"
    Escribir ""
    Escribir "El resultado es: ", resultado
    
FinAlgoritmo

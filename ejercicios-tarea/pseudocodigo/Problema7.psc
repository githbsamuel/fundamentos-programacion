Algoritmo Problema7
    
    Definir edad Como Entero
    Definir beca, promedio Como Real
    
    beca = 0
    
    Escribir "Ingrese la edad del estudiante: "
    Leer edad
    
    Escribir "Ingrese el promedio del estudiante: "
    Leer promedio
    
    Si edad > 18 Entonces
        Si promedio >= 9 Entonces
            beca = 10000
        Sino
            Si promedio >= 7.5 Entonces
                beca = 8000
            Sino
                Si promedio >= 6 Entonces
                    beca = 5000
                Sino
                    Escribir "estudie más en el próximo ciclo escolar."
                FinSi
            FinSi
        FinSi
    Sino
        Si promedio >= 9 Entonces
            beca = 8000
        Sino
            Si promedio >= 8 Entonces
                beca = 6000
            Sino
                Si promedio >= 6 Entonces
                    beca = 4000
                Sino
                    Escribir "estudie más en el próximo ciclo escolar."
                FinSi
            FinSi
        FinSi
    FinSi
    
    Si beca > 0 Entonces
        Escribir "El estudiante recibirá una beca de: $", beca
    FinSi
    
FinAlgoritmo

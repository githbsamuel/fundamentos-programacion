Algoritmo NumeroMayor
    Definir n1, n2, n3 Como Entero
    
    Escribir "Ingrese el primer numero: "
    Leer n1
    Escribir "Ingrese el segundo numero: "
    Leer n2
    Escribir "Ingrese el tercer numero: "
    Leer n3
    
    Si n1 == n2 Y n2 == n3 Entonces
        Escribir "Los tres numeros son iguales"
    Sino
        Si n1 == n2 Y n1 > n3 Entonces
            Escribir "El primero y segundo son iguales y mayores que el tercero: ", n1
        Sino
            Si n1 == n3 Y n1 > n2 Entonces
                Escribir "El primero y tercero son iguales y mayores que el segundo: ", n1
            Sino
                Si n2 == n3 Y n2 > n1 Entonces
                    Escribir "El segundo y tercero son iguales y mayores que el primero: ", n2
                Sino
                    Si n1 > n2 Y n1 > n3 Entonces
                        Escribir "El primer numero es el mayor: ", n1
                    Sino
                        Si n2 > n1 Y n2 > n3 Entonces
                            Escribir "El segundo numero es el mayor: ", n2
                        Sino
                            Escribir "El tercer numero es el mayor: ", n3
                        FinSi
                    FinSi
                FinSi
            FinSi
        FinSi
    FinSi
FinAlgoritmo

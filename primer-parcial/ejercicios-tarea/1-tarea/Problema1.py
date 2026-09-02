

"""
         * Problema:
         * La sociación de vinicultores tiene como política fijar un precio inicial al
         * kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
         * Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se
         * requiere determinar cuánto recibirá un productor por la uva que entrega en un
         * embarque, considerando lo siguiente: si es de tipo A, se le cargan 20¢ al
         * precio inicial cuando es de tamaño 1; y 30¢ si es de tamaño 2. Si es de tipo
         * B, se rebajan 30¢ cuando es de tamaño 1, y 50¢ cuando es de tamaño 2

"""
kilos = int(input("Ingrese la cantidad de kilos de uva:  "))
precio_inicial  = float(input("Ingrese el precio inicial por kilo de uva:  "))
clasificacion = input("Ingrese la clasificación de la uva (A o B):  ")
tamaño = int(input("Ingrese el tamaño de la uva (1 o 2) "))

if clasificacion == "A" and tamaño == 1:
    precio_final = precio_inicial + 0.20
elif clasificacion == "A" and tamaño == 2:
    precio_final = precio_inicial + 0.30
elif clasificacion == "B" and tamaño == 1:
    precio_final = precio_inicial - 0.30
elif clasificacion == "B" and tamaño == 2:
    precio_final = precio_inicial - 0.50
    
total = kilos * precio_final
print("El total a recibir por la uva es: ", total)

                   

                   


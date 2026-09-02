Algoritmo Areas
	Definir op, b, h, r Como Entero
	Escribir '1. - Cuadrado'
	Escribir '2. - Rectangulo'
	Escribir '3. - Triangulo'
	Escribir '4. - Circulo'
	Escribir 'Ingrese la opcion: '
	Leer op
	Según op Hacer
		1:
			Escribir '---------- CUADRADO ----------'
			Escribir 'Ingrese el tamnio del lado: '
			Leer b
			area <- b*b
			Escribir 'El area del cuadrado es: ', area, ' m^2'
		2:
			Escribir '---------- RECTANGULO ----------'
			Escribir 'Ingrese el tamnio de la base: '
			Leer b
			Escribir 'Ingrese el tamnio de la altura: '
			Leer h
			area <- b*h
			Escribir 'El area del rectangulo es: ', area, ' m^2'
		3:
			Escribir '---------- TRIANGULO ----------'
			Escribir 'Ingrese el tamnio de la base: '
			Leer b
			Escribir 'Ingrese el tamnio de la altura: '
			Leer h
			area <- (b*h)/2
			Escribir 'El area del triangulo es: ', area, ' m^2'
		4:
			Escribir '---------- CIRCULO ----------'
			Escribir 'Ingrese el radio del circulo: '
			Leer r
			area <- 3.1416*(r*r)
			Escribir 'El area del circulo es: ', area, ' m^2'
		De Otro Modo:
			Escribir ' Caracter no valido. Ingrese de nuevo! '
	FinSegún
FinAlgoritmo

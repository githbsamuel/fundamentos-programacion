Algoritmo Horario
	Definir hour Como Entero
	Escribir 'Ingrese la hora (sin minutos): '
	Leer hour
	Si hour>=0 Y hour<=5 Entonces
		Escribir 'Buenas noches! :) '
	SiNo
		Si hour>=6 Y hour<=12 Entonces
			Escribir 'Buenos dias! :) '
		SiNo
			Si hour>=13 Y hour<=20 Entonces
				Escribir 'Buenas tardes! :) '
			SiNo
				Si hour>=21 Y hour<=24 Entonces
					Escribir 'Buenas noches! :) '
				SiNo
					Escribir 'Hora no valida, ingrese de nuevo!.'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo

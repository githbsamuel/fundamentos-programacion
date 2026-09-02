Algoritmo Horospoco
	Definir dia, mes Como Entero
	Escribir 'Ingresa tu día de nacimiento (número):'
	Leer dia
	Escribir 'Ingresa tu mes de nacimiento (1 a 12):'
	Leer mes
	Según mes Hacer
		1:
			Si dia<=19 Entonces
				Escribir 'Tu signo es Capricornio'
			SiNo
				Escribir 'Tu signo es Acuario'
			FinSi
		2:
			Si dia<=18 Entonces
				Escribir 'Tu signo es Acuario'
			SiNo
				Escribir 'Tu signo es Piscis'
			FinSi
		3:
			Si dia<=20 Entonces
				Escribir 'Tu signo es Piscis'
			SiNo
				Escribir 'Tu signo es Aries'
			FinSi
		4:
			Si dia<=19 Entonces
				Escribir 'Tu signo es Aries'
			SiNo
				Escribir 'Tu signo es Tauro'
			FinSi
		5:
			Si dia<=20 Entonces
				Escribir 'Tu signo es Tauro'
			SiNo
				Escribir 'Tu signo es Géminis'
			FinSi
		6:
			Si dia<=20 Entonces
				Escribir 'Tu signo es Géminis'
			SiNo
				Escribir 'Tu signo es Cáncer'
			FinSi
		7:
			Si dia<=22 Entonces
				Escribir 'Tu signo es Cáncer'
			SiNo
				Escribir 'Tu signo es Leo'
			FinSi
		8:
			Si dia<=22 Entonces
				Escribir 'Tu signo es Leo'
			SiNo
				Escribir 'Tu signo es Virgo'
			FinSi
		9:
			Si dia<=22 Entonces
				Escribir 'Tu signo es Virgo'
			SiNo
				Escribir 'Tu signo es Libra'
			FinSi
		10:
			Si dia<=22 Entonces
				Escribir 'Tu signo es Libra'
			SiNo
				Escribir 'Tu signo es Escorpión'
			FinSi
		11:
			Si dia<=21 Entonces
				Escribir 'Tu signo es Escorpión'
			SiNo
				Escribir 'Tu signo es Sagitario'
			FinSi
		12:
			Si dia<=21 Entonces
				Escribir 'Tu signo es Sagitario'
			SiNo
				Escribir 'Tu signo es Capricornio'
			FinSi
		De Otro Modo:
			Escribir 'Mes no válido.'
	FinSegún
FinAlgoritmo

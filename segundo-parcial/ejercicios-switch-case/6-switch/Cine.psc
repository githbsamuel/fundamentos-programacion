Algoritmo Cine
	Definir numer_person, precio_base, parejas_dobles, precio_dobl Como Entero
	Definir monto_des, monto_pagar Como Real
	Definir dia, membresia Como Cadena
	precio_base <- 50
	precio_dobl <- 75
	monto_des <- 0
	Escribir 'Ingrese el numero de personas: '
	Leer numer_person
	Escribir 'Ingrese el dia de la semana: '
	Leer dia
	Escribir 'Usted tiene membresia: (si/no): '
	Leer membresia
	Según dia Hacer
		'miercoles':
			precio_base <- 30
			monto_pagar <- numer_person*precio_base
		'jueves':
			Si numer_person MOD 2==0 Entonces
				parejas_dobles <- trunc(numer_person/2)
				monto_pagar <- parejas_dobles*precio_dobl
			SiNo
				parejas_dobles <- trunc(numer_person/2)
				monto_pagar <- (parejas_dobles*precio_dobl)+precio_base
			FinSi
		De Otro Modo:
			monto_pagar <- numer_person*precio_base
	FinSegún
	Si membresia=='si' Entonces
		monto_des <- monto_pagar*.10
	FinSi
	monto_pagar <- monto_pagar-monto_des
FinAlgoritmo

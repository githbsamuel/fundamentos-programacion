Algoritmo Tartas

	// 7.- Una pasteler�a nos ha pedido realizar un programa que haga presupuestos de tartas. El
	// programa preguntar� primero de qu� sabor quiere el usuario la tarta: manzana, fresa o chocolate.
	// La tarta de manzana vale $200 pesos y la de fresa $250 pesos. En caso de seleccionar la tarta de
	// chocolate, el programa debe preguntar adem�s si el chocolate es negro o blanco; la primera
	// opci�n vale $280 pesos y la segunda $300 pesos. Por �ltimo, se pregunta si se a�ade snack puede
	// elegir entre (fresa, galleta, durazno, etc.) y si se personaliza con un nombre; el snack suma $25
	// porcada uno y la escritura del nombre $30.

	Definir sabor_tarta, add_snack, tipo_choco, snack, personalizar_nombre Como Cadena
	Definir tarta_manz, tarta_fresa, tarta_choBlanco, tarta_choNegro, numero_snack, precio_tarta, precio_nombre Como Entero
	Definir precio_total Como Real

	tarta_manz <- 200
	tarta_fresa <- 250
	tarta_choBlanco <- 250
	tarta_choNegro <- 280
	numero_snack <- 0
	precio_nombre <- 0

	Escribir 'Ingrese el sabor de la tarta: '
	Leer sabor_tarta

	Seg�n sabor_tarta Hacer
		'manzana':
			precio_tarta <- tarta_manz
		'fresa':
			precio_tarta <- tarta_fresa
		'chocolate':
			Escribir 'Ingrese el tipo de chocolate (blanco o negro): '
			Leer tipo_choco
			Si tipo_choco=='negro' Entonces
				precio_tarta <- tarta_choNegro
			SiNo
				Si tipo_choco=='blanco' Entonces
					precio_tarta <- tarta_choBlanco
				FinSi
			FinSi
		De Otro Modo:
			Escribir 'Sabor implicito'
	FinSeg�n

	Escribir 'Desea agregar snack (si/no):'
	Leer add_snack
	
	Mientras add_snack=='si' Hacer

		Escribir 'Ingrese su sabor de snack: '
		Leer snack

		numero_snack <- numero_snack+1

		Escribir 'Desea agregar otro snack (si/no): '
		Leer add_snack

	FinMientras

	Escribir 'Desea personalizar con su nombre: (si/no):'
	Leer personalizar_nombre

	Si personalizar_nombre=='si' Entonces
		precio_nombre <- 30
	FinSi

	precio_total <- precio_tarta+(numero_snack*25)+precio_nombre

	Escribir '---------------- PRESOPUESTO --------------------'
	Escribir 'Sabor tarta: ', sabor_tarta
	Escribir 'Precio total de tarta: ', precio_tarta
	Escribir 'Cantidad de snacks: ', numero_snack
	Escribir 'Precio total de snack ', numero_snack*25
	Escribir 'Personalizado: ', personalizar_nombre
	Escribir 'Precio del personalizado: ', precio_nombre
	Escribir '------------------------------------'
	Escribir 'Precio Total: ', precio_total, '$'
	
FinAlgoritmo

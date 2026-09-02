Algoritmo OPeraciones
	Definir numuero_uno, numero_dos, resultado Como Entero
	Definir operacion Como Cadena
	Escribir 'Ingrese dos numeros enteros: '
	Leer numuero_uno
	Leer numero_dos
	Escribir 'Ingrese la operacion: ( * , + . - . / )'
	Leer operacion
	Seg�n operacion Hacer
		'+':
			resultado <- numuero_uno+numero_dos
		'-':
			resultado <- numuero_uno-numero_dos
		'*':
			resultado <- numuero_uno*numero_dos
		'/':
			resultado <- numuero_uno/numero_dos
		De Otro Modo:
			Escribir 'Caracter no valido'
	FinSeg�n
	Escribir 'El resultado de  ', operacion, ' es de : ', resultado
FinAlgoritmo

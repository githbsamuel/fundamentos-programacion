Algoritmo Llamadas
	Definir tiempo_llamada, cobro_llamada, total, imp Como Real
	Definir dia, turno Como Cadena
	Escribir 'Ingrese el tiempo de llamada: '
	Leer tiempo_llamada
	Escribir 'ingrese el dia: '
	Leer dia
	Escribir 'Ingrese el turno: '
	Leer turno
	Si tiempo_llamada<=5 Entonces
		cobro_llamada <- tiempo_llamada*1
	SiNo
		Si tiempo_llamada>5 Y tiempo_llamada<=8 Entonces
			cobro_llamada <- 5+((tiempo_llamada-5)*.80)
		SiNo
			Si tiempo_llamada>8 Y tiempo_llamada<=10 Entonces
				cobro_llamada <- 7.4+((tiempo_llamada-8)*.70)
			SiNo
				cobro_llamada <- 8.8+((tiempo_llamada-10)*.50)
			FinSi
		FinSi
	FinSi
	Si dia=='domingo' Entonces
		imp <- cobro_llamada*.03
	SiNo
		Si turno=='matutino' Entonces
			imp <- cobro_llamada*0.15
		SiNo
			imp <- cobro_llamada*0.10
		FinSi
	FinSi
	total <- cobro_llamada+imp
	Escribir ' '
	Escribir 'Dia: ', dia, ' y turno: ', turno
	Escribir 'Impuestos por llamada: ', imp
	Escribir 'El total a cobrar es: ', total
FinAlgoritmo

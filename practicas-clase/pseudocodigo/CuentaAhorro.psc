Algoritmo CuentaAhorro

	Definir ahorro, depo como entero
	Definir i Como Entero
		Imprimir "-------------------CUENTA DE AHORRO---------------";
		Imprimir " ";
		
		ahprro = 0;
		
		Para i<-0 Hasta 11 Con Paso 1 Hacer	
			
			Escribir " Mes: ", (i + 1);
			
			
			Escribir "Ingrese cuanto desea depositar: ";
			leer depo;
			
			ahorro = ahorro + depo;
			
			Escribir "Lleva ahorrando: ",ahorro;
			
			Imprimir " ";
		Fin Para
		
		Imprimir "Ahorro: ", ahorro;
		
FinAlgoritmo


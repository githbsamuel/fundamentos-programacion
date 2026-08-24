Algoritmo VentasSep

	Definir venta Como Caracter
	Definir monto Como Real
	definir may_p, med_p, bajo_p, may_m, med_m, bajo_m Como Entero
	
	may_m = 0; may_p = 0;
	med_m = 0; med_p = 0;
	bajo_m = 0; med_p = 0;
		
	global = 0;
	
	Escribir "Hay ventas: si/no";
	leer venta
	
		Mientras venta == "si" Hacer
			
			Escribir "Ingrese el monto de la venta: "
			leer monto;
			
			si monto > 1000 Entonces
				may_m = may_m + monto;
				may_p = may_p + 1;
				global = global + monto;
			SiNo si monto > 500 y monto <= 1000 Entonces
					med_m = med_m + monto;
					med_p = med_p + 1;
					global = global + monto;
				sino si monto < 500 Entonces
						
					bajo_m = bajo_m + monto;
					bajo_p = bajo_p + 1;
					global = global + monto;
				FinSi
			FinSi
			
			FinSi
			
			Escribir "Hay otra ventas? si/no";
			leer venta
			
		Fin Mientras
		
		Escribir " piezas vendidadas mayores a 1000: ",may_p;
		Escribir " monto de mayores a 1000: ", may_m;
		Escribir " ";
		Escribir " piezas vendidadas mayores a 500 y menores que 1000: ",med_p;
		Escribir " monto de mayores a 500 y menores que 1000: ", med_m;
		Escribir " ";
		Escribir " piezas vendidadas menores que 500: ",bajo_p;
		Escribir " monto de menores de 500: ", bajo_m;
		Escribir " ";
		
		Escribir "Monto global: ",global;

	
FinAlgoritmo

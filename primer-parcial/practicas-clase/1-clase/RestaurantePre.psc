Algoritmo Presupuesto
	definir n_personas, costo como entero
	
	Escribir "Ingrese el numero de personas: ";
	leer n_personas;
	
	si n_personas < 200 Entonces
		costo = n_personas * 95;
		Imprimir "Precio: 95 y Costo: ",costo
	SiNo si n_personas >= 200 y n_personas <= 300 Entonces
			costo = n_personas * 85;
			Imprimir "Precio: 85 y Costo: ",costo
		SiNo
			costo = n_personas * 75;
			Imprimir "Precio: 75 y Costo: ",costo
		FinSi
	FinSi
FinAlgoritmo

package calculadoraMejorada;

import java.util.*;

public class Calculadora {
	
	//Atributos:
	
	//Metodos:
	public void calcular() {
		
		String operacion = "";
		double numero1, numero2,numero3, resultado = 0;
		numero3 = 0;
		Suma miSuma = new Suma();
		Resta miResta = new Resta();
		Multiplicacion miMultiplicacion = new Multiplicacion();
		Division miDivision = new Division();
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Bienvenido usuario a su calculadora de");
		System.out.println("           Java inicial TM");
		System.out.println("   Cual operacion quiere realizar?: ");
		System.out.println("           | [+]  | [-]");
		System.out.println("           | [*]  | [/]");
		System.out.println("             salir [=]");
		
		operacion = teclado.nextLine();
		
		System.out.println("Ingrese el 1er numero: ");
		numero1 = teclado.nextDouble();
		
		System.out.println("Ingrese el 2do numero: ");
		numero2 = teclado.nextDouble();
		
		
		teclado.nextLine();
				
			
			if(operacion.contains("+")) {
				
				resultado = miSuma.realizarOperacion(numero1, numero2);
				
				System.out.println("Tu suma dio: "+resultado);						
	
			}
		
			if(operacion.contains("-")) {
				
				resultado = miResta.realizarOperacion(numero1, numero2);
				
				System.out.println("Tu resta dio: "+resultado);
								
			}
			
			if(operacion.contains("*")) {
				
				resultado = miMultiplicacion.realizarOperacion(numero1, numero2);
				
				System.out.println("Tu multiplicacion dio: "+resultado);
								
				
			}
			
			if(operacion.contains("/")) {
				
				resultado = miDivision.realizarOperacion(numero1, numero2);
				
				System.out.println("Tu division dio: "+resultado);				
			
			}
			
			
			System.out.println("Desea realizar otra operacion?");
			
			System.out.println("Seleccione signo: ");
			operacion = teclado.nextLine();
			

			while(!operacion.contains("=")) {
				
				System.out.println("Ingrese un numero pls: ");
				numero3 = teclado.nextDouble();
				
				if(operacion.contains("+")) {
					
				resultado = miSuma.realizarOperacion(resultado, numero3);
				System.out.println("Resultado de suma: "+resultado);
					
				}
				
				if(operacion.contains("-")) {
					
					resultado = miResta.realizarOperacion(resultado, numero3);
					System.out.println("Resultado de resta: "+resultado);
					
				}
				
				if(operacion.contains("*")) {
					
					resultado = miMultiplicacion.realizarOperacion(resultado, numero3);
					System.out.println("Resultado de multiplicacion: "+resultado);
					
				}
				
				if(operacion.contains("/")) {
					
					resultado = miDivision.realizarOperacion(resultado, numero3);
					System.out.println("Resultado de division: "+resultado);
					
				}
				
				else {
					operacion = "=";
				}
				
				teclado.nextLine();
				
				System.out.println("Continuar operacion? Seleccione signo: ");
				operacion = teclado.nextLine();
				
				
				
			}
			
			System.out.println("Adios :)");
		
	}



}

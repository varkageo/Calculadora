package calculadoraMejorada;

public class Division extends Operacion{
	
	//Atributos
	
	//Metodos
	
	public double realizarOperacion (double n1, double n2) {
		
		if(n2 == 0) {
			
			System.out.println("error");
			return 0;
		}
		
		this.numero1 = n1;
		this.numero2 = n2;
		
		this.resultado = this.numero1 / this.numero2;
		
		return this.resultado;
	}
	

}

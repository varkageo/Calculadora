package calculadoraMejorada;

public class Suma extends Operacion{
	
	//Atributos
	
	//Metodos
	public double realizarOperacion(double n1, double n2) {
		
		this.numero1 = n1;
		this.numero2 = n2;
		
		this.resultado = this.numero1 + this.numero2;
		
		return this.resultado;
	}
	

}

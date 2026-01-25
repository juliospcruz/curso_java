package util;

public class Conversion {

	public static double iof = 0.06;
	
	public static double calculo(double dollar, double real) {
		
		double conversion = dollar * real;
		double desconto = conversion * (1 - iof);
		double result = (desconto * 100.0) / 100.0;
		return result ;
	}
	

	
}

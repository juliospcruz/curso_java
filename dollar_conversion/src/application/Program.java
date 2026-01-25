package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversion;

public class Program {
	

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the Doller price? ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollars wll be bought? ");
		double reais = sc.nextDouble();
		
		double calculo = Conversion.calculo(dollar, reais);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", calculo);
		
		sc.close();
	}
	
	

}

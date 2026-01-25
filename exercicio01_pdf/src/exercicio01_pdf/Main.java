package exercicio01_pdf;
import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in); 
		
		String valor1;
		String valor2;
		
		valor1 = sc.nextLine();
		valor2 = sc.nextLine();
		
		int soma = Integer.parseInt(valor1) + Integer.parseInt(valor2);
		
		
		System.out.println("=========================================");
		System.out.println("=============== BEM-VINDO ===============");
		System.out.println("=========================================");
		System.out.println("Entrada: ");
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println("=========================================");
		System.out.println("Saída: ");
		System.out.println("Soma: " + soma);
		
		
		
		
		sc.close();
		
	}
}

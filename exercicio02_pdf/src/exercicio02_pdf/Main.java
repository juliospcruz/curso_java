package exercicio02_pdf;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		System.out.println("=========================================");
		System.out.println("=============== BEM-VINDO ===============");
		System.out.println("=========================================");
		System.out.println("ENTRE COM UM VALOR :");
		
		Scanner sc = new Scanner(System.in);
		
		String valor;
		valor = sc.nextLine();
		
		Float valorConvertido = Float.parseFloat(valor);
		Float calculo = (float) (3.14159 * (valorConvertido * valorConvertido));
		

		System.out.println("Entrada: ");
		System.out.println(valor);
		System.out.println("=========================================");
		System.out.println("Saída: ");
		System.out.println("Cálculo: " + calculo);
		
		
		sc.close();
	}
	
	
}

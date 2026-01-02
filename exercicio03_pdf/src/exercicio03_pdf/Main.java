package exercicio03_pdf;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		System.out.println("=========================================");
		System.out.println("=============== BEM-VINDO ===============");
		System.out.println("=========================================");
		System.out.println("ENTRE COM O PRIMEIRO VALOR :");
		
		Scanner sc = new Scanner(System.in);
		
		String valor;
		String valor1;
		String valor2;
		String valor3;
		
		valor = sc.nextLine();
		System.out.println("ENTRE COM O SEGUNDO VALOR :");
		valor1 = sc.nextLine();
		System.out.println("ENTRE COM O TERCEIRO VALOR :");
		valor2 = sc.nextLine();
		System.out.println("ENTRE COM O QUARTO VALOR :");
		valor3 = sc.nextLine();
		
		int diferenca = Integer.parseInt(valor) * Integer.parseInt(valor1) - Integer.parseInt(valor2) * Integer.parseInt(valor3) ;
		
		

		System.out.println("Entrada: ");
		System.out.println(valor);
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		System.out.println("=========================================");
		System.out.println("Saída: ");
		System.out.println("DIFERENCA: " + diferenca);
		
		
		sc.close();
	}
	
	
}

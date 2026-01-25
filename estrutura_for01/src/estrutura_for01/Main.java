package estrutura_for01;
import java.util.Scanner;


public class Main {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		int x = sc.nextInt();
		System.out.println("Excelente escolha irei contar de 1 até "+ x);
		
		
		
		for (int i=1; i<x+1; i++ ) {
			if (i % 3 == 0) {
				System.out.print(i +" / ");
				System.out.println(x);
			}
			
			
		}
		
		sc.close();
	}
	
	
	
}

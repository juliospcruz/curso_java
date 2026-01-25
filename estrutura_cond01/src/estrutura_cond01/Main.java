package estrutura_cond01;
import java.util.Scanner;

public class Main {
	
	public void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número: ");
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}else
			System.out.println("NÃO NEGATIVO");
		
		
		
		sc.close();
		
	}

}

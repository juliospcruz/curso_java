package estrutura_cond03;

import java.util.Scanner;

public class Main {
	
	public void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com valor A ");
		int A = sc.nextInt();
		System.out.println("Entre com valor B ");
		int B = sc.nextInt();
		
		if ((A % B  == 0) || (B % A == 0)  ) {

			System.out.println("SÃO MULTIPLOS");
		}else
			System.out.println("NÃO SÃO MULTIPLOS");
		
		
		
		sc.close();
		
	}

}

package exercicio05_pdf;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}

// MEU CÓDIGO//

/*package exercicio05_pdf;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		System.out.println("=========================================");
		System.out.println("=============== BEM-VINDO ===============");
		System.out.println("=========================================");
		System.out.println("ENTRE COM O CÓDIGO DO PRODUTO :");
		
		Scanner sc = new Scanner(System.in);
		
		String idProduto;
		String idProduto1;
		String qtd;
		String qtd1;
		String preco;
		String preco1;
		
		
		idProduto = sc.nextLine();
		System.out.println("ENTRE COM A QUANTIDADE DO PRODUTO :");
		qtd = sc.nextLine();
		System.out.println("ENTRE COM O VALOR :");
		preco = sc.nextLine();

		System.out.println("ENTRE COM O CÓDIGO DO SEGUNDO PRODUTO :");
		idProduto1 = sc.nextLine();
		System.out.println("ENTRE COM A QUANTIDADE DO PRODUTO :");
		qtd1 = sc.nextLine();
		System.out.println("ENTRE COM O VALOR :");
		preco1 = sc.nextLine();
		
		float calculo = Integer.parseInt(qtd) * Float.parseFloat(preco);
		float calculo1 = Integer.parseInt(qtd1) * Float.parseFloat(preco1);
		
		

		System.out.println("Entrada: ");
		System.out.println(" " + idProduto + " " + qtd + " " + preco +" ");
		System.out.println("VALOR A PAGAR: R$ " + calculo);
		System.out.println(" " + idProduto1 + " " + qtd1 + " " + preco1 +" ");
		System.out.println("VALOR A PAGAR: R$ " + calculo1);

		
		sc.close();
	}
	
	
}
*/
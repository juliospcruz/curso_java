package method01;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();	
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}else if (y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
		
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = "+value);
	}

}

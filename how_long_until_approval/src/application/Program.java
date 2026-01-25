package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Studants;

public class Program {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studants emp = new Studants();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("First note : ");
		emp.firstNote = sc.nextDouble();
		
		System.out.print("Second note : ");
		emp.secondNote = sc.nextDouble();
		
		System.out.print("Third note : ");
		emp.thirdNote = sc.nextDouble();
		
		emp.approve();
		
				
		sc.close();
	}
	
}

package entities;

public class Studants {
	
	public String name;
	public double firstNote;
	public double secondNote;
	public double thirdNote;
	
	public double totalNote() {
        return firstNote + secondNote + thirdNote;
    }
	
	
	public void approve() {
		double total = totalNote();
		
		System.out.println("FINAL GRADE = " + total);
		
		if (total < 60.00) {
			System.out.println("FAILED");
			System.out.println("MISSING " + (60.00 - total) + " POINTS");
		}else if ((total >= 60.00) && total <= 100.00) {
			System.out.println("PASS");
		}else {
			System.out.println("Valores não compativeis !");
		}
	}
	

}
	


package tutorial1;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String scanned=sc.next();
		
		
		if (scanned.equals("Amulya")) {
			
			System.out.println("You typed Amulya");
			
		} else if(scanned.equals("Mark")) {
			
			System.out.println("You typed Mark");
			
		} else {
			
			System.out.println("You typed different word");
			
		}

	}

}

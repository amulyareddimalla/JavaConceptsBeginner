package tutorial1;

import java.util.Scanner;

public class NestedStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input your Age: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int age=Integer.parseInt(s);
		
		if (age>=18) {
			System.out.println("What is your favourite Color?");
			String color=sc.next();
			if (color.equals("blue")) {
				System.out.println("Mine too!");
			}
			else {
				System.out.println("Not mine!");
			}
		}
		else if (age>=13) {
			System.out.println("You are a teenager !");
		}
		else {
			System.out.println("You are not a teenager nor an adult !");
		}

	}

}

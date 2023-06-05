package tutorial1;

import java.util.Scanner;

public class Whileloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		int count=1;
		while (x!=10) {
			System.out.println("Type a number: ");
			System.out.println("Type 10: ");
			x=sc.nextInt();
			count++;
		}
		System.out.println("You tried " +count+ " times");

	}

}

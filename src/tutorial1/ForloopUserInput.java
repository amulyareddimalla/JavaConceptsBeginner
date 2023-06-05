package tutorial1;

import java.util.Scanner;

public class ForloopUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr= {1,5,9,5,3,7};
		
		String[] names=new String[5];
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<names.length; i++) {
		System.out.println("Input: ");
			String input=sc.nextLine();
			names[i]=input;
		
	}
		//For each
		for (String n:names) {
			System.out.println(n);
			if (n.equals("Amul")) {
				break;
		}

		}}}

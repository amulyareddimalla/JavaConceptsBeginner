package tutorial1;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
//		String scanned=sc.next();
//		System.out.println(scanned);
//		int scanned=sc.nextInt();
		
		String scanned=sc.next();
		int x=Integer.parseInt(scanned);
		System.out.println(x);

	}

}

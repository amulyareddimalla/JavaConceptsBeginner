package tutorial1;

public class ForloopAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,9,5,3,7};
//		String[] names=new String[5];
		
//		For each loop
		int count=0;
		for (int element: arr) {
			System.out.println(element +" " +count);
			count++;
		}

	}

}

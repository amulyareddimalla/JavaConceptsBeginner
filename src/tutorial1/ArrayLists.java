package tutorial1;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<Integer>();
		
		
		a.add(2);
		a.add(5);
		a.add(4);
		a.add(7);
//		int x=a.get(0);
		//something should already be existing to set another value
//		a.set(1, 9);
//		int y=a.get(1);
		
	
		System.out.println(a.subList(0, 4));
	

	}

}

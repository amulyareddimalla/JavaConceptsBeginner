package tutorial1;

public class ConditionsBooleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int y=6;
		int z=8;
//		boolean compare=x<y;
//		boolean compare=x>y && z<y;
		boolean compare1=x>y || z>y;
		boolean compare3= !(x>y || z>y);
		String a= "hello";
		String b="hello";
		boolean compare=a==b;
//		System.out.println(a.equals(b));
		System.out.println(compare);
//		System.out.println(compare1);
//		System.out.println(compare3);

	}

}

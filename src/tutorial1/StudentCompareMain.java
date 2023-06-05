package tutorial1;

public class StudentCompareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentCompareClass John=new StudentCompareClass("Kat");
		StudentCompareClass Tom=new StudentCompareClass("Tom");
		
		System.out.println(John.equals(Tom));
		System.out.println(John.compareTo(Tom));
		

	}

}

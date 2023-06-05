package tutorial1;

public class StaticMainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass sun=new ParentClass("Sun",5);
		ParentClass moon=new ParentClass("Moon",10);
		ParentClass.count=7;
		System.out.println(ParentClass.count);
		

	}
	


}

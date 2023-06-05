package tutorial1;

public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass d=new ParentClass("smart",2);
		d.speak();
		int x=d.getAge();
		System.out.println(x);
		
		d.setAge(10);
		d.speak();

	}

}

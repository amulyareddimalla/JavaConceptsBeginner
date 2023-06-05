package tutorial1;

public class ParentClass {
	
	protected static  int count=0;
	private String name;
	private int age;
	
	public ParentClass(String name, int age) {
		this.name=name;
		this.age=age;
		ParentClass.count+=1;
//		ParentClass.display();
	}
	
	public void speak(){
		System.out.println("I am "+ this.name+ " and I am "+ this.age+ " years old");
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public void display2() {
		System.out.println("I am non-static method and you need to create an object to call me");
	}
    public static void display() {
    	System.out.println("I am static method and no need to create an object to call me");
	}

}

package tutorial1;

public class Childclass extends ParentClass{
	private int food;
	
	
    //First Constructor
	public Childclass(String name, int age, int food) {
		super(name, age); //to access variables of parent class
		this.food=food;
		
	}
	
	 //Second Constructor
	public Childclass(String name, int age) {
		super(name, age);
		this.food=50;
		
	}
	//third constructor
	public Childclass(String name) {
		super(name, 0);
		
	}
	
//	public void speak(){
//		System.out.println("Meow my name is "+ this.name+ " and I fed daily "+ this.food+ " times");
//	}
	

}

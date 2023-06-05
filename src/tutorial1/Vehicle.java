package tutorial1;

public interface Vehicle {
	//abstract method 
	
	final int gears=5;
	
	void speedUp(int a);
	void slowDown(int a);
	void changeGear(int a);
	
	default void out() {
		System.out.println("I am a default method");
	}
	
	static int math(int b) {
		return b+9;
	}

}

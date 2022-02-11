package oops;

public class Childclass extends Person{
	
	String Profession;
	
	public Childclass() {
		
		System.out.println("inside child default constructor");
	}
	
	public Childclass(String Name, int Age, String Profession) {
		
		//parent classes constructor, so you don't need to use this keyword here
		
		super(Name,Age);
		
		//profession is part of child class
		
		this.Profession = Profession;
		
	}
	
	public void print() {
		
		System.out.println("inside child");
	}

}

package oops;

public class Person {
	
	public String Name;
	public int Age;
	
	//parameterized constructor
	
	public Person() {
		
		System.out.println("inside parent default constructor");
	}
	
	public Person(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}
	
	//if it is a private it cannot accessed by child
	public void display() {
		System.out.println("inside parent");
		
	}

}

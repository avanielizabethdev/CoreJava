package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee emp1 = new Employee();
		
		emp1.Name = "Mebin";
		emp1.EmployeeId = 141286;
		emp1.Salary = 10000;
		
		Employee emp2 = new Employee();
		
		emp2.Name = "Avani";
		emp2.EmployeeId = 230390;
		emp2.Salary = 20000;*/
		
		//Employee emp1 =new Employee("mebin",141286,10000);
		//Employee emp2 =new Employee("Avani",230390,20000);
				
		//System.out.println("Name of emp1: "+emp1.Name );
		//System.out.println("Name of emp1: "+emp2.Name );
		
		//emp1.PrintName();
		//emp2.PrintName();
		
		//Parameterized constructor
		Employee emp3 =new Employee("Dev",123456);
		
		emp3.PrintSalary();
		
		Employee.ChangeCompanyName();
		
		//default constructor --> Person class
		Person per1 = new Person();
		Childclass child = new Childclass();
		//child1.display();
		//child1.print();
		Childclass child1 = new Childclass("Avani",30,"Actoress");
		
		//compiler will dicide which argument should be consider-compile time
		MethodOverLoadingExample obj = new MethodOverLoadingExample();
		obj.sum(4, 6);
		obj.sum(4, 2, 6);
		
		//ABSTRACTION
		
		// BankExample bank = new BankExample();    ---cannot create object with abstract class
		
		//create object with child class for abstract method
		ICICBank bank1 = new ICICBank();
		bank1.Creditcart();
		bank1.Welcome();
		
		//ENCAPSULATION
		
		
		
	}

}

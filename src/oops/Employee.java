package oops;

public class Employee {
	
	public String Name;
	public int EmployeeId;
	//public int Salary;
	public static int Salary = 1000;
	public static String CompanyName = "Infosys";
	
	public Employee(String Name,int EmployeeId,int Salary) {
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;
	}
	
	public Employee(String Name,int EmployeeId) {
		this.Name = Name;
		this.EmployeeId = EmployeeId;
	}
	
	
	public void PrintName() {
		System.out.println("name of employee: "+this.Name);
	}
	
	public void PrintSalary() {
		System.out.println("Salary of employee: "+Employee.Salary);
	}
	
	public static void ChangeCompanyName() {
		Employee.CompanyName = "Infosys Technology";
	}

}

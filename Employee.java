
package com.Java.Class;

public class Employee {
	
	int EmpId;
	String Name;
	double Salary;
	static String company="Infosys";


	Employee(int Id,String name,double salary)
	{
		EmpId=Id;
		Name=name;
		Salary=salary;

	}
	void display()
	{
		System.out.println("EmployeeId: "+EmpId+ "Name: "+Name+ "Salary: "+Salary+  "Company: "+company);


	}


}
 class details {
	public static void main(String[] args) {
		Employee E1=new Employee(123,"Jaya",40000.00);
		Employee E2=new Employee(124,"Tushar",50000.00);
		E1.display();
		E2.display();

	}

 }
 

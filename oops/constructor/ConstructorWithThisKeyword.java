package oops.constructor;

class Employee
{
	String name;
	int id;
	double salary;
	
	Employee()
	{
		this("Sundar",007,50000); // this call use to invoke another constructor with same class 
		System.out.println("Default constructor");
	}

	Employee(String name,int id,double salary)
	{
		this.name=name; //this is use to resolve naming conflict between instance variable and local variable
		this.id=id;
		
		System.out.println("Parameterized constrctor");  
	}
	
	// with method chaining
	Employee setName(String name)
	{
		this.name=name;
		return this;
	}
	Employee setId(int id)
	{
		this.id=id;
		return this;
	}
	Employee setSalary(double salary)
	{
		this.salary=salary;
		return this;
	}
	
	void  display()
	{
		System.out.println("Name: "+name+ "Id: "+id+" Salary:"+salary);
	}
//	
//	//Without Method chaining
//	void setNameWithotMethodCha(String name)
//	{
//		this.name=name;
//		
//	}
//	void setIdWithotMethodCha(int id)
//	{
//		this.id=id;
//		
//	}
//	void setSalaryWithotMethodCha(double salary)
//	{
//		this.salary=salary;
//		
//	}
//	
//	void  displayWithotMethodChaning()
//	{
//		System.out.println("Name: "+name+ "Id: "+id+" Salary:"+salary);
//	}

}



public class ConstructorWithThisKeyword {

	public static void main(String[] args) {
		Employee e = new Employee(); // with method chaining method call class at once
		e.setId(101)
		.setName("Sundar")
		.setSalary(50000);
		e.display();
		
		//without method chaining call method separately
		
//		Employee e2=new Employee();
//		 e2.setNameWithotMethodCha("kutty");
//		 e2.setIdWithotMethodCha(102);
//		e2.setSalaryWithotMethodCha(52000);
//		e2.displayWithotMethodChaning();
	}

}

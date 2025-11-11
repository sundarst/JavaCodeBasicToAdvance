package oops.constructor;
class Student
{
	String name;
	String grade;
	String place;
	
	Student()
	{
		
		this("sundar","12"); 
		// constructor chaining or say call one constructor in another constructor in same class
		System.out.println("Default constructor");
		
	}
	
	Student(String name ,String grade)
	{
	
		this.name=name;
		this.grade=grade;
		System.out.println("Parameter constructor");
		
	}
	
	Student(String name,String grade,String place)
	{
		this.name=name;
		this.grade=grade;
		this.place=place;
		System.out.println("Full constructor");
		
	}
	
	void display()
	{
		System.out.println("Name "+name+ " Grade: "+grade+ " Place: "+place);
	}
	
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		System.out.println();
		Student s2 = new Student("Ragu","12","Chennai");
		s2.display();
	}

}

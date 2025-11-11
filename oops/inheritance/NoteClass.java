package oops.inheritance;

class Vehicle 
{
int speed ;

Vehicle()
{
	System.out.println("Inside vehicle constructor");// constructor is called when object of class is created
}

final void start()
{
	System.out.println("Vehicle starting");

}
}

class Lorry extends Vehicle
{
	int length;
	
	Lorry()
	{
		super();// invoke super class constructor
		System.out.println("Lorry constructor");
		
	}

	Lorry(int l)
	{
		//this(10);
		super();// invoke super class constructor
		System.out.println("Lorry constructor");
		
	}
	

}

class Student {
    String name;
    int age;

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // Default constructor
    Student() {
        this("John", 20); // calls the constructor with two parameters
        System.out.println("Default constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class NoteClass {

	public static void main(String[] args) {
		
//1
		Lorry lorry1 = new Lorry();
		
		lorry1.start();
//		Vehicle vehicle1 = new Vehicle();
//		vehicle1.start();
		/*Inside vehicle constructor
          Vehicle starting*/
		
//		Student student = new Student();
//		student.display();
	}

}

/*Note
 * 1."Super" keyword can be used by sub class to access its super class member 
 * 2. super call used by sub class to  invoke it super class constructor
 * 3. super call statement is provide implicitly if and only if
 *  constructor doesn't have any from super() class or this() call 
 *  
 * 4.The implicitly provide super() call statement will always invoke parameter less constructor 
 * of super class
 * 
 * 5."super ()" call is present must appear as a first statement in constructor expect object class
 * 
 * 6."this ()" and "super()" call cannot co - exit in a constructor
 * 
 * 7."this ()" call used to invoke another constructor with in same class
 * 
 *  String name;
    int age;

    Student() {
        this("John", 20); // calls the constructor with two parameters
        System.out.println("Default constructor called");
    }
 * 
 * 8."super ()" call used to invoke super class constructor 
 * 
 * 9. In a inheritance hierarchy constructor are invoke in the order of parent to child class 
 * 
 * 10. java does not support multiple inheritance 
 * 
 * 11.In java orphan class not allowed expected object class
 * 
 * 12.if class does't inherit any other class than the class made to inherited object class implicitly
 * 
 * 13.In java every class must inherit one another class expect object class 
 * 
 * 14.In java ultimate super class is object class 
 * 
 * 
 * 
 * 
 * 
 * 
 */

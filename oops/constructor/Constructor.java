package oops.constructor;

class Cat
{
	String colour;
	
	Cat() // Parameterless constructor
	{
		colour="Orange";
		sayMeow();
	}
	Cat(String colour) // Parameterized constructor
	{
		this.colour=colour;
	}
	
	Cat(Cat cat)   //copy constructor
	{
		this(cat.colour);
	}
	
	void sayMeow()
	{
		System.out.println("Cat colour "+colour +" Meow meow");
	}
	
	void Cat()
	{
		System.out.println("it is perfectly legal normal method share class name but bad programming mistake");
	}
}
public class Constructor {

	public static void main(String[] args) 
	{
		
		Cat c1 = new Cat(); // parameter less constructor
		c1.sayMeow();
//		Cat c2 = new Cat("Black"); // parameterized constructor
//		c2.sayMeow();
//		Cat c3 = new Cat(c1);    // copy constructor
//		c3.sayMeow();
		
		
	}

}
/*1.What is constructor?
 *Constructor is special method.
 *Constructor is call when  object of a class create.Invoke implicit at time instantiation 
 *
 * 2.what is purpose of constructor?
 * constructor is generally use to  initialized a state of object 
 * 
 * 3.what is state of object ?
 * The value of instance variable at a given instance of time reference as state of object 
 * 
 * 4.A zero argument constructor or parameter less constructor supply implicit only if the  abstance of any 
 * constructor in class
 * 
 * 5.Constructor is a method ? No
 * 
 * 6.Why constructor is not a method ?
 *  constructor not say as method (because it not have return type)
 * 
 * 7.Characteristics of a constructor ?
 *  1.constructor name is same as class name 
 *  2.constructor cannot invoke explicit like normal method 
 *  3.Does not have return type 
 *  
 * 8.what is copy constructor ?
 * Initializing the state of an object similar as that of another object  through a constructor is termed
 * as copy constructor   
 * 
 * 9.What is purposes of copy constructor ?
 * copy constructor is use for object cloning  to create identical object 
 * 
 * 10.List the type of constructor?
 * Two type
 * 1.parameterized constructor 
 * 2.paramaterLess constructor
 *     copy constructor
 *     
 * 11.constructor that share same name but vary in parameter list  are called constructor overloading 
 * 		(constructor inheritance is not possible.So constructor overriding is not possible)
 * 
 * 12.What is significance of "this" reference ?
 * 1.It is use to resolve naming conflict between instance variable and local variable 
 * 2. this() is used to invoke another constructor with same class
 * 3. this() call must appear as first statement
 * 
 * Note:
 * 1.During construction do not do any construction
 * ===================================================
 *  Employee() {
        this("Unknown"); // calls parameterized constructor
        System.out.println("Default constructor called");
    }

    Employee(String name) {
        this.name = name;  // only initialize field
        // ❌ avoid heavy operations here
        System.out.println("Parameterized constructor called: " + name);
    }
    
    // ❌ BAD: performing heavy work in constructor
    =================================================================
 * 2.it is perfectly legal to invoke a normal method from constructor 
 * 3.it is perfectly legal normal method share class name but bad programming mistake
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
package oops.Interface;

interface Sundar
{
	String TYPE ="human"; //constant variable // public static final by default
	
	void work();//abstract method
	
	default void  eat() //default method
	{
		System.out.println("Sundar like to eat good diet because he going to gym");
	}
	
	static void info() //static method
	{
		System.out.println("He was software Engineer working in Big MNC company");
	}
}

class Person implements Sundar
{

	public void work()
	{
		System.out.println("Sundar working as software engineer");
	}

	
}
//Ex:2
abstract class SundarImpl implements Sundar
{
	public void tech()
	{
		System.out.println("Sundar like software business");
	}

}

class I extends SundarImpl
{

	@Override
	public void work() {
		System.out.println("Sundar is working");	
	}
	
}
//Ex :3
class Vehicle
{
	public void start()
	{
		System.out.println("Vehicle Start");
	}
}

class Bike extends Vehicle // class can extends only one another class
{
	public void start()
	{
		System.out.println("Bike vehicle start");
	}

}

interface Bunk
{
	default void msTank()
	{
		System.out.println("Ms Tank capacity 16Kl");
	}
	
	default void HsdTank()
	{
		System.out.println("HSD Tank capacity 22KL");
	}
}

interface Manager
{
	default void moringShift()
	{
		System.out.println("9 am to 6 pm");
	}
	default void nightShift()
	{
		System.out.println("6 pm to 9am");
	}
}

class FuleStation implements Bunk,Manager // A class implements multiple interface
{
	public void fuleStationInfo()
	{
		System.out.println("Information about fuleStation");
	}

}

//Ex: 8



public class InterfaceMain {

	public static void main(String[] args) {
	//-->	Sundar sundar = new Sundar(); //- Cannot instantiate the type Sundar

//Ex 1:
		
//	Person person = new Person();
//	person.work(); //abstract method
//	person.eat(); // default method
//	Sundar.info(); //static method
	
//Ex 2:
	I i = new I();
	
//	i.tech();
//	i.work();
//	i.eat();
	
//Ex 3:
	
	FuleStation fuleStation = new FuleStation();
	
	fuleStation.msTank();
	fuleStation.HsdTank();
	fuleStation.moringShift();
	fuleStation.nightShift();
	fuleStation.fuleStationInfo();
	
	}

	

}

/*1.Interface are define with keyword "Interface"
 * 
 *2.Interface are assumed to have either public (or) default access 
 *otherwise they cannot be market as private protected (or) final
 *
 *3.By default Interface are abstract
 * 
 *4.What is interface ?
 *
 *	It is special type of abstract class that contains the following
 *	abstract method 
 *	default method 
 *	static method
 *	constant variable (public static final)
 *
 * 5.By default variable inside an interface are public static and final 
 * 	--> variable declared inside an interface must be initialized at the place of declaration as they are 
 * final variable
 * 
 * 6.By default abstract method inside interface are public 
 * 
 * 7.Interface cannot be instantiated 
 * 
 * 8.The first concrete sub class must provide implementation for all the inherited abstract method define
 *  in a interface
 *  
 * 9. ---> A class can extend only one another class
 *   ----> A class can Implemented multiple interface
 *  -----> A class can not extends(inherit) multiple classes
 *  -----> A class cannot  extends an interface but can implement an interface
 *
 *10.A class extends another class and also implements interface then the keyword extends must
 * appear prior to the keyword implements 
 *
 *11.An interface can empty.An empty interface called as marker interface
 *
 *12.---> An interface can extends multiple interface 
 *	 ---> An interface can not extends another class
 *   ---> Interface cannot implement another Interface 
 *   
 *13. default method can only be define inside the interface and cannot be define inside a class
 *why?
 *you can define a default method inside an interface
 *purposes:
 *	so that any class implementing the interface gets this method by default 
 *
 *inside a class:
 *	In a class you can't use the keyword default for method instead 
 *
 *	method in a class already default access(package -private).If you do not specify public private (or)
 *  protected
 *
 *14.default method is way to provide default implementation for any abstract method by an interface 
 *							(or)
 *  inside class abstract method implement by default 
 * why?
 * 
 * Abstract class 
 * --> Method can have any access modifier public,protected,private default(package private)
 *	   But usually abstract method are declared public because  subclass need to override them
 *
 *  
 *15.variable declare inside an interface must be initialized at place 
 *of declaration as they are final variable 

 16.static method define in a interface are not inherited in class that implemented the interface name
  
 *17.Abstract method inside an interface cannot be market as static (or)final (or) protected (or) private	
 * 	
 *
 *
 *
 *
 *
}
 */
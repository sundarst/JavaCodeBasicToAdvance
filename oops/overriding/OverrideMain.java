package oops.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

//Ex:1 A method can be override only its is inherited 

class Parent
{
	public int getValue()
	{
		return 10;
	}

}
class Child extends Parent
{
	public int getValue()
	{
		return 20;
	}

}
//Ex:2 Override can share same return type (or) can have co-varient return type
class Payment
{
	public Payment payment()
	{
		System.out.println("Process payment");
		return new Payment();
	}
}

class Upi extends Payment
{
	public Upi payment()
	{
		System.out.println("Upi");
		return new Upi();
	}

}

class CardPayment extends Payment
{
	public CardPayment payment()
	{
		System.out.println("Card payment");
		return new CardPayment();
	}
	

}

//Ex 3 .Override method can share same access level or can have border access level.
//otherwise it can't have more restricted access level 

class Vehicle 
{
//	public void start()
//	{
//		System.out.println("Start");
//	}
	
//	protected void start()
//	{
//		System.out.println("start");
//	}
}
class Bike extends Vehicle
{
//	protected void start()
//	{
//		System.out.println("Bike start");
//	}
	
//	public void start()
//	{
//		System.out.println(" Bike Start");
//	}

}

//Ex 4: Overridden method can throw new unchecked exception 

class University
{
	public Long condactExam(String s)
	{
		return 10L;
	}
	
	public void studentDedails()
	{
		System.out.println("Student details");
	}

}
class Alagappa extends University
{
//	public Long condactExam(String s) throws ArithmeticException
//	{
//		System.out.println("Alagappa university condact exam"+s);
//		throw new ArithmeticException("Exam system crashed");
//	}
	
//overridden method can throw any number of unchecked exception	
	public Long condactExam(String s) throws ArithmeticException, NullPointerException, IllegalStateException
	{
		System.out.println("Alagappa university condact exam"+s);
		throw new ArithmeticException("Exam system crashed");
	}
// overridden method cannot throw any new checked expression
	
//	public void studentDedails() throws FileNotFoundException
//	{
//		System.out.println("Student details");
//	}

}

class School
{
	public void teacherDetails() throws IOException
	{
		 throw new IOException ("Teacher Details");
	}
//	public void teacherDetails()throws ArithmeticException
//	{
//		 throw new  ArithmeticException("Teacher Details");
//	}

}

class Principle extends School
{
//	public void teacherDetails() throws FileNotFoundException
//	{
//		throw new FileNotFoundException ("Principle asked teacher details");
//	}
	
	
//	 overridden method can eliminated throwing any check exceptions
	public void teacherDetails()   // No exception here → eliminating the checked exception
	{
		System.out.println("Principle asked teacher details");
	}
	
	
//	public void teacherDetails() 
//	{
//		System.out.println("Principle asked teacher details");
//	}

}
public class OverrideMain {

	public static void main(String[] args) {
//Ex 1:		
		
	Child child = new Child();
	//System.out.println(child. getValue());
//		

//Ex2		
		Payment  payment = new  Payment();
		// payment.payment();
	 
//		 Upi upi= new Upi();
//		 upi.payment();
		 
		 CardPayment cardPayment= new CardPayment();
		// cardPayment.payment();
		 
		 Bike bike = new Bike();
		// bike.start();	
		 
		 Alagappa alagappa = new Alagappa();
		 
		// alagappa.condactExam("B.sc student");
		 
//		 try
//		 {
//		 Principle  principle = new  Principle();
//		 principle.teacherDetails();
//		 }catch(FileNotFoundException e)
//		 {
//			 System.out.println(e);
//		 }
	}

}

/*1.When method overriding is possible ?
 * A subclass can override  a method if and only if method is inherited 
 *
 *2.Why method overriding? when to prefer method overriding ?
 * when sub class wants to capture it specific behavior of super class
 * 
 *3.what is method overriding ?
 *Sub class can provide a re-implementation or re-definition inherited it behavior
 *
 *Note:
 *1.A method can be override only its is inherited 
 *
 *2.Override method must share the same name and same parameter list
 *
 *3.Override can share same return type (or) can have co-varient return type
 *
 *4.Override method can share same access level or can have border access level.otherwise it can't have more 
 *restricted access level 
 *
 *	private --> default-->protected-->public 
 *		(increasing order of access level) 
 *
 *5.Method that are marked as final or private or static cannot be override
 *
 *key rule to remember:
 *final --> can't override (locked)
 *private --> can't override (invisible)
 *static ---> can't override (class level only)
 *
 *6.constructor can be overloaded but cannot be overridden
 *
 *7.Overridden method can throw new unchecked exception 
 *
 *8.overridden method can throw any number of unchecked exception
 *
 *9.overridden method cannot throw any new checked expression
 *
 *10.overridden method can throw any sub type of the super class checked exception
 *
 *	--> overridden method throw checked exception in subtype of checked exception
 * declared by the parent method  
 * 
 * ---> But exception should be related 
 * 
 * ---> declares a checked exception, Java requires the caller (main method) 
 * to either catch it or declare it.
 * 
 * --> for unchecked exception is not need it will not checked in compile time 
 * 
 *11. overridden method can eliminated throwing any check exceptions
 * 
 * -->✔ Checked exception → must be declared or handled
 * ---> ✔ Unchecked exception → never needs to be declared
 * 
 * --->✅ Even if the overridden method does NOT declare an unchecked exception, 
 * it can still throw it at runtime — because unchecked exceptions don’t need to be declared anywhere.
 * 
 */
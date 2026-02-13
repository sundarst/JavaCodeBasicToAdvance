package javaBasic;

public class Variable {

	String name="Sundar"; //instance variable
	
	int age=16;
	static int fees=100000; // static variable
	final int roll;
	Variable(int roll)
	{
		this.roll=roll;
	}
	//with out constructor can,t change fixed value in constant variable 
	public void stuDentails()
	{
		String grade="plusTwo"; // local variable
		int mark; // not initlized in local variable
		System.out.println("Name: "+name+" age: "+age+" fees: "+ fees+" Grade: "+grade+"Roll: "+roll);//+"Mark:"+mark);
	}
	public static void main(String[] args) {
		Variable variable = new Variable(10);
		variable.stuDentails();
		Variable variable1 = new Variable(20); 
		variable1.stuDentails();
	}

}

/*1.A variable is the name given to the memory location where the variable is store
 * 
 *Type of variable 
 *
 *instance variable 
 *static variable
 *local variable 
 *
 */



/*Next phase
 ============
 *1.Object instance variable data store in heap memory 
 * 
 * local variable method call object reference store in stack memory
 * 
 * 2.Instance variable lives inside the object on heap memory .When object is not reachable
 *  instance variable also ends
 *  	
 *  Instance variable dies because it is part of object memory
 *  	.If object is gone --> it's memory is gone instance variable also gone
 *  
 * 3.Constant cannot change inside same object.but every new object can have new constant value 
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 8.Local variable must be initialized before use.Local variable have no default value.So java forces you 
 * to assign a value before using them.
 * 
 * 
 */
 
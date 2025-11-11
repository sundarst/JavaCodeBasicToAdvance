package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*1.what is inheritance ?
 *it is a property by which one class (subclass)acquired the inheritance member of other class(super class)
 *
 *2.The class inheriting referred as sub class (child class)
 *
 *3.The class inherited referred as super class (parent class)
 *
 *4.when to prefer inheritance ? or why inheritance ?
 *  when class want to reuse or (code reusability)
 * 				(or)
 * one class want to  share certain member of other class
 * 
 *5.what is advance of inheritance ?
 *  1)to avoid code reusability or duplication 
 *  2)To obtain package access control
 *   
 *6.what member not inherited ? 
 *  1)private 
 *  2)constructor
 *  3)static 
 *  
 *  Short explanation:

		Constructors are not inherited because they are used only to initialize the object of that specific class.
		
		When a subclass is created, it has its own constructor — not the parent’s one.
		
		But it can call the parent constructor using super().

		class A {
		    A() {
		        System.out.println("A constructor");
		    }
		}
		
		class B extends A {
		    B() {
		        // super() is called automatically
		        System.out.println("B constructor");
		    }
		}
 *  
 * 7.will super call will be inserted always as the first statement in every constructor ?
 * No
 * 
 * Note:
 * --> next
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
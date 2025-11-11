package oops.classAndObject;

public class MainClass {

	public static void main(String[] args) {
		new Pen().write();
		new Pen().beat(); //it was bad practice it will take two  heap memory location 
		
		Pen pen = new Pen(); // object reference variable
		pen.write();
		pen.beat();
	}

}
/*1.What is class ?
 *A class is blue print or template.model of an object that capture attributes and behaviors of an object  
 *			(or)
 *
 *class is user define non primitive data type that server a model of an object 
 *
 *2 A java class contain
 * 1)field
 * 2)constructor
 * 3)method
 * 4)nested class
 * 5)block of code
 * 
 * 3.What is object ?
 *  1)Instance of class (or) variable type of class 
 *  
 *  2)Instantiated from its class using new keyword
 *  
 *4.How to model an object ?
 *1)create appropriate  variable for each attribute
 *2)create appropriate method for each behavior 
 *  
 *5.what is real world object ?
 *  tangible entity it has will define boundary .Hence it have shape and character
 *
 *6.classify real world object ?
 * living(animate) and non living(in-animate) object 
 * 
 * character 
 * physical character (attribute) or field
 *  
 * behavior (action exhibited by the object)
 * 
 * 7.What is behavior ?
 * 
 * mind in cause behavior
 * 
 * 
 * 
 */
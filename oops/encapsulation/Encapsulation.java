package oops.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setBrand("BMW");
		car1.setModel("5 series");
		car1.setColour("carbon Black");
		car1.setSpeed(200);
		System.out.println(car1.getBrand());
		System.out.println(car1.getColour());
		System.out.println(car1.getModel());
		System.out.println(car1.getSpeed());
		
		Car car2 = new Car();
		
		System.out.println("Object reference: "+car1);
		System.out.println("Object reference: "+car2);


	}

}

/*1.What is Encapsulation ?
 *The process of bending the attribute and behaviors inside single logic unite of class  is called encapsulation
 *
 *2.This also help to achieve data hiding
 *
 *3.what is object reference variable ?
 *alpha numeric string assigned by system to unique identifier of an object
 * 
 *4.Memory location show hexadecimal code  ex:Car@24d46ca6
 *5. Object(Instance variable && and data) --> Heap memory
 *   local variable method call and object reference ---> stack memory
 * 
 * 6."this" pointer or "this" reference 
 *  keyword reference  invoke  current object 
 * 
 * 
 * 
 */
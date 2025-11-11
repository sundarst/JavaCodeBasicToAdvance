package oops.abstraction;
abstract class Shape 
{
	int base;
	int height;
	
	Shape(int base,int height)
	{
		this.base=base;
		this.height=height;
	}

	abstract double area();
}


class Rectangle extends Shape
{
	
	 Rectangle(int base,int height)
	{
		super(base,height);
	}
	 
	 double area()
	 {
		 return base*height;
		 
	 }
}

class Triangle extends Shape
{
	Triangle(int base,int height)
	{
		super(base,height);
	}

	double area()
	{
		return base*height*0.5;
	}

}

public class Abstraction {

	public static void main(String[] args) {
		Shape shape = new Rectangle(5,25);
		System.out.println("Area: "+shape.area());
		
		Triangle triangle = new Triangle(5,25);
		
		System.out.println("Triangle Area: "+triangle.area());
	}

}

/*1.Abstract class is process for hiding certain details  and show essential information to the user
 * 
 *2.what is abstract class ? 
 *
 *Abstract class cannot instantiated directly 
 *
 *provide subclass implement abstract member
 *
 *3.What is abstract method ?
 *A method without implemented body is termed as abstract method 
 *4.what is concrete method ?
 *A method implemented method body is termed as concrete method 
 *
 *5.what is concrete class ?
 * A class with well define member is an concrete class
 * 
 * 
 * Note:
 * 
 * 1.if a class contains at least one abstract method then class must declared as abstract class
 *
 *2.A class be marked as the abstract even it contains only concrete member ?
 * Yes
 * 
 *3.The first concrete sub class must provide implement  all inherited abstract method 
 */
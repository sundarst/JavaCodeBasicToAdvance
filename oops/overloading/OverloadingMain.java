package oops.overloading;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class MathsClass
{
	//Overload method must share same name
	public int sum(int a,int b)
	{
		return a+b;
	}
	//overloaded method must vary in parameter list 
	public int sum(int a,int b,int c) throws IOException //Method overloading is possible without inheritance 
	{
		return a+b+c;
	}
	
	protected int sum(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
	//Overloaded method can vary access modifier
	protected String sum(String s)
	{
		return "Sum the value";
	}
//	
	//Overloaded method can throw any new unchecked exception (or) checked exception 
	public int sum(int a) throws ArithmeticException
	{
		return a;
	}

}
//overloaded methods can appear with same class (or) can occur in subclass
class MathTeacher extends MathsClass
{
	public int sum(int a,int b,int c) throws FileNotFoundException
	{
		return a+b+c;
	}
	
	public int sum(int a) 
	{
		return a;
	}
	

}



public class OverloadingMain {

	public static void main(String[] args) throws IOException {
		
		MathsClass mathsClass = new MathsClass();
//which overload method is invoked is decided at compile time base of type argument		
		System.out.println(mathsClass.sum(25, 15));
		
			System.out.println(mathsClass.sum(10, 25, 15));
		
		
		
//		
		System.out.println(mathsClass.sum("sum"));
		
		 MathTeacher mathTeacher = new MathTeacher();
		 // System.out.println(mathTeacher.sum(1));
	}

}
/*1.when to prefer method overloading (or) when to overloaded method ?
 *when ever a similar type of operation is performed on different kind of data type
 *
 *2.what is advantage of method overloading ?
 *
 *The developer is free from creating remember unique method name.
 *When ever operation is performed on various data type
 *
 *3.What is qualifying criteria to determine  overloadedness ?
 *
 * Must share same name .But vary in parameter list
 * 
 * --->variation in parameter list 
 * 
 * 1)variation in number of parameter (int a,int b)-->(int a,int b, int c)
 * 2)variation in data type of parameters (int a) -->(String a)
 * 3)variation in order of parameter (int a, String b)-->(String a,int b)
 * 
 * Note:
 * 1.which overload method is invoked is decided at compile time base of type argument
 * 
 * 2.Overload method must share same name
 * 
 * 3.overloaded method must vary in parameter list 
 * 
 * 4.overloaded method can vary in return type
 * 
 * 5.Overloaded method can vary access modifier
 * 
 * 6.Overloaded method can throw any new unchecked exception (or) checked exception 
 * 
 * 7.
 * 
 * 8.overloaded methods can appear with same class (or) can occur in subclass
 * 
 * 9.which overloaded method invoke is only decided at compile time based on reference type
 * 
 * 10.Method overloading is possible without inheritance 
 * 
 * 11.we no add two object 
 * double add(Object a,object b) return double(a+b)
 * -->Use Object when you want to store or receive any type of data in one place.
 * 
 * important: 
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
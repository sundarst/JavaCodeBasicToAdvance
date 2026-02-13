package javaBasic;

enum Colour{
	
	RED,BLUE,GREEN;
}



class Student
{
	byte num=10;
	short num1=12334;
	int number=145;
	String str="words";
	char chars='s';
	
	boolean found=false;
	float floatNum=12334.14f;
	long longNum=12334;
	double doubleNum=1234.45;

}


public class DataType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student= new Student();
		System.out.println(student.num);
		System.out.println(student.str);
//		
//		Colour colour = Colour.RED;
//		System.out.println(colour);
	}

}

/*1.A Data type tells java what kind of data a variable can store.And how much memory it needs 
 *
 *2.Java has two type of data type
 *
 *---> primitive data type 
 *---> Non primitive data type  ---- 1)Derived 2)use define
 *
 *primitive data type       	1 byte = 8 bit 						range 2^n-1 <--> 2^n-1-1
 *
 *1---> byte === 1 byte   2^7-->2^7-1 == -128 to 128
 *
 *2---> short == 2 byte   2^15-->2^15-1 =  - 32768 to 32768
 *
 *3---> int == 4 byte   -2^31-->2^31-1
 *
 *4---> long === 8 byte
 *
 *5---> float === 4 byte
 *
 *6---> double === 8 byte
 *
 *7---> char === 2 byte
 *
 *8---> boolean === 1 byte
 *
 *Non- primitive data type
 *
 *Non-primitive data type are use to store memory address of an object and its attribute and that can be
 *create  either by java (or) user
 * 
 *1)Derived (Build in) 
 *
 *This are provide by the java library
 *	String,Array,class,Interface,object,StringBuffer,StringBuilder,Scanner,ArrayList,HashMap,
 *LinkedList,Date,Math,file,Thread
 *
 *2)User-Define Non-primitive
 *
 *Java gives keyword we use them can create user define data type 
 *	class(your own class)
 *	interface(your own interface)
 *	enum
 *	custom array (default size of array fixed at time of creation )
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
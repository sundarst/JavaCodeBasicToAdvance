package oops.Interface;
interface Gym
{
	default void welcomeToGym()
	{
		System.out.println("Welcome to sundar gym");
	}
}
interface Fintess 
{
	default void startWorkout()
	{
		System.out.println("After warm up and 15 minutes cycling start workout");
	}
}

interface client //Q 11 marker interface
{
	
}

class Diet
{
	public void bublkingDiet()
	{
		System.out.println("DM me i will send the Bulking diet");
	}
	public void cutingDiet()
	{
		System.out.println("DM me i will send cuting diet");
	}

}

class Trainer extends Diet  implements Gym,Fintess //A class extends class and also implements interface
{
	public void trainerVistSite()
	{
		System.out.println("I am going to vist my unit1 and unit2 ");
	}

}

//Ex:5
interface Doctor extends Gym ,Fintess //A interface can extends multiple interface
{
	default void welcomeToGym()
	{
		System.out.println("Welcome to sundar gym");
	}
	
	default void startWorkout()
	{
		System.out.println("After warm up and 15 minutes cycling start workout");
	}
}

class GymDoctor implements Doctor
{
	public void gymDoctor()
	{
		System.out.println("Welcome doctor");
	}

}

//Ex:6
 // interface Demo extends GymDoctor{} // A interface cannot extends class

//Ex:7 
//interface Demo implements Gym {} //A interface cannot implements inferface

//Ex:8

interface MyInterface
{
	default void show() { 
	//default method can only define inside the interface an cannot define inside a class
	// so that any class implementing the interface get this method default 
		//(without forcing class to implement it )
		System.out.println("Default method in interface");
	}

}

class MyClass implements MyInterface 
{ 
	//In class you cannot define keyword default for method .Instead method in class are already default 
	//if you  not specify  public  private protected 
	
	 void display()
	{
		System.out.println("Method inside class");
	}
	 
	 //so different 
	    //interface default method       -->  default implement to all class
	 	//class method without modifier  ---> just has package private access not same as interface
}

//Ex:9
interface Employee
{
	int EMPLOYEE_ID=1; // variable declare inside interface default public static final
	
	//public ---> can access any where
	//static ---> not belong to object reference.Belong to interface or class name
	// final ---> value  can not be change (constant)
	
	//Must initialize it immediately when declaring otherwise complier error
}

//why it was not object based
class Dog
{
	int age =5;

}

//Ex:11
class Animal
{
	public static final int AGE=9;

}

//Default method is way to provide default implement for any abstract method inside a class
	//							(or)
// inside class abstract method implement by default

//Ex 12
interface Animals
{  
	void sound(); //Abstract method define in interface cannot market as private protected or default
	//Why ?
	// by default it was public why because abstract method sub class need to override it 
}


//Ex 13 
interface Music
{
	static void sound()
	{
		System.out.println("New music sound was good");
	}
}

class MusicDirector implements Music
{
	//--> static method in define inside in the interface
	//are not need to inhered in class that can implement the interface name
}

public class InterfaceNote10Question {

	public static void main(String[] args) {
//Ex 4		
		
		Trainer trainer = new Trainer();
//		trainer.trainerVistSite();
//		trainer.startWorkout();
//		trainer.welcomeToGym();
//		trainer.bublkingDiet();
//		trainer.cutingDiet();

//Ex 5
		GymDoctor gymDoctor=  new GymDoctor();
		
//		gymDoctor.gymDoctor();
//		gymDoctor.welcomeToGym();
//		gymDoctor.startWorkout();
	
//Ex 6
		MyClass myclass = new MyClass();
//		myclass.show();
//		myclass.display();

//Ex: 9
		//System.out.println("Employee_id: "+Employee.EMPLOYEE_ID);

//Ex:10 //why it was not object based
		
		Dog dog = new Dog();
//		System.out.println("Dog  age"+dog.age); //5
////		
//		Dog dogTwo = new Dog();
//		dogTwo.age=7;
//		System.out.println("Dog age: "+dogTwo.age);//7 
		
		//this was variable is not object base if it object it can modify

//Ex:11
		
		//System.out.println("Animal age: "+Animal.AGE); //9
		
//Ex:12 
		MusicDirector musicDirector = new MusicDirector(); 
	//	 musicDirector.sound(); // wrong complier error //The method sound() is undefined for the type MusicDirector
		
		 Music.sound(); // correct way
		 
	}

}

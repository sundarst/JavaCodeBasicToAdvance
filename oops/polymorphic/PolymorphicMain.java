package oops.polymorphic;

class Animal
{
	void sound()
	{
		System.out.println("Animal make sound");
	}

}

class Dog extends Animal
{
	
	void sound()
	{
		System.out.println("Dog sound");
	}

}

class Cat extends Animal
{
	
	public void sound()
	{
		System.out.println("Cat sound");
	}

}


public class PolymorphicMain {

	public static void main(String[] args) {
// * Super class reference variable  = sub class object type 

		Animal animal = new Dog();
		animal.sound();
		
		Animal animal2= new Cat();
		animal2.sound();

	}

}
/*1.What is polymorphism ?
 *it is property by which method can exhibit different type of implementation 
 *
 *Type of polymorphism 
 * two type
 * compile time ( method overload)
 * runtime ( method override)
 * 
 * 3.polymorphism equation ?
 * Super class reference variable  = sub class object type 
 * 
 * poly = many
 * morphism = forms
 * 
 * method exhibit polymorphism behavior 
 * 
 *same method name can behave differently depending on the object it call on it 
 *
 *5.Different between method overloading method overriding
 *-----------------------------------------------------------------------------------------------------------
 *Method overloading                            || Method overriding
 *-----------------------------------------------------------------------------------------------------------
 *1.it is compile time phenomena                || it runtime phenomena
 *
 *2.overloading method can vary in parameter    || overriding method share same parameter
 *list
 *
 *3.overloading can vary in return type         || overriding have same return type (or) Covariants return type
 *
 *4.overloading method can vary in access       || overriding have same access modifier (or) have border access
 *												||   level 
 *5.Method overloading is possible even without 
 *inheritance                                   || Method overriding is possible with only inheritance
 *
 *6.which overloaded method is invoke is only   || which overridden method decided at runtime   
 *decided at compile time based on              ||based on reference type 
 *reference type								||
 *modifier
 *
 *7.overloaded method can throw any new checked || overridden method must not throw new checked exception.
 *												|| They can throw subtype of expression thrown 
 *												||	by inherited methods exception type
 *
 *8.overloaded method can appear in same or sub || overridden method can appear only in sub class
 *class	exception								||	
 *
 *9.method overloading is applicable for both   || Method overridden is applicable only in non-static method
 * static or non static method
 * 
 * 10.private method or final method can be     || private or final method can't be overridden
 * overloaded
 * 
 * ----------------------------------------------------------------------------------------------------------
 * 
 * 9.For non-static method the JVM look as the object type at runtime
 *   For static method JVM  does't look at the object type it directly binds the method 
 *   call to class at compile time 
 * 
 */
package oops.inheritance;
// single Inheritance
class Vehicles //(Base class)
{
	Vehicles()
	{
		System.out.println("This is vehicle");
	}
	
	public void vehiclesStart()
	{
		System.out.println("Vehicles start");
	}

}
 class Car extends Vehicles // (Derived class)
 {
	 
	 Car()
	 {
		 System.out.println("This vehicle is car");
	 }
 }
 
//sub class is derived from only one super class 
//------------------------------------------------------------------

//Multilevel Inheritance
 
 class NewVehicles //(Base class 1)
 {
	NewVehicles()
	{
		System.out.println("This is new vehicles");
	}
	
	public void bike()
	{
		System.out.println("Bike method");
	}
	
	public void auto()
	{
		System.out.println("Auto method");
	}
 }
 
 class FourVehicle extends NewVehicles //(Base class 2)
 {
	 
	 FourVehicle()
	 {
		 System.out.println("This is four vehicle");
	 }
 }
 
 class Truck extends FourVehicle //(Derived class)
 {
	 Truck()
	 {
		 System.out.println("This is truck");
	 }
 }
/*	Truck truck1 = new Truck();
 * 
 * Output: 
 * This is new vehicles
   This is four vehicle
   This is truck 
   
   *)Trigger call constructor in order
   
 * */
 
 
 //-----------------------------------------------------------------------------------------
 
 //Hierarchical Inheritance 
 
 class Bike extends NewVehicles //(derived class)
 {
	 Bike()
	 {
		 System.out.println("This Bike");
	 }
 }
 
 class Auto extends NewVehicles //(derived class)
 {
	 Auto()
	 {
		 System.out.println("This is auto");
	 }
 }
 
 //-------------------------------------------------------------------------
 
 //Multiple inheritance
 
 /* One class have more that one super class and inherit all the feature from all the parent class 
  * 
  * Note:java does not support multiple inheritance with in class.Multiple inheritance 
  * possible through interface 
  * */
 
 interface LandVehicle
 {
	 default void LandInfo()
	  {
		  System.out.println("This is land vehicle");
	  }
 }
 
 interface WaterVehicle
 {
	default void waterInfo()
	 {
		 System.out.println("Water info");
	 }
 }
 
 class AmphibiousVehicle implements LandVehicle,WaterVehicle
 {

	 AmphibiousVehicle()
	 {
		 System.out.println("This is an Amphibious vehicle");
	 }
	
	 
 }
 
 /*
  * In Java, interfaces cannot have method bodies (before Java 8) unless they are default or static methods.
    So you need to mark your methods as default or remove their bodies.
*/
 
 
 //hybrid inheritance
 
 /* It is mix of two or more of above type of inheritance 
  *  java achieve thought only interface 
  * */
 
 
//Parent class
class VehiclesTwo {
    void displayType() {
      System.out.println("This is a vehicleTwo");
  }
}

//Child class of Vehicle
class Cars extends VehiclesTwo{
   static void showCar() {
      System.out.println("This is a car");
  }
}

//Another child of Vehicle
class Bus extends VehiclesTwo {
   static void showBus() {
      System.out.println("This is a bus");
  }
}

//Grandchild of Bus
class Fare extends Bus {
  void showFare() {
      System.out.println("Bus fare is ₹50");
  }
}




 
public class TypeInheritance {

	public static void main(String[] args) {
//	  Car car1 = new Car(); // single
//		car1.vehiclesStart();
//	  Truck truck1 = new Truck(); //multilevel
		
//		Bike bike = new Bike();     //hierarchical 
//		bike.bike();
//		bike.auto();
//		Auto auto = new Auto();  //hierarchical
//		auto.bike();
//		auto.auto();
//		
		
//		AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle(); // Multiple inheritance
//		amphibiousVehicle .LandInfo();
//		amphibiousVehicle.waterInfo();
//		
		
//		Cars cars = new Cars();
//		cars.displayType();
//		Cars.showCar();
//		
//		Bus bus = new Bus();
//		bus.displayType();
//		bus.showBus();
		
		Fare fare = new Fare(); //Hybrid inheritance
		fare.displayType();
		fare.showBus();
		fare.showFare();
	}

}
/*Type of Inheritance 
 * 1)single inheritance
 * 2)multilevel inheritance
 * 3)hierarchical 
 * 4)Multiple Inheritance
 * 4)hybrid inheritance
 * 
 * 
 */
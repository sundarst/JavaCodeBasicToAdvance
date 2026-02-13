package controlStatement;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		//String colour ="Red";
		
		//If-else
//		if(colour.equals("Green"))
//		{
//			System.out.println("Colour is green");
//		}
//		else
//		{
//			System.out.println("Colour is not red");
//		}

		//if -else -if ladder
		
//		String colour="Red";
		
//		if(colour.equals("Red"))
//		{
//		}
//		else if(colour.equals("Yellow"))
//		{
//			System.out.println("Vehicle Be ready");
//		}
//		else if(colour.equals("Green"))
//		{
//			System.out.println("Vehicle Go");
//		}		System.out.println("Vehicle Stop");
	
		
		//
//	    String colour="Green";
//		
//		if(colour.equals("Red"))
//		{
//			System.out.println("Vehicle Stop");
//		}
//		else if(colour.equals("Yellow"))
//		{
//			System.out.println("Vehicle Be ready");
//		}
//		else
//		{
//			System.out.println("Vehicle Go");
//		}
		
		//Switch
		Scanner scan = new Scanner(System.in); //Take input from user(keybord)
		System.out.println("Enter Switch are avaliable onFan,onLigth,onTv");
		String switchOn=scan.next(); //help you to read data like string double etc.  from user at runtime
	
		//String switchOn="onFan";
		
		switch(switchOn)
		{
		case "onFan":
		{
			System.out.println("Fan On");
			break;
		}
		case "onLight":
		{
			System.out.println("Light On");
			break;
		}		
		case "onTv":
		{
			System.out.println("Tv on");
			break;
		}
		default :
		{
			System.out.println("Your Enter switch not avaliable");
		}
		
	}
		}

}

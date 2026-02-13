package controlStatement;

import java.util.Scanner;

public class Iterative {

	public static void main(String[] args) {
//		int num=10;
//		// for loop
//		for(int i=1;i<=num;i++)
//		{
//			System.out.print(i+" ");
//		}

		//while loop
//		int num=1;				//initialization
//		while(num<=10)			// condition
//		{
//			System.out.print(num+" ");
//			num++;				//increment
//		}
		
//		int num=10;
//		while(num>=1)
//		{
//			System.out.print(num+" ");
//			num--;
//		}
		
	//do while loop --> run fast check condition later --> so it executes at last once
//		int num=1;
//		do
//		{
//			System.out.print(num+" ");
//			num++;
//		}while(num<=10);
		
		
		
		
		
		
		//do while loop
		int choice;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("1.Add Bill");
			System.out.println("2.Edit Bill");
			System.out.println("3.Delete Bill");
			System.out.println("4.View Bill");
			System.out.println("Enter value");
		  choice=scan.nextInt();
		  
		  switch(choice)
		  {
		  case 1:System.out.println("Bill was Add Bill"); break;
		  case 2:System.out.println("Bill was Edit Bill"); break;
		  case 3:System.out.println("Bill was Delete Bill");break;
		  case 4:System.out.println("Bill was View Bill"); break;
		  default: System.out.println("Invalid choice");
		  }
			
		}while(choice!=5);
			
		
		
		
	}

}

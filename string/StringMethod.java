package string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String s1="Zoho Tenkasi";
		String s2 ="Zoho Chennai";
		
		// 1) length()	
	//	System.out.println("Length: "+s1.length());
		
//		//2) charAt()
		
	//	System.out.println("Char At: "+s1.charAt(0));
//		try
//		{
//			System.out.println("Char At: "+s1.charAt(-2));
//		}catch(Exception e)
//		{
//			System.out.println(" String Index out of bound Exception "+e);
//		}
		
//		
		//3) substring()
//		System.out.println("Substring start Index:  "+s1.substring(1));
//		System.out.println("Substring start and Ending Index:  "+s1.substring(2,6));

//		//4)equal()
		//System.out.println("equal: "+s1.equals(s2)); // check character sequence
		
//		//5) concat()
	//	System.out.println(s1.concat(s2));
//		
//		//6) toUpperCase() and toLowerCase()
//			System.out.println(s1.toUpperCase());
//			System.out.println(s2.toLowerCase());
//			
//		//7)indexOf() and lastIndexOf()
//			System.out.println("h index of value: "+s1.indexOf('h')); //2
//			System.out.println("h last index of value: "+s1.lastIndexOf('a')); //9
//			
//		//8) startsWith() and endsWith()
//			System.out.println("Start with: "+s1.startsWith("Zoh")); // check prefix
//			System.out.println("End with: "+s1.endsWith("si"));     // check suffix
//			
//		//9)trim()
//			String trims ="   Jawan Enterprises     .";
//			System.out.println("Without trim method: "+trims);
//			System.out.println("With trim method: "+trims.trim()); 
//			//It removes only leading and trailing spaces, but it stops when it reaches a non-space character.
//	
//	   //10)replace()
		//System.out.println(s2.replace("o","0"));
//	
//	//11) split()
//			String [] part = s1.split(" ");  
//			for(String split: part)
//			{
//				System.out.print(split);
//			}
//			System.out.println();
//	//12) toCharArray()
//			//Convert String to toCharArray()
//			String s="Welcome";
//			char[] arr=s.toCharArray();
//			System.out.println(arr);
//	//The output format you expect is different because Java does not print char[] in that style by default.
//			
//	//13)isEmpty()
//			String empty =" ";
//			System.out.println("Check empty: "+empty.isEmpty()); // return true length is zero
//			System.out.println("Check empty length: "+empty.length());
//	
//	//14)compareTo()
			System.out.println("apple".compareTo("apple")); //97-97 =0
			System.out.println("apple".compareTo("banna")); //97-98 =-1
			
			System.out.println("dog".compareTo("cat")); //100-99 =1
			
			/*compare to string lexicographically (alphabetical order)
			 * 
			 * */
			
			
	}

}

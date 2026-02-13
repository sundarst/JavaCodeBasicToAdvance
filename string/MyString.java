package string;
public class MyString {

	
	public static void main(java.lang.String[] args) {
		String s1 ="Hello";
		String s2 ="Hello";
//		
//		
//		System.out.println(s1==s2); // String literal use same memory location
//		
//		String s3 = new String("Hello"); // using new keyword create new memory location in heap memory 
//		System.out.println(s1==s3); 
		
		String ss1="Java";   
		char ch[]= {'s','t','r','i','n','g'};
		
		String ss2= new String(ch);
		
		System.out.println(ss1);
		System.out.println(ss2);
		

	}

}
/*1.A string is sequence collection of character
 * 
 *2.collection of character with double codes "String literal" 
 *
 *3.String are store in string pool.String pool is a special memory where java store and re-suse string literal 
 *to avoid duplicate
 *
 *4.There are two type to create String object
 * -->1) By string literal-using string pool (memory reuse)
 * -->2) By new keyword - create new object in heap memory (memory not reuse)
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
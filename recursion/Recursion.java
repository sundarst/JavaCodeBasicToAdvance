package yotube.recursion;
public class Recursion {
	static int sumOfNumber(int n)
	{ 
		if(n==0)return 0;
		return n+sumOfNumber(n-1);
	}
	static void directRecursion(int n)
	{
		if(n==0) return;
		 System.out.print(n);
		 directRecursion(n-1);//7,6,5,4,3,2,1
	}	
	
	static void headRecursion(int n)
	{
		if(n==0) return;
		 headRecursion(n-1);
		 System.out.print(n);//1,2,3,4,5,6,7,
	}

	static int tailRecursion(int n,int sumN)
	{
		if(n==0) return sumN;
		return tailRecursion(n-1,sumN+n);//0+5=5=5+4=9//9+3=12/12+2=14//14+1=15//0
	}
	
	static int fibonacci(int n)
	{
		if(n==0 || n==1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);   //1 2 3 4 5
												//0 1 1 2+3+5
		
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println(sumOfNumber(5));
		directRecursion(7);
		System.out.println();
		headRecursion(7);
		System.out.println();
		System.out.println("Tail recursion: "+tailRecursion(5,0));
		
		System.out.println("fibonacci: "+fibonacci(5));
		}

}


/* 1.A method call itself until it reach the base condition(to stop recursion)
 
 *
 * 2.To write Recursion
 *    Identify the base condition or termination condition 
 *    method 
 *    
 *3.Type of recursion
 *1.Direct recursion -> function call itself
 *2.Head Recursion   -> when have statement after the recursion call
 *3.Tail recursion   -> recursion statement is last statement of the method
 * 
 * 4.When you use recursion 
 * 1.when we divide large program to small program
 * 2.when the n is small(n is large it will lead stack over flow)
 * 3.when we write recursion relation
 * 4.iteration to recursion
 * 5.when iteration is harder recursion is easier(like tree traversal)
 * 
 * step 1 think how to solve in loop
 * step 2 convert the problem to recursion
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
 * 
 */
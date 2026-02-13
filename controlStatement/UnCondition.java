package controlStatement;

public class UnCondition {
	
	
	//return 
			void test()
			{
				System.out.println("Start");
				return;
				
				//System.out.println("End"); // this line never run
			}

	public static void main(String[] args) {
		//break;
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5)
//			{
//				System.out.print(i);
//				break;
//				
//			}
//			
//			System.out.print(i+" ");
//			
//		}
		
		//continue  ----> use to skip the statement
//		for(int i=0;i<=5;i++)
//		{
//			if(i==3) continue;
//			
//			System.out.print(i+" ");
//			
//			
//		}
		
		UnCondition unCondition = new UnCondition();
		unCondition.test();
//		
		
		

	}

}

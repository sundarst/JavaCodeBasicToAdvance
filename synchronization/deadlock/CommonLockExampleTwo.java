package synchronization.deadlock;

class Toll
{
	public void enterToll()
	{
		System.out.println("Enter in toll gate ");
	}
	public void payRoll()
	{
		System.out.println("Pay to toll");
	}
	public void exitToll()
	{
		System.out.println("Exit the toll");
	}
}

public class CommonLockExampleTwo {

	public static void main(String[] args) {
		
		Object commonLock =  new Object();
		Toll toll = new Toll();
		
		
		Thread t1 = new Thread(()->{
			
			synchronized(commonLock)
			{
				System.out.println("car");
				toll.enterToll();
				synchronized(commonLock)
				{
					System.out.println("car");
					toll.payRoll();
				}
				System.out.println("car");
				toll.exitToll();
			}
		});
		Thread t2 = new Thread(()->{
			
			synchronized(commonLock)
			{
				System.out.println("van"); 
				toll.enterToll();
				synchronized(commonLock)
				{
					System.out.println("van");
					toll.payRoll();
				}
				System.out.println("van");
				
				
				toll.exitToll();
			}
		});
		
     
     t1.start();
     t2.start();
	
	try
	{
		t1.join();
		t2.join();
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	}
}

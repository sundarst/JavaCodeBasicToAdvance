package synchronization.deadlock;

class Car{}
class Bike{}

public class CommonLock {

	public static void main(String[] args)
	{
		Object commonLock = new Object();
		
		Car car = new Car();
		Bike bike = new Bike();
		
		Thread t1 = new Thread(()->{
			synchronized(commonLock)
			{
				System.out.println("car");
				synchronized(commonLock)
				{
					System.out.println("Bike");
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			synchronized(commonLock)
			{
				System.out.println("Bike");
				synchronized(commonLock)
				{
					System.out.println("car");
				}
			}
		});
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e)
		{
			System.out.print(e);
		}
		

	}

}
/*Using a common lock in nested synchronized blocks ensures that both threads wait for the same lock,
 * so only one thread enters at a time, preventing deadlock.
 * */


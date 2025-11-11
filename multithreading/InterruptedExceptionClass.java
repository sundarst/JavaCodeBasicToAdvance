package multithreading;

class InterruptedExceptionPartice
{
	public void partice()
	{
		System.out.println("Using thread implemntion we can extends multiple thread");
	}

}
class InterruptedExceptionTypeTwo implements Runnable 
{
	
	public void run()
	{
		
		try
		{
			Thread.sleep(5000);
			System.out.println("thread is sleep for 5 second: "+Thread.currentThread().getName());
			
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		
	}
	

	
}


public class InterruptedExceptionClass {

	public static void main(String[] args) {
		InterruptedExceptionTypeTwo task= new InterruptedExceptionTypeTwo();
		Thread thread = new Thread(task);
		thread.start();
		
		try
		{
			Thread.sleep(1000);
			System.out.println("thread is sleep for 1 second: "+Thread.currentThread().getName());
			thread.interrupt();
		}catch(InterruptedException e)
		{
			System.out.println("Error"+e.getMessage());
		}

	}

}

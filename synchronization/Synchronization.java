package synchronization;

class CoffeCounter
{
	 public int count=0;
	
	// synchronization method	 
	public synchronized void serverCoffe() 
	{
		count++;
	} 
	 //synchronization block 
//	 public void serverCoffe()
//	 {
//		 synchronized(this)
//		 {
//			 count++;
//		 }
//	 }

	public synchronized int getCoffecount()
	{
		return count;
	}

}

class Server implements Runnable // thread 1
{
	 private CoffeCounter count;

	   Server(CoffeCounter count)
		{
			this.count=count;
		}
	
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			count.serverCoffe();
		}
		
	}
}

class ServerTwo implements Runnable // thread 2
{
	private CoffeCounter sCount;
	ServerTwo(CoffeCounter count)
	{
		sCount=count;
	}
	
	public void run()
	{
		
		for(int i=0;i<200;i++)
		{
			sCount.serverCoffe();
		}
	}
}

public class Synchronization {

	public static void main(String[] args) {
		CoffeCounter coffeCounter = new CoffeCounter();
		Server server = new Server(coffeCounter);
		
		ServerTwo serverTwo = new ServerTwo(coffeCounter);
		
	    Thread t = new Thread(server);
	    Thread t2 = new Thread(serverTwo);
	    
	    t.start();
	    t2.start();
	    
	    try
	    {
	    	
	    	t.join();
	    	t2.join();
	    }
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }		// if not use joint before t and t2 thread finished it will print main method  
	    
	    System.out.println(coffeCounter.getCoffecount());
		
	    
		
		

	}

}
/*1.What is synchronization 
 * Synchronization  is use to lock method or block of code .So only one thread can access at executed at time
 * 
 * Type of synchronization 
 * two type
 * synchronization method 
 * synchronization block
 * 
 * 2.why synchronization ?
 * In multithreading synchronization is import  make sure multiple thread safe work on share  resource 
 * 
 * 3 Without synchronization 
 * data became inconsistency.if multiple  threads access and  modify the share variable at the  same time
 * 
 * 4.what java mechanism work purposes
 *  That ensure only  one thread can resource access at the given time 
 *  
 * 5.what is advantage 
 * To prevent issue such as data inconsistency and to avoid race condition when multiple
 *  thread interact with share resource
 *  
 *  Joint()
 *  1. joint() is method  make one thread wait until another thread to finished 
 *  
 *  2.without join() what happened ?
 *  main thread and  t1 run concernedly  output will mismatch
 *  
 *  3. with join()
 *  main thread wait for t1 run to complete first 
 *  
 *  
 *  join() in synchronization because it control execution order between thread
 *
 *
 *===========================================================================================================
 * Synchronization                                       join
 * ===============================================================================================================
 * 1.use lock method or block of code.if multiple       use to control order of execution between thread      
 *  thread shared same resource
 * 
 * 2. prevent data inconsistency and race condition     make sure one thread wait until another thread finished
 * 
 * Example: make sure two thread dont update same bank  Ex: main thread wait for child thread to complete first
 * balance at once 
 * ===============================================================================================================
 * 
 * 
 *  Option	Lock Type	Usage
   synchronized(this)	instance lock	Default for normal methods
   synchronized(lock)	custom lock	Fine-grained control 
    private final Object lock = new Object();
    public int count = 0;
   synchronized(CoffeCounter.class)	class-level lock	For static data
   synchronized method	shorthand for this	Simpler syntax
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
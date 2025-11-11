package synchronization.deadlock;
class Pen 
{}
class NoteBook
{}
public class DeadLock {

	public static void main(String[] args) {
		Pen pen = new Pen();
		NoteBook noteBook = new NoteBook();
		
		Thread t1 = new Thread(()->{
			synchronized(pen)
			{
				System.out.println("pen 1");
				synchronized(noteBook)
				{
					System.out.println("noteBook 1");
				}
			}
		});

// With lambda expression
		
//		Thread t2 = new Thread(()->{
//			synchronized(noteBook)
//			//synchronized(pen)
//			{
//				System.out.println("NoteBook 2");
//				//System.out.println("pen 2");
//				
//				synchronized(pen)
//				//synchronized(noteBook)
//				{
//					System.out.println("pen 2");
//					//System.out.println("NoteBook 2");
//				}
//			}
//		});
	
//without lambda expression 
		Runnable task1 = new Runnable() { // create Runnable  object (using normal anonymous inner class)

			@Override
			public void run() {
				//synchronized(noteBook)
				synchronized(pen)
				{
					//System.out.println("NoteBook 2");
					System.out.println("pen 2");
					
					//synchronized(pen)
					synchronized(noteBook)
					{
						//System.out.println("pen 2");
						System.out.println("NoteBook 2");
					}
				}
			}	
		};
		
		Thread t2 = new Thread(task1);
/* All thread share one lock so only one thread enter block at the time
 * 
 * 
 * */
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
/*1.why DeadLock ?
 * Deadlock occur in java when multiple thread each other while wanting for lock to help by one another.To 
 * prevent deadlock we use synchronization keyword to make lock method or block thread safe .Which means 
 * only one thread can have the lock synchronization method and use it other thread have to wait till the 
 * the block release other one can acquire 
 * 
 *2.How to avoid starvation(Deadlock)
 *Nested synchronized it will happened starvation
 * 
 * 3.Type to avoid deadlock
 * 
 * 1.Avoid nested synchronized
 * 2.synchronized order same
 * 3.use common lock
 * 
 * 4.To avoid deadlock either don 't use nested synchronized block or you must always acquired lock in same order 
 * across all thread
 * 
 * 5.Alternatively you can use a common lock object to synchronized share operation
 * 
 * 
 * 
 * 
 * 
 */
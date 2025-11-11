package multithreading;

class TypeOneThread extends Thread
{
	 public void run()
		{
			System.out.println("Thread exteds type one"+Thread.currentThread().getName());
		}

	}
class TypeOneThreadTwo extends Thread
{
	public void run()
	{
		System.out.println("Second Thraed"+Thread.currentThread().getName());
	}

}
public class MyThread{
	public static void main(String[] args) 
	{
		
		TypeOneThread  t = new TypeOneThread();
		t.setName("Thread-1"); //My default thread name thread-0 t.setName() help to rename thread name
		t.start();
		 TypeOneThreadTwo t2 = new  TypeOneThreadTwo();
		 t2.start();
	}

}


/* 1.what is Multithreading?
 * Multithreading is java feature that enable the program to run multhreading simultaneously allowing task to 
 * execute parallel it utilize CPU more efficiency
 * 
 * 2.processes based
 * tow or more program run concurrently
 * in browser we can hear song and we type in google doc this are happend in help multithreading
 * 
 * 3.what is thread ?
 * A thread is light weight independent unit execution inside  running java.Not a file
 *
 *4.A process of having  multithreading?
 * Each thread run independently but share same memory 
 * 
 * 5.Different way to create thread?
 * There are two way to create thread 
 * 1.extends Thread class 
 * 2.implements runnable interface
 * 
 * 6.flow of run method 
 * start() method is define inside a thread class inside thread class  start() 
 * method inside it have run() method
 * 
 * 7.Advantage of Thread class and runnable interface 
 * Thread class
 * 1.use for simple task 
 * 2.override run() method
 * 3.support inheritance
 * Disadvantage extends only Thread class cannot extends other class
 * Runnable interface
 * you can still extends another class
 *use for real time project where classes usually extends something 
 *need to passes thread object
 *
 * 8.Thread.sleep()
 * 1.pausing executing with thread.sleep()
 * 2.Efficient means of making processor time available to other thread 
 * thread.sleep(1000)
 * 3.must inside try{} catch{}
 * 
 * 9.Interrupted Exception
 * Exception throw when thread interrupted with current  thread 
 * when sleeping thread is interrupted java throw an interrupted exception inside thread 
 * 
 * 10.java gives two option 
 * use Thread class
 * use runnable interface to extends class
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
 * */

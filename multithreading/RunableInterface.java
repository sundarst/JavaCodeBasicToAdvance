package multithreading;

class Partice
{
	public void partice()
	{
		System.out.println("Using thread implemntion we can extends multiple thread");
	}

}
class TypeTwo implements Runnable 
{
	public void run()
	{
		System.out.println("Type two Runable interfae: "+Thread.currentThread().getName());
		
	}
	
}

class TypeTwoDemo extends Partice implements Runnable 
{
	public void run()
	{
		System.out.println("Type two Runable interfae: "+Thread.currentThread().getName());
		partice();
	}
	
}

public class RunableInterface {

	public static void main(String[] args) {
		TypeTwo t1= new TypeTwo();
		Thread thread = new Thread(t1);
		thread.start();
		
		TypeTwoDemo typeTwoDemo = new TypeTwoDemo();
		Thread thread2 = new Thread(typeTwoDemo);
		thread2.start();

	}

}

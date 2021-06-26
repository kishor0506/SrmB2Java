package Multithread;

public class IsAlive extends Thread {

	public void run()
	{
		System.out.println("lokesh");
		try {
        		Thread.sleep(500);
    		}
    	catch(InterruptedException ie) 
    	{ 
    		// do something
    	}
       	System.out.println("srmtech ");
  	}
	public static void main(String[] args)
	{
		IsAlive t1=new IsAlive();
		IsAlive t2=new IsAlive();
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}



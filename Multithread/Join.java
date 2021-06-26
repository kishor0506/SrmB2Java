package Multithread;


	public class Join extends Thread {
	    public void run()
	    {
	        System.out.println("srinath ");
	        try {
	            Thread.sleep(300);
	        }
	        catch (InterruptedException ie) {
	        }
	        System.out.println("srmtech ");
	    }
	    public static void main(String[] args)
	    {
	        Join c1 = new Join();
	        Join c2 = new Join();
	        c1.start();
	  
	        try {
	            c1.join();
	        }
	        catch (InterruptedException ie) {
	        }
	  
	        c2.start();
	    }
	}


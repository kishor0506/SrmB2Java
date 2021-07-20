package lambdaexp;

public class ThreadUsingLambdaExp {

	public static void main(String[] args) 
	{
		System.out.println("Creating Thread using Lambda Experssion\n");
		 new Thread(() -> 
		 { 
	         for(int i=5; i <= 50;) 
	         {
	            System.out.println("Child Thread: "+ i);
	            i+=5;
	            try 
	            {
	               Thread.sleep(500);
	            } catch(Exception e) 
	            {
	               e.printStackTrace();
	            }
	         }
	      }).start();
	     
	      for(int j=1; j < 11; j++) {
	         System.out.println("Main Thread: "+ j);
	         try
	         {
	            Thread.sleep(500);
	         } catch(Exception e)
	         {
	            e.printStackTrace();
	         }
	      }
	   }
	}

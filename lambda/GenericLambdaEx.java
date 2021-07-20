package lambda;

public class GenericLambdaEx
{
	  public static void main(String[] args) 
	  {
	      GenericIf<String> r;
	      r = (item, items) -> {
	      int count=0;
	      for (int i=0; i<items.length; i++)
	      {
	        if (item==items[i])
	        {
	          count++;
	        }
	      }
	      return count;
	      
	    };
	    System.out.println("Number of Occurences");
	    System.out.println("**************************");
	    String[] str = { "123", "321", "412", "214", "123", "321" };
	    int c = r.Search("123", str);
	    System.out.println("\nCounts = " + c);
	}
}



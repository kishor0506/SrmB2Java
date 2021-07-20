package lambda;

public class SimpleLambda {

	public static void main(String[] args) 
	{  
		System.out.println("ARITHMETIC OPERATIONS");
		System.out.println("************************");
        Addexp ad1=(a,b)->(a+b);  
        System.out.println("Addition : "+ad1.add(10,20));  
          
        Subexp s2=(c,d)->(c-d);  
        System.out.println("Subtraction : "+s2.sub(20,10));
        
        Mulexp m3=(e,f)->(e*f);
        System.out.println("Multiplication : "+m3.mul(20,10));
        
        Divexp d=(i,j)->(i/j);
        System.out.println("Divide : "+d.div(25, 5));
    }  
}

package lambdaexp;
import java.util.function.BiFunction;  

class AreaRect
{  
	public static int area(int a, int b)
	{  
		return a*b;  
	}  
	public static float area(int a, float b)
	{  
		return a*b;  
	}  
	public static float area(float a, float b)
	{  
		return a*b;  
	}
}

public class PredefinedFuncInterface {

	public static void main(String[] args) 
	{
		BiFunction<Integer, Integer, Integer>a1 = AreaRect::area;  
		BiFunction<Integer, Float, Float>a2 = AreaRect::area;  
		BiFunction<Float, Float, Float>a3 = AreaRect::area;  
		int r1 = a1.apply(10, 20);  
		float r2 = a2.apply(10, 9.0f);  
		float r3 = a3.apply(10.0f, 15.0f); 
		System.out.println("Bi-Functional Interface:\n");
		System.out.println("Area of Rectangle (Integer,Integer): "+r1);  
		System.out.println("Area of Rectangle (Integer,float): "+r2);  
		System.out.println("Area of Rectangle (Integer,float): "+r3);  
	}
}

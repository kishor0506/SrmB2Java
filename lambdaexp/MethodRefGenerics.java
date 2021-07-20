package lambdaexp;

interface Arr<T> {

    void m(T[] arr);

}
class MyRefClass {

    static <T> void showArr(T[] arr) {
 
        for (T a : arr) 
        {
 
            System.out.print("["+a+"] ");
        }
    System.out.println();
   }
}
public class MethodRefGenerics 
{
	 static <T> void ShowArr(Arr<T> obj, T[] arr) {
		 
	        obj.m(arr);
	     }

	     public static void main(String[] args) 
	     {
	    	System.out.println("Method Reference using generics");
	    	System.out.println("*********************************\n");
	        Integer[] val1 = {5,10,15,20,25};
	        String[] val2 = {"Sam","Jack","John","Peter","Elsa"};
	        System.out.println("\nInteger Generictype");
	        ShowArr(MyRefClass::<Integer>showArr, val1);
	        ShowArr(MyRefClass::showArr, val1);
	        System.out.println("\nString Generictype");
	        ShowArr(MyRefClass::<String>showArr, val2);
	        ShowArr(MyRefClass::showArr, val2);
	}

}

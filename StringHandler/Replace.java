package StringHandler;

public class Replace {
	
	    public static void main(String args[]) {
	        String S1 = new String("SKODA OCTAVIA IS A SEDAN TYPE CAR");
	        System.out.println("Original String is ': " + S1);
	        System.out.println("String after replacing 'fox' with 'dog': " + S1.replace("OCTAVIA", "RAPID"));
	        System.out.println("String after replacing all 't' with 'a': " + S1.replace('C', 'A'));

	    }
	}

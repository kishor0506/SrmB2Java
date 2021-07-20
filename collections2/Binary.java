package collections2;
import java.util.Arrays;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements of the array: ");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of Array: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("Elements after sort: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter element to search : ");
		int search=sc.nextInt();
		int val=Arrays.binarySearch(arr, search);
		if(val<0) {
			System.out.println("Element is not found in the array..");
		}
		else {
			System.out.println("Element found at index : "+val);
		}
		
sc.close();
	}
}
	
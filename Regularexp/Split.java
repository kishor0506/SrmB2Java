package Regularexp;

import java.util.Scanner;;
public class Split {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,stringToBeMatched;
        System.out.println("Enter Regex String: ");
        str=sc.nextLine();
        System.out.println("String before applying split(): ");
        String[] arrOfStr = str.split("s", 0);
        System.out.println("String after applying split(): ");
        for (String a : arrOfStr)
            System.out.println(a);
    }
}
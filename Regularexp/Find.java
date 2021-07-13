package Regularexp;
import java.util.regex.*;
import java.util.Scanner; 
public class  Find {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str,stringToBeMatched;
        System.out.println("Enter Regex String: ");
        str=sc.nextLine();
        Pattern pattern = Pattern.compile(str);
        System.out.println("Enter string to be matched: ");
        stringToBeMatched=sc.nextLine();
        Matcher matcher = pattern
                  .matcher(stringToBeMatched);
        System.out.println(matcher.find());
    }
}
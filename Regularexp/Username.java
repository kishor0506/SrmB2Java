package Regularexp;

import java.util.Scanner;
import java.util.regex.*;
  
class Username {
    public static boolean isValidUsername(String name)
    {
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);
  
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter Username to check if it is valid: ");
        str=sc.nextLine();
         if (isValidUsername(str))
             System.out.println(str + " is a valid Username");
         else
             System.out.println(str + " is not a valid Username");
  
      
    }
}
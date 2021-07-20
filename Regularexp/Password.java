package Regularexp;

import java.util.regex.*;
import java.util.Scanner;
class Password {
    public static boolean isValidPassword(String password)
    {
        String regex = "^(?=.*[0-9])"
                       + "(?=.[a-z])(?=.[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
                       
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }

        Matcher m = p.matcher(password);
        return m.matches();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter Password to check if it is valid: ");
        str=sc.nextLine();
         if (isValidPassword(str))
             System.out.println(str + " is a valid Password");
         else
             System.out.println(str + " is not a valid Password");
  
      
    }
}
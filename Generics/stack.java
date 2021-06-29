package Generics;

import java.util.Stack;

public class stack {
	  
    public static void main(String[] args)
    {
  
        Stack stack1 = new Stack();
  
        Stack<String> stack2 = new Stack<String>();

        stack1.push(4);
        stack1.push("kishor");
        stack1.push("lokesh");
  
        stack2.push("srinath");
        stack2.push("kumar");
        stack2.push("tamil");
  
        
        System.out.println(stack1);
        System.out.println(stack2);
    }
}

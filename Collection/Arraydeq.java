package Collection;

import java.util.ArrayDeque;

public class Arraydeq {
	public static void main(String[] args) {

		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

		stack.push(2);
		stack.push(5);
		stack.push(6);

		System.out.println("Current element at the top of the stack: " + stack.peek());

		System.out.println("Element popped from the stack: " + stack.pop());

		System.out.print("Current elements in the stack: ");
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}

	}
}

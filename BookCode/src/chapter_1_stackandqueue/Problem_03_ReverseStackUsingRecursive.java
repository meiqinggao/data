package chapter_1_stackandqueue;

import java.util.Stack;

public class Problem_03_ReverseStackUsingRecursive {

	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}

	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.isEmpty()) {
			return result;
		} else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}

//	public static int reverse2(Stack<Integer> stack) {
//		Integer result = stack.pop();
//		if (!stack.isEmpty()) {
//			return reverse2(stack);
//		} else {
//			return result;
//		}
//		stack.push(result);
//
//	}

	public static void main(String[] args) {
		Stack<Integer> test = new Stack<Integer>();
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		test.push(5);
		reverse(test);
//		reverse2(test);
		while (!test.isEmpty()) {
			System.out.println(test.pop());
		}

	}

}

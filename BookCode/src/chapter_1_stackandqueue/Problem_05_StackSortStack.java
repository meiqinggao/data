package chapter_1_stackandqueue;

import java.util.Stack;

public class Problem_05_StackSortStack {

	public static void sortStackByStack(Stack<Integer> stack) {
		Stack<Integer> help = new Stack<Integer>();
		while (!stack.isEmpty()) {
			int cur = stack.pop();
			while (!help.isEmpty() && help.peek() < cur) {
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while (!help.isEmpty()) {
			stack.push(help.pop());
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(1);
		stack.push(6);
		stack.push(2);
		stack.push(5);
		stack.push(4);
		sortStackByStack2(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

	private static void sortStackByStack2(Stack<Integer> stack){
		Stack<Integer> helper = new Stack<>();
		helper.push(stack.pop());
		while (!stack.isEmpty()){
			int value = stack.pop();
			//这个条件很关键： 1.一定要加上isEmpty Check
			// 2. IsEmpty() 的条件一定要放在前面，不然会抛异常
			while (!helper.isEmpty() && value > helper.peek()) {
				stack.push(helper.pop());
			}
			helper.push(value);
		}

		while (!helper.isEmpty()) {
			stack.push(helper.pop());
		}
	}

}

package com.collections.List;

import java.util.Stack;

/*
 * stack is a linear data structure that is used to store the collection of objects
 * Stack is a class that falls under the Collection framework that extends the Vector class.
 * It represents the LIFO stack of objects.
 * If the stack has no element is known as an empty stack. When the stack is empty the value of the top variable is -1.
 * Stack class that provides different operations such as push, pop, search, etc.
 */
public class AboutStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		System.out.println("Size "+ stack.size());
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(2, 5);
		System.out.println(stack.capacity());
		stack.push(11);
		System.out.println(stack.peek());
		stack.push(13);
		System.out.println(stack.pop());
		System.out.println("capacity " + stack.capacity());
		System.out.println("size " + stack.size());
		System.out.println(stack);
	}

}

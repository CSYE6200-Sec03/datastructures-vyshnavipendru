package edu.neu.csye6200;

import java.lang.reflect.Array;

class Stack2<T> {

	T[] arr;
	int capacity;
	int top;

	@SuppressWarnings("unchecked")
	public Stack2(Class<T> stack, int size) {
		arr = (T[]) Array.newInstance(stack, size);
		capacity = size;
		top = -1;
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return (top == capacity - 1);
	}

	public void push(T item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Inserting " + item);
		arr[++top] = item;
	}

	public T pop() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		System.out.println("Removing " + peek());
		return arr[top--];
	}

	public T peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.exit(1); // ERROR
		}
		return null;
	}

	public static void demo() {

		Stack2<Integer> q = new Stack2<Integer>(Integer.class, 5);

		q.push(1); // 1st in
		q.push(2); // 2nd in
		q.pop(); // 2nd out is 2
		q.pop(); // 1st out is 1
		q.push(2); // 3rd in
		System.out.println("Top element is: " + q.peek());
		System.out.println("Stack size is " + q.size());
		q.pop(); // 3rd out is 3
		if (q.isEmpty())
			System.out.println("Stack Is Empty");
		else
			System.out.println("Stack Is Not Empty");

		Stack2<String> q1 = new Stack2<String>(String.class, 5);

		q1.push("Hello1"); // 1st in
		q1.push("Hello2"); // 2nd in
		q1.pop(); // 2nd out is Hello2
		q1.pop(); // 1st out is Hello1
		q1.push("Hello3"); // 3rd in
		System.out.println("Top element is: " + q1.peek());
		System.out.println("Stack size is " + q1.size());
		q1.pop(); // 3rd out is Hello3
		if (q1.isEmpty())
			System.out.println("Stack Is Empty");
		else
			System.out.println("Stack Is Not Empty");
	}
}
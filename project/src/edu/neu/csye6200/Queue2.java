package edu.neu.csye6200;

import java.lang.reflect.Array;

public class Queue2<T> {

	T[] arr;
	int capacity;
	int front;
	int rear;
	int count;

	@SuppressWarnings("unchecked")
	public Queue2(Class<T> queue, int size) {
		arr = (T[]) Array.newInstance(queue, size);
		capacity = size; // Max size
		front = 0;
		rear = -1;
		count = 0; // elements in Queue
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

	public boolean isFull() {
		return (size() == capacity);
	}

	public void enqueue(T item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Adding " + item);
		rear = (rear + 1) % capacity; // circular index
		arr[rear] = item;
		count++;
	}


	public T dequeue() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		T e = arr[front];
		System.out.println("Removing " + e);
		front = (front + 1) % capacity; // circular index
		count--;
		return e;
	}

	public T peek() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		return arr[front];
	}

	public static void demo() {
		Queue2<Integer> q = new Queue2<Integer>(Integer.class, 5);

		q.enqueue(1); // 1st in
		q.enqueue(2); // 2nd in
		q.enqueue(3); // 3rd in
		System.out.println("Front element is: " + q.peek());
		q.dequeue();// 1st out is 1
		System.out.println("Front element is: " + q.peek());
		System.out.println("Queue size is " + q.size());
		q.dequeue();// 2nd out is 2
		q.dequeue();// 3rd out is 3
		if (q.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");

		System.out.println("\n Testing whether Queue<Double> works");
		Queue2<Double> q1 = new Queue2<Double>(Double.class, 5);

		q1.enqueue(1.2); // 1st in
		q1.enqueue(2.67); // 2nd in
		q1.enqueue(3.1223); // 3rd in
		System.out.println("Front element is: " + q1.peek());
		q1.dequeue();// 1st out is 1
		System.out.println("Front element is: " + q1.peek());
		System.out.println("Queue size is " + q1.size());
		q1.dequeue();// 2nd out is 2.67
		q1.dequeue();// 3rd out is 3.1223
		if (q1.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
	}

}

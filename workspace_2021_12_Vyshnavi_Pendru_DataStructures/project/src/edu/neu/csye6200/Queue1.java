package edu.neu.csye6200;

public class Queue1 {
	int[] arr;
	int capacity;
	int front;
	int rear;
	int count;

	public Queue1(int size) {
		arr = new int[size];
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

	public void enqueue(int item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Adding " + item);
		rear = (rear + 1) % capacity; // circular index
		arr[rear] = item;
		count++;
	}


	public int dequeue() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		int e = arr[front];
		System.out.println("Removing " + e);
		front = (front + 1) % capacity; // circular index
		count--;
		return e;
	}

	public int peek() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		return arr[front];
	}

	public static void demo() {
		Queue1 q = new Queue1(5);
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
	}
}
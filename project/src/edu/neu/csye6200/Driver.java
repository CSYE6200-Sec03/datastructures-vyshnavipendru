package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("---Queue1 demonstration---");
		Queue1.demo();
		
		System.out.println("---Queue2 demonstration---");
		Queue2.demo();
		
		System.out.println("---Stack1 demonstration---");
		Stack1.demo();

		System.out.println("---Stack2 demonstration---");
		Stack2.demo();
	}

}

/*
 * 
 * ---Queue1 demonstration---
Adding 1
Adding 2
Adding 3
Front element is: 1
Removing 1
Front element is: 2
Queue size is 2
Removing 2
Removing 3
Queue Is Empty

---Queue2 demonstration---
Adding 1
Adding 2
Adding 3
Front element is: 1
Removing 1
Front element is: 2
Queue size is 2
Removing 2
Removing 3
Queue Is Empty

 Testing whether Queue<Double> works
Adding 1.2
Adding 2.67
Adding 3.1223
Front element is: 1.2
Removing 1.2
Front element is: 2.67
Queue size is 2
Removing 2.67
Removing 3.1223
Queue Is Empty

---Stack1 demonstration---
Inserting 1
Inserting 2
Removing 2
Removing 1
Inserting 2
Top element is: 2
Stack size is 1
Removing 2
Stack Is Empty

---Stack2 demonstration---
Inserting 1
Inserting 2
Removing 2
Removing 1
Inserting 2
Top element is: 2
Stack size is 1
Removing 2
Stack Is Empty
Inserting Hello1
Inserting Hello2
Removing Hello2
Removing Hello1
Inserting Hello3
Top element is: Hello3
Stack size is 1
Removing Hello3
Stack Is Empty
*/

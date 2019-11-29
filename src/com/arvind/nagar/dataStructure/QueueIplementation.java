package com.arvind.nagar.dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class QueueIplementation {

	int front, rear, size; 
	int  capacity;
	int array[];  

	public QueueIplementation(int capacity) { 
		this.capacity = capacity;
		front = this.size = 0;  
		rear = capacity - 1; 
		array = new int[this.capacity];  
	} 

	// Queue is full when size becomes equal to  
	// the capacity  
	boolean isFull(QueueIplementation queue){  
		
		return (queue.size == queue.capacity); 
	} 

	// Queue is empty when size is 0 
	boolean isEmpty(QueueIplementation queue) {
		return (queue.size == 0); 
	} 

	// Method to add an item to the queue.  
	// It changes rear and size 
	void enqueue( int item) { 
		if (isFull(this)) {// if full increase the array length
			ensureCapacity();
		}

		this.rear = (this.rear + 1)%this.capacity; 
		this.array[this.rear] = item; 
		this.size = this.size + 1; 
		System.out.println(item+ " enqueued to queue"); 
	} 

	// Method to remove an item from queue.   
	// It changes front and size 
	int dequeue() { 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		int item = this.array[this.front]; 
		this.array[this.front] = 0; // as the item is removed, makes the element to 0.
		this.front = (this.front + 1)%this.capacity; 
		this.size = this.size - 1; 
		return item; 
	} 

	// Method to get front of queue 
	int front() { 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		return this.array[this.front]; 
	} 

	// Method to get rear of queue 
	int rear() { 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		return this.array[this.rear]; 
	} 
	
	private void ensureCapacity(){
		this.capacity = this.capacity*2;
		array = Arrays.copyOf(array, this.capacity);
	}

	public static void main(String[] args) {
		try{
			System.out.println("Enter the queue size : ");
			Scanner scanner = new Scanner(System.in);
			int capacity = Integer.valueOf(scanner.nextLine());
			scanner.close();
			QueueIplementation queue = new QueueIplementation(capacity); 
	        
	        queue.enqueue(10); 
	        queue.enqueue(20); 
	        queue.enqueue(30); 
	        queue.enqueue(40); 
	        
	        System.out.println(queue.dequeue() +  
	                     " dequeued from queue\n"); 
	        
	        System.out.println("Front item is " +  
	                               queue.front()); 
	           
	        System.out.println("Rear item is " +  
                                queue.rear()); 
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

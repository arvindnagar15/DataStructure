package com.arvind.nagar.dataStructure;

public class LinkedListImplementation {

	private Node head;
	
	public void add(int item){
		Node newNode = new Node(item);
		
		if(head == null){
			head = newNode;
		}else{
			Node currentNode = head;
			while(currentNode.next != null){
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}
	
	public void show(){
		Node currentNode = head;
		while(currentNode != null){
			System.out.println(currentNode.item);
			currentNode = currentNode.next;
		}
	}
	
	public void addAtStart(int item){
		Node newNode = new Node(item);
		newNode.next = head;
		head = newNode;
	}
	
	public void addAtIndex(int item, int index){
		Node newNode = new Node(item);
		if(head == null){
			head = newNode;
		}else{
			Node currentNode = head;
			if(index == 0){
				addAtIndex(item, index);
				return;
			}
			for(int counter = 0; counter<index; counter++){
				currentNode = currentNode.next;
			}
			//First point next of newNode(25) to (30)
			newNode.next = currentNode.next;
			//and then point currentNode (20) to newNode(25) 
			currentNode.next = newNode;
			
		}
	}
	
	public int get(int index){
		Node currentNode = head;
		for(short counter =0; counter<index; counter++){
			currentNode = currentNode.next;
		}
		
		return currentNode.item;
	}
	
	public void remove(int index){
		
		if(index == 0){
			head = head.next;
		}else{
			Node currentNode = head;
			for(short counter = 0; counter<index; counter++){
				currentNode = currentNode.next;
			}
			//Now take the n1 to temporary variable 
			//and first assign removal index(let say index is index 2-> 25) to
			// and then assign plug temp node next to currentNode
			Node tempNode = currentNode.next;
			currentNode.next = tempNode.next;
		}
	}

	public static void main(String[] args) {
			
	try{
		LinkedListImplementation list = new LinkedListImplementation();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.addAtStart(5);
		list.addAtIndex(25, 2);
		list.show();
		System.out.println("Value is : "+list.get(1));
		list.remove(2);
		System.out.println("After removal : ");
		list.show();
	}catch(Exception e){
		e.printStackTrace();
	}
	
	}
}
class Node{
	int item;
	Node next;
	
	public Node(int item){
		this.item = item;
		this.next = null;
	}
}

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
		return 0;
	}
	
	public void remove(int index){
		
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

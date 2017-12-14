import java.util.*;

class LinkedList{
	Node head;

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next=null;
		}
	}
	public void printList(){
		Node n = head;
		while(n != null){
			System.out.println(n.data+" ");
			n = n.next;
		}
	}

	public void push(int newData){
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public void insertAfter(Node prevNode, int newData){
		if(prevNode == null){
			System.out.println("the given prev node cannot be null");
		}
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next =  newNode;
	}

	public void append(int newData){
		Node newNode = new Node(newData);

		if(head == null){
			head = new Node(newData);
			return;
		}

		newNode.next = null;

		Node last = head;
		while(last.next != null){
			last = last.next;
		}

		last.next = newNode;
		return;

	}

	public void insertAfterValue(int oldValue, int newValue){
		Node newNode = new Node(newValue);

		Node ptr = head;
		
		while(ptr.data != oldValue){
			ptr = ptr.next;
		}
		newNode.next = ptr.next;
		ptr.next = newNode;
		
	}

	public static void main(String [] args){
		LinkedList llist = new LinkedList();

		llist.append(100);
		llist.append(200);
		llist.append(300);
		llist.append(400);

		llist.insertAfterValue(300,350);
		llist.printList();

	}
}
	
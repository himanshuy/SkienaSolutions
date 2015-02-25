package datastructure;

import datastructure.MiddleNode.LinkedList.Node;


public class MiddleNode {

	/**
	 * 1. Take two pointers
	 * 2. Make both pointing to first node
	 * 3. Increment first with two node and second with one, at a time
	 * 4. Loop until 1st loop reaches end. At this point the 2nd pointer will be at the middle 
	 * 
	 */
	
	public static void main(String[] args) {
		
//		  LinkedList linkedList = new LinkedList();
//	      LinkedList.Node head = linkedList.head();
//	      linkedList.add( new LinkedList.Node("1"));
//	      linkedList.add( new LinkedList.Node("2"));
//	      linkedList.add( new LinkedList.Node("3"));
//	      linkedList.add( new LinkedList.Node("4"));
	      
	      //Node middle = findMiddleNode(head);
	      
	      //System.out.println(middle.data);

	}
	
	public static Node findMiddleNode(Node head) {
		
		Node n1 = head;
		Node n2 = head;
		
		while(n2.next != null && n2.next.next!= null) {
	        n1 = n1.next;
	        n2 = n2.next.next;
	    }

		
		return n1;
		
	}
	
	class LinkedList{
	    private Node head;
	    private Node tail;

	    public LinkedList(){
	        this.head = new Node("head");
	        tail = head;
	    }

	    public Node head(){
	        return head;
	    }

	    public void add(Node node){
	        tail.next = node;
	        tail = node;
	    }

	    public class Node{
	        public Node next;
	        public String data;

	        public Node(String data){
	            this.data = data;
	        }

	        public String data() {
	            return data;
	        }

	        public void setData(String data) {
	            this.data = data;
	        }

	        public Node next() {
	            return next;
	        }

	        public void setNext(Node next) {
	            this.next = next;
	        }

	        public String toString(){
	            return this.data;
	        }
	    }
	}

}

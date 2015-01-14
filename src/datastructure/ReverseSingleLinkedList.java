package datastructure;

public class ReverseSingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void reverseList(Node head) {
		Node reversePart = null;
		Node current = head;
		while(current != null){
			Node next = current.next;
			current.next = reversePart;
			reversePart = current;
			current = next;
		}
		head = reversePart;
	}
	
	
	public class Node {
		
		private String data;
		private Node next;
		
		public Node(String data, Node next){
			this.data = data;
			this.next = next;
		}
		
	}

}

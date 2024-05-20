package LinkedList;

public class LinkedList {
	Node head; //Head of the List
	
	void add(int data) {
		Node newNode=new Node(data);
		if (head==null) {
			head=newNode;
		}else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}
	
	public static void main(String[]args) {
		LinkedList a= new LinkedList();
		a.add(5);
	}
}

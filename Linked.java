
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		next=null;
	}
}

public class Linked {
	
 static Node head;
	
 // addding element in linkedlist
	public static Node insert(int data) {
		
		Node new_node=new Node(data);
		if(head==null)
			head=new_node;
		else {
			Node last=head;
			while(last.next!=null)
				last=last.next;
			
			last.next=new_node;
		}
		return head;
	}
	
	// adding element in begning;
	public static Node addbeg(int data) {
		
		Node new_node=new Node(data);
		if(head==null)
			head=new_node;
		else {
			new_node.next=head;
			head=new_node;
		}
		return head;
	}
	//printing
	public static void print() {
		Node h=head;
		while(h!=null) {
			System.out.print(h.data+" ");
			h=h.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		//Linked ls=new Linked();
		head=insert(1);
	//	System.out.println(head.data);
		head=insert(2);
		//System.out.println(head.data);
		head=insert(3);
		//System.out.println(head.data);
		head=insert(4);
		//System.out.println(head.data);
		head=insert(5);
//		System.out.println(head.data);
		
		print();
		System.out.println();
		head=addbeg(15);
		print();
		//print();
	}

}

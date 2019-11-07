
public class LinkedList {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	// add begning in linked list
	public static LinkedList addbegning(LinkedList list, int data) {
		
		Node new_node=new Node(data);
		if(head==null)
			head=new_node;
		else {
			new_node.next=head;
			head=new_node;
		}	
		return list;
	}
	
	
	public static LinkedList insert(LinkedList list, int data) {
		
		Node new_node=new Node(data);
		//new_node.next=null;
		
		if(head==null)
			head=new_node;
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}	
		return list;
	}
	
	public static void print() {
		
		Node h=head;
		while(h!=null) {
			System.out.print(h.data+" ");
			h=h.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,4);
		list=insert(list,5);
		list=insert(list,6);
		list=insert(list,7);
		list=insert(list,8);
		list=insert(list,9);
		list=insert(list,10);
		
		print();
		System.out.println();
		list=addbegning(list,11);
		print();
	}
	
}



public class Reverselist {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	// adding element into linkedlist
	
	public static Reverselist insert(Reverselist list, int data) {
		
		Node new_node=new Node(data);
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
	
	// reverse linkedlist
	public static void reverse() {
		
		Node prev,curr,nxt;
		prev=null;
		curr=head;
		while(curr != null) {
			nxt=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nxt;
		}
		head=prev;
	}
	
	// printing the linkedlist element
	public static void print() {
		Node h=head;
		while(h!=null) {
			System.out.print(h.data+" ");
			h=h.next;
		}
	}
	
	
	public static void  main(String args[]) {
		
		Reverselist list=new Reverselist();
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,4);
		list=insert(list,5);
		list=insert(list,6);
		list=insert(list,7);
		
		print();
		reverse();
		System.out.println();
		print();
		
	}
}

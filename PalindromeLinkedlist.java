import java.util.*;

public class PalindromeLinkedlist {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public static PalindromeLinkedlist insert(PalindromeLinkedlist list, int data) {
		
		Node n=new Node(data);
		
		if(head==null)
			head=n;
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=n;
		}
		return list;
	}
	
	public static boolean checkpalindrome() {
		
		Stack<Integer> st=new Stack<Integer>();
		Node n=head;
		while(n!=null) {
			st.add(n.data);
			n=n.next;
		}
		
		System.out.println(st);
		Node g=head;
		//System.out.println(st.peek());
		while(!st.empty()) {
			if(g.data != st.pop())
				return false;
			g=g.next;
		}
		
		return true;
	}
	
	public static void print() {
		Node h=head;
		while(h!=null) {
			System.out.print(h.data+" ");
			h=h.next;
		}
	}
	
	public static void main(String[] args) {
		
		PalindromeLinkedlist list=new PalindromeLinkedlist();
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,4);
		list=insert(list,5);
		list=insert(list,5);
		list=insert(list,4);
		list=insert(list,3);
		list=insert(list,2);
		list=insert(list,1);
		
		print();
		System.out.println();
		System.out.println(checkpalindrome());
		
	}	
}

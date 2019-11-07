class Nod{
	int data;
	Nod left,right;
	Nod(int data){
		this.data=data;
		left=right=null;
	}
}
public class BinarySearthtree {
	
static Nod root;

	// adding element into binary tree
	public static Nod inserts(Nod root2, int data) {
		
		if(root2==null)
			root2=new Nod(data);
		else if(data < root2.data)
			root2.left=inserts(root2.left,data);
		else
			root2.right=inserts(root2.right,data);
		
		return root2;
	}
	
	// printing preorder of tree
	public static void preorder(Nod root) {
		
		if(root!=null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public static void main(String args[]) {
		
		root=inserts(root,6);
		root=inserts(root,4);
		root=inserts(root,8);
		root=inserts(root,3);
		root=inserts(root,5);
		root=inserts(root,7);
		root=inserts(root,9);
		preorder(root);
		
	}
}

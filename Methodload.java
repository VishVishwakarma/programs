

class A{
	public int  fun(int a, int b) {
		int c=a*b;
		return c;
	}
	
}

class B extends A{
	
}
class C extends B{
	
}
public class Methodload {
	public static void main(String args[]) {
		C c=new C();
		System.out.println(c.fun(4, 5));

	}
}

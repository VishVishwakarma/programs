
public class Sumofdigit {
	
	public static int fun(int n) {
		
		int sum=0;
		if(n==0)
			return 0;
		return sum+n%10+fun(n/10);
	}
	
	public static void main(String args[]) {
		
		int a=12345;
		System.out.print(fun(a));
		
	}
}

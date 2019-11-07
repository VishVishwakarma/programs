import java.util.Scanner;

public class Factorial {
	
	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
		}
	
	public static void main(String[] args) {
		
		int n,result;
		System.out.print("Enter any positive number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		result=fact(n);
		System.out.println("Factorial = "+result);
		
		
	}
}

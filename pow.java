// last two digit of x^y 
import java.util.Scanner;

public class pow {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		int val=x;
		for(int i=1;i<y;i++) {
			val=(val*x)%100;
			//System.out.println(val);
		}
		System.out.println(val);
	}
}

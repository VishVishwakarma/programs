import java.util.Scanner;

public class Unique_value {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of array : ");
		int s;
		s=sc.nextInt();
		int[] arr=new int[s];
		
		for(int i=0;i<s;i++) {
			System.out.print("Enter the value in array : ");
			arr[i]=sc.nextInt();
		}
		int val=arr[0];
		for(int i=1;i<s;i++)
			val=val^arr[i];
		
		System.out.print("Unique value is : "+val);
		
	}
}

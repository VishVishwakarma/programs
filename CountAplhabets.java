import java.util.Scanner;

public class CountAplhabets {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		String str;
		System.out.println("Enter string : ");
		str=sc.next();
		int[] count=new int[26];
		int l=str.length();
		
		for(int i=0;i<l;i++) {
			count[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++)
			System.out.print(count[i]+" ");
		
	}// main closed;
}// class closed;

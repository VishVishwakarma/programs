import java.util.Scanner;

public class Removestr {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str,temp="";
		str=sc.nextLine();
		int len=str.length();
		int arr[]=new int[26];
		
		for(int i=0;i<len;i++) {
			if(arr[str.charAt(i)-'a']==0) {
				temp+=str.charAt(i);
				arr[str.charAt(i)-'a']++;
			}
		}	
		System.out.println(temp);
	}
}

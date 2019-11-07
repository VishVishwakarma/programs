import java.util.Scanner;

public class DuplicateString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		int arr[]=new int[26];
		int lenOfS=s.length();
		for(int i=0;i<lenOfS;i++) 
				arr[s.charAt(i)-'a']++;
		
			
		String str="";
		
		String st="";
		char t='a';
		
		for(int i=0;i<26;i++) {
			if(arr[i]==1)
				st+=t;
			t++;
		}
		
		for(int i=0;i<lenOfS;i++) {
			if(arr[s.charAt(i)-'a']==1)
				str+=s.charAt(i);
		}
			System.out.println(str);
			System.out.println(st);
	}
}

import java.io.*;
import java.util.Arrays;

public class Sorting {
	
	public static void fun(int val, char c) {
		
		for(int i=0;i<val;i++)
			System.out.print(c);
	}
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		s=br.readLine();
		
		int a[]=new int[26];
		Arrays.fill(a, 0);
		
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)-'a']++;
		}
		char c='a';
		
		for(int i=0;i<26;i++) {
			if(a[i]!=0) {
				fun(a[i],c);
			}
			c++;
		}
	}
}

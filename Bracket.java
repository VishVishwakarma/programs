import java.util.*;
import java.io.*;

public class Bracket {
	public static void main(String args[]) {
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="(())()()(";
		Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(')
				st.push(s.charAt(i));
			else{
				if(st.empty()) {
					System.out.println("Not Balanced");
					return;
				}else {
					st.pop();
				}
			}
		}
		if(st.empty())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}

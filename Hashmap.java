import java.util.*;
import java.io.*;

public class Hashmap {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		s=br.readLine();
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(hs.containsKey(s.charAt(i)))
				hs.put(s.charAt(i), hs.get(s.charAt(i))+1);
			else
				hs.put(s.charAt(i), 1);
		}
		System.out.print(hs);
		
	}
}

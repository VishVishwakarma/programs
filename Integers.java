import java.io.*;

public class Integers {
	public static void main(String[] args)  {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s=br.readLine();
			int a=Integer.parseInt(s);
			System.out.println("given string is integer");
		}catch(Exception e) {
			System.out.println("given string is not integer");
			
		}
		
		
			
	}
}

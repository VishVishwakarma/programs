import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subsets {
	
	public static void String_Subsets(char[] arr) {
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
		String s;
		s=br.readLine();
		
		String_Subsets(s.toCharArray());
	}
}



public class StringSort {
	public static void main(String args[]) {
	
		String s="My name is JVM I am Machine Independent";
		String[] arr=s.split(" ");
		System.out.println(arr.length);
		
		String st="Hello";
		
		char ar[]=st.toCharArray();
		System.out.println(ar+" ");
		
		for(int i=0;i<arr.length;i++) {
		
			char[] a=arr[i].toCharArray();
			System.out.print(a+" ");
			//Arrays.sort(a);
			System.out.print(a+" ");
		}
	}	
}


public class FloatCompare {
	
	public static boolean fun(String s, String t) {
		int i=0;
		while(s.charAt(i)!='.') {
			
		}
		
		
		return true;
	}
	public static void main(String args[]) {
		
		float f1=12.230f;
		float f2=12.231f;
		f1=f1*100;
		f2=f2*100;
		String s1=String.valueOf(f1);
		String s2=String.valueOf(f2);
		System.out.println(f1+" "+f2);
		
		System.out.println(fun(s1,s2));
		
	}
}

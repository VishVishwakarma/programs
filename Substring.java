
public class Substring {
	
	public static void funsubst(String s, int l) {
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<=l;j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}

	public static void subst(String s, int l) {
		
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<=l;j++) {
				for(int k=i;k<j;k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s="abc";
		int l=s.length();
		funsubst(s,l);
		subst(s,l);
	}

}

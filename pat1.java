/* 
Pattern
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 

 */
public class pat1 {
	public static void main(String[] args) {
	
		
			
			for(int j=0;j<4;j++) {
				for(int k=0;k<=j;k++) {
					System.out.print("* ");
				}
				System.out.println();	
			}
			
			for(int j=0;j<3;j++) {
				for(int k=3;k>j;k--) {
					System.out.print("* ");
				}
				System.out.println();
			}
		
		
	}// main closed
} // class closed

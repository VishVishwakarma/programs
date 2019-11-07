import java.util.HashMap;
import java.util.Iterator;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="string are object and string are immut";
		String[] st=s.split(" ");
		
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		
		for(int i=0;i<st.length;i++) {
			if(hs.containsKey(st[i])) {
				
				hs.put(st[i], hs.get(st[i])+1);
			}else {
				hs.put(st[i], 1);
			}
		}
		
		//Iterator it=hs.iterator();
		
		System.out.println(hs);
		
	}
}

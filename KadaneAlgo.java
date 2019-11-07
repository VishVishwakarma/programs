
public class KadaneAlgo {

	public static int fun(int a[]) {
		
		int max_current=a[0];
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			max_current=Math.max(a[i], max_current+a[i]);
			if(max_current > max)
				max=max_current;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={3,-5,2,3,-1};
		//for(int i=0;i<a.length;i++)
			//System.out.print(a[i]+" ");
		System.out.println("Maximum sum of subarray "+fun(a));
	}
}

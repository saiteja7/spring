import java.util.HashSet;

public class FindIntegerMultiple {

	public static void main(String[] args) {
		int[] a ={16, 17, 4, 3, 5, 2};
		//findNumber(a, 20);
		hashSet(a, 51);
		

	}
	
	public static boolean findNumber(int [] a,int n) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if(a[i]*a[j]==n) {
					System.out.println(a[i] + " " + a[j]);
				}
				
			}
		}
		return true;
	}
	public static boolean hashSet(int [] a,int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			if(set.contains(n/a[i])) {
				System.out.println(n/a[i] + " , " + a[i]);
				break;
			}
		}
		
		return true;
	}

}

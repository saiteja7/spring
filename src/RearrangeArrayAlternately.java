import java.util.ArrayList;

public class RearrangeArrayAlternately {
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 ,5,6,7,8,9};
		
		//System.out.println(arrayAlterate(a));
		int[] b =arrayAlterate(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
		
	}
	
	public static int[] arrayAlterate(int[] a) {
		int size=0;
		if(a.length%2==0) {
			size=a.length;
		}else {
			size=a.length+1;
		}
		int[] b = new int[size];
		int pos= 0;
		int n = a.length-1;
		for ( int i = 0 ;i<=n/2; i++) {
			
				b[pos++]=a[n-i];
				b[pos++]=a[i];
			
		}
		return b;
		
	}

}

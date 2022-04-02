import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	static int a = 100;

	public static void main(String[] args) {
		Test t = new Test();
		t.a++;
		Test t1 = new Test();
		t1.a++;
		String s = "name";
		String t11 = "name";
		String s1 = new String ("name");
		System.out.println(s==s1);
		System.out.println(s==t11);
		System.out.println(s.equals(s1));
		//System.out.println(a);
		//t.test();
		int a[] = {10,3,6,8,9,4,3};
		int n = a.length;
		int max = t.maxIndexDiff(a,n);
		//System.out.println(max);
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(null, "sai");
		map.put(null, "Teja");
		map.put(1, "hello");
		 for (Integer name : map.keySet())  
	            System.out.println("key: " + name + map.get(name));
		
		 for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }

			
		
	}
	public void test() {
		System.out.println("hello");
		int largestDiff = 0;
		int diff =0;
		int a[] = {10,3,6,8,9,4,3};
		for (int i  = 0;i<a.length-1;i++) {
			for (int j  = 0;j< a.length-1;j++) {
				while(i<j) {
					
				diff = a[j]-a[i];
				if(diff>largestDiff) {
					largestDiff = diff;
					System.out.println("the diff is"+ largestDiff);
				}
				}
			}
			
		}
		
		System.out.println(largestDiff + "gu");
	}
	
		int maxIndexDiff(int a[],int n)  
	    { 
			
	        int maxDiff = -1; 
	        int i, j; 
	  
	        for (i = 0; i < n; ++i)  
	        { 
	            for (j = n - 1; j > i; --j)  
	            { 
	                if (a[j] > a[i] && maxDiff < (j - i)) 
	                    maxDiff = j - i; 
	            } 
	        } 
	
	        return maxDiff; 
	     
	}
}

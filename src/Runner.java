import java.util.regex.Pattern;

public class Runner {
	 static final int MAX_CHAR = 256; 
	public static void main(String[] args) {
		Runner r = new Runner();
//		r.reverseString();
//		System.out.println(r.stringPalindrome());
//		r.printDuplicates();
		//r.getOccuringChar();
	//	r.equiIndex();
		//System.out.println(r.equiIndex());
		
		//System.out.println(r.reverseWords("i love java"));
		r.ownreverseWords("i love java");
	}

	public void reverseString() {
		String name = "saiteja";

		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			System.out.println(ch);
		}
	}

	public String stringPalindrome() {
		String name = "mam";
		int i = 0, j = name.length() - 1;
		while (i < j) {
			if (name.charAt(i) != name.charAt(j)) {
				return "Not palindrome";
			}
			i++;
			j--;
		}
		return "Palindrome";
	}

	public void printDuplicates() {
		String str = new String("Sakkett");
		int count = 0;
		char[] chars = str.toCharArray();
		System.out.println("Duplicate characters are:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (chars[i] == chars[j]) {
					System.out.println(chars[j]);
					count++;
					break;
				}
			}
			System.out.println("The Character" + chars[i] + " is present ");
		}
	}
	 static void getOccuringChar() 
	    { 
		 String str = "geekforgeeks";
	        // Create an array of size 256 i.e. ASCII_SIZE 
	        int count[] = new int[MAX_CHAR]; 
	  
	        int len = str.length(); 
	  
	        // Initialize count array index 
	        for (int i = 0; i < len; i++) 
	            count[str.charAt(i)]++; 
	  
	        // Create an array of given String size 
	        char ch[] = new char[str.length()]; 
	        for (int i = 0; i < len; i++) { 
	            ch[i] = str.charAt(i); 
	            int find = 0; 
	            for (int j = 0; j <= i; j++) { 
	  
	                // If any matches found 
	                if (str.charAt(i) == ch[j])  
	                    find++;                 
	            } 
	  
	            if (find == 1)  
	                System.out.println("Number of Occurrence of " + 
	                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
	        } 
	       
	    }
	  static String reverseWords(String str) 
	    { 
	  
	        // Specifying the pattern to be searched 
	        Pattern pattern = Pattern.compile("\\s"); 
	  
	        // splitting String str with a pattern 
	        // (i.e )splitting the string whenever their 
	        //  is whitespace and store in temp array. 
	        String[] temp = pattern.split(str); 
	        String result = ""; 
	  
	        // Iterate over the temp array and store 
	        // the string in reverse order. 
	        for (int i = 0; i < temp.length; i++) { 
	            if (i == temp.length - 1) 
	                result = temp[i] + result; 
	            else
	                result = " " + temp[i] + result; 
	        } 
	        return result; 
	    } 
	  
	  public int equiIndex() {
		  int i, j; 
	        int leftsum, rightsum; 
		  int a[] = {-7, 1, 5, 2, -4, 3, 0};
		  for ( i =0;i<a.length;i++) {
			  leftsum = 0;
			  for(j=0;j<i;j++) {
				  leftsum+=a[j];
			  }
			  rightsum = 0;
			  for(j=i+1;j<a.length;j++) {
				  rightsum+=a[j];
			  }
			  if(leftsum==rightsum) {
return i;
			  }
		  }
		  
		  return -1;
	  
	  
}
	  static void ownreverseWords(String str) 
	    { 
	  
	        // Specifying the pattern to be searched 
	        Pattern pattern = Pattern.compile("\\s"); 
	  
	        // splitting String str with a pattern 
	        // (i.e )splitting the string whenever their 
	        //  is whitespace and store in temp array. 
	        String[] temp = pattern.split(str); 
	        String result = ""; 
	  
	        // Iterate over the temp array and store 
	        // the string in reverse order. 
	        for (int i = temp.length-1; i >=0; i--) { 
	            System.out.print(temp[i] + " ");
	        } 
	        
	    } 
	  
	  }

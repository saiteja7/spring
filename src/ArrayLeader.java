import java.util.ArrayList;

public class ArrayLeader {

	public static void main(String[] args) {
	int[] a ={16, 17, 4, 3, 5, 2};
	leaders(a);

	}
	
	public static ArrayList leaders(int[] arr) {
		int size =arr.length;
		for (int i = 0; i < size; i++)  
        { 
            int j; 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] <= arr[j]) 
                    break; 
            } 
            if (j == size) // the loop didn't break 
                System.out.println(arr[i] + " "); 
        } 
		return null;
		
	}

}

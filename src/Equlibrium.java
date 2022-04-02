
public class Equlibrium {

	public static void main(String[] args) {
		int a[] = {1 ,3, 5, 2, 2};
		System.out.println(Equilibrium(a));
		

	}
public static int Equilibrium(int a[]) {
	int leftsum =0 ,rightsum = 0;
	for (int pos = 0; pos < a.length; pos++) {
		leftsum=0;
		for (int i = 0; i < pos; i++) {
			leftsum += a[i];
		}
		rightsum=0;
		for (int j = pos+1; j < a.length; j++) {
			rightsum+=a[j];
		}
		if(leftsum==rightsum) {
			return pos;
		}
	}
	
	
	return -1;
}
}

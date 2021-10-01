//java code : optimized code of bubble sort
//hacktoberfest2021

package arrays;

public class BubbleSortopt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 1, 8, -3, 6, 4, 12};
		int n = a.length;
		int temp;
		for(int i = 0; i < n-1; i++) {
			boolean sorted = true;
			for(int j = 0; j < n-1-i; j++) {
				if(a[j+1] < a[j]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					sorted = false;
				}				
			}
			if(sorted) break;
		}
		for(int item : a) {
			System.out.print(item + "  ");
		}
	}

}

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int []a = {1, 2,4,7, 3, 6, 0};
		bubleSort(a);
		System.out.println(Arrays.toString(a));

	}
	public static int[] bubleSort(int[] list) {
		boolean swapped =true;
		while(swapped) {
			swapped =false;
			for (int i=0; i<list.length-1; i++) {
				if (list[i+1]<list[i]) {
					int temp =list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					swapped =true;
					
				}
				
			}
		}
		return list;
		
		
	}

}

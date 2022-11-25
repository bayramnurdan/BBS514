import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int []a = {1, 2,4,7, 3, 6, 0};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static int[] insertionSort(int[] list) {
		for (int i=1; i<list.length; i++) {
			int keyIndex = i;
			
			for (int j= i-1; j>=0; j--) {
				if (list[keyIndex]<list[j]) { //swap
					
					int temp =list[j];
					list[j] = list[keyIndex];
					list[keyIndex] = temp;
					keyIndex --;
							
					
				}
			}
			
		}
		return list;
		
		
	}

}

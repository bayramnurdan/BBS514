import java.util.Arrays;

public class SelectionSort {
	public static void main(String [] args) {
		int []a = {1, 2,4,7, 3, 6, 0};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
		
	
			
		}
	public static int [] selectionSort(int[] list) {
		
		
		
		for (int i =0; i<list.length-1; i++ ) {
			int minIndex =i;
			int min =list[i];
			
			for (int j = i+1; j<list.length; j++ ) {
				
				if (list[j]<min) {  //we need to swap now
					min = list[j];  
					minIndex =j;
					
					int temp = list[i];
					list[i] = min;
					list[j] = temp;	
				}
				
				
				
			}
			
		
		}
		return list;
		
		
	}

}

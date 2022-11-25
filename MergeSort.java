import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int []a = {1000, 9, 1, 2,4,7, 3, 6, 0};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
		
	}
		

	
	
	public static void mergeSort(int[] list) {
		if (list.length <2) {
			return;
		}else {
			int middleIndex = (list.length/2);
			int[] leftHalf = new int[middleIndex];
			int[] rightHalf = new int[list.length-middleIndex];
			
			for (int i=0; i<middleIndex; i++) {
				leftHalf[i] = list[i];
			}
			for (int j=middleIndex;j<list.length; j++ ) {
				rightHalf[j-middleIndex] = list[j];
			}
			mergeSort(leftHalf);
			mergeSort(rightHalf);
			merge(list, leftHalf, rightHalf);
				
			}
			
	}
	public static void merge(int[]inputArray, int[] leftHalf, int[] rightHalf ) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		int l=0;
		int r=0; 
		int k=0;
		
		while(l<leftSize && r<rightSize) {
			if (leftHalf[l]<= rightHalf[r]) {
				inputArray[k] = leftHalf[l];
				l++;
				
			}else {
				inputArray[k] = rightHalf[r];
				r++;	
			}
			k ++;
		}
		
		while (l<leftSize) {
			inputArray[k] = leftHalf[l];
			l++;
			k++;
			
		}
		
		while (r<rightSize) {
			inputArray[k] = rightHalf[r];
			r++;
			k++;
			
		}
		
		
	}

}

	


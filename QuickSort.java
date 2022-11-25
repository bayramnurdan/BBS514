import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int []a = {1000, 9, 1, 2,4,7, 3, 6, 0};
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));

	}
	public static void quickSort(int[] input, int lowIndex, int highIndex) {
		
		if (lowIndex>=highIndex) {   //base case
			return;
		}
		
		int pivot = input[highIndex];  //choose pivot
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer<rightPointer) {
			while(input[leftPointer] <= pivot && leftPointer<rightPointer) {
				leftPointer ++;

			}
			
			while(input[rightPointer] >= pivot && leftPointer<rightPointer) {
				rightPointer --;	
			}
			swap(input, leftPointer, rightPointer);
			
			
		}
		swap (input, leftPointer, highIndex);
		quickSort(input, lowIndex, leftPointer-1);
		quickSort(input, leftPointer+1, highIndex);
		
		
		
	}
	public static void swap(int[] input, int index1, int index2) {
		int temp = input[index2];
		input[index2] = input[index1];
		input[index1] = temp;
	}

}

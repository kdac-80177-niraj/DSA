import java.util.*;
public class insertionSort {

	public static void insertionSorting(int arr[]) {
		int count = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
				count++;
			}
			arr[j+1] = temp;
		}
		System.out.println("Number of comparisons required: "+count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {55, 44, 22, 66, 11, 33};
		int arr[] = {1,2,3,4,5};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSorting(arr);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}

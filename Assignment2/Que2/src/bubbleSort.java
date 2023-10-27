import java.util.*;
public class bubbleSort {

	public static int bubbleSort(int []arr) {
		int count = 0 ;
		for(int i = 1; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length-1 ; j++) {
				count++;
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int arr[] = {33, 22, 66, 55, 44, 11};
				System.out.println("Array before sort : " + Arrays.toString(arr));
				int comp = bubbleSort(arr);
				System.out.println("Array after sort : " + Arrays.toString(arr));
				System.out.println("Comparisons required: "+comp);
	}

}

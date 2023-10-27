import java.util.*;
public class selectionSortQue1 {
	
	
		public static int selectionSort(int arr[]) {
			int count = 0;
			for(int i = 0 ; i < arr.length -1 ; i++) {
				for(int j = i+1 ; j < arr.length ; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						count ++;
					}
				}
			}
			return count;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {44, 11, 55, 22, 66, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		int comp = selectionSort(arr);
		System.out.println("Array after sort : " + Arrays.toString(arr));
		System.out.println("Number of comparisons required: "+comp);

	}

}

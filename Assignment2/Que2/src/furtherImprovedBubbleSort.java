import java.util.*;
public class furtherImprovedBubbleSort {

	public static void furtherImprovedBubbleSorting(int arr[]) {
		int count = 0;
		int pass = 0;
		int flag;
		for(int i = 1 ; i < arr.length ; i++) {
			pass++;
			flag = 0;
			for(int j = 0 ; j < arr.length-i ; j++) {
				count++;
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		System.out.println("No. of passes: "+pass);
		System.out.println("No. of comparisons: "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {33, 22, 66, 55, 44, 11};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		furtherImprovedBubbleSorting(arr);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}

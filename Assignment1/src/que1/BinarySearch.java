package que1;

import java.util.Scanner;

public class BinarySearch {
	public static boolean binarySearch(int arr[],int key) {
		int count = 0;
		int left = 0;
		int mid;
		int right = arr.length-1;
		while(left<=right) {
			count++;
			mid = (left+right)/2;
			if(key == arr[mid]) {
				System.out.println("Element found at index: "+mid);
				System.out.println("total comparisons required: "+count);
				return true;
			}
			
			else if(key<arr[mid]) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,7,8,9,10,11};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to search: ");
		int key = sc.nextInt();
		if(!binarySearch(arr, key))
			System.out.println("Key not found");
	}

}

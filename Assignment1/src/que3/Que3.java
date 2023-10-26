package que3;
import java.util.*;
public class Que3 {
	public static int binaryReverse(int arr[],int key) {
		int left = 0,right = arr.length-1,mid;
		while(left <= right) {
			mid = (left+right)/2;
			if(key == arr[mid]) {
				System.out.println("key found at index: "+mid);
				return 0;
			}
			if(key<arr[mid]) {
				left = mid+1;
			}
			else
				right = mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {9,8,7,6,5,4,3,2,1};
		System.out.println("Enter key to search: ");
		int key = sc.nextInt();
		if(binaryReverse(arr,key) == -1)
			System.out.println("Element not found");
	}

}

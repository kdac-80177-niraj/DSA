package que1;
import java.util.*;
public class LinearSearch {

	public static int linearSearch(int arr[],int key) {
		int count=0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(key == arr[i])
				System.out.println("key found at index: "+i);
			else
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to search: ");
		int key = sc.nextInt();
		int countCompare = linearSearch(arr,key);
		System.out.println("Total comparisons required: "+countCompare);
	}

}

package que4;
import java.util.*;
public class Que4 {

	public static int nthOccurence(int arr[],int key) {
		int index = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == key) {
				index = i;
			}
		}
		if(index == 0) {
			return -1;
		}else return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,1,4,1,5,6,7,8,1};
		System.out.println("Enter key to search: ");
		int key = sc.nextInt();
		if(nthOccurence(arr,key) != -1) {
			int index = nthOccurence(arr,key);
			System.out.println("Element found at index: "+index);
		}else {
			System.out.println("Element not found\n -1");
		}
	}

}

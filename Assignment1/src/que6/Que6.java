package que6;
import java.util.*;
public class Que6 {
	public static void rankElement(int arr[],int key) {
		int count = 0;
		int index = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == key) {
				index = i;
				break;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]<=key)
				count++;
		}
		System.out.println("Rank of key is: "+ index +" and total no. of ele's less than or equals to x(including x) is: "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter key: ");
		int key = sc.nextInt();
		rankElement(arr,key);
	}

}

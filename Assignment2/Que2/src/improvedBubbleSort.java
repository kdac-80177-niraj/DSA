import java.util.Arrays;

public class improvedBubbleSort{

	public static void improvedBubbleSorting(int arr[]) {
		int count = 0;
		int passes = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			passes++;
			for(int j = 0 ; j < arr.length-1 ; j++) {
				count++;
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		System.out.println("Counts Required: "+count);
		System.out.println("Passes requred: "+passes);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {33, 22, 66, 55, 44, 11};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		improvedBubbleSorting(arr);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}

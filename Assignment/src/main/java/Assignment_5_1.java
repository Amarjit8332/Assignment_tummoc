import java.util.Arrays;

public class Assignment_5_1 {

	public static int Search(char[] arr, char target) {
		
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1; 
		}
		public static void main(String[] args) {
		String input = "0125689";
		char target = '6';
		char[] sorted = input.toCharArray();
		Arrays.sort(sorted); 
		int result = Search(sorted, target);
		System.out.println("Index of " + target + " is at : " + result+"using Binary search");
		}
		
}

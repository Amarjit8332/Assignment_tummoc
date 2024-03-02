
public class Assignment_5 {

	public static int Search(char[] arr, char target) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		} return -1; 	
	}	
	public static void main(String[] args) {
		String input = "9805621";
		char target = '6';
		int result = Search(input.toCharArray(), target);
		System.out.println("Index of " + target + " is at : " + result+"   using Linear search");
		}
		
}

import java.util.Arrays;

public class Assignment_4 {

	public static String Sentence(String sentence) {
		
		String[] word = sentence.split("\\s+");
		Arrays.sort(word, (a, b) -> Integer.compare(b.length(), a.length()));
		return String.join(" ", word);
	}
		public static void main(String[] args) {
			
			String input = "readable content of a page when looking at its layout";
			System.out.println("Input: " + input);
			System.out.println("Output: " + Sentence(input));
		}
		
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class assignment1_1 {
	public static String sortStringByOccurrences(String str) {
		// Count occurrences of each character
		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : str.toCharArray()) {
		charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		// Sort characters by their occurrences
		List<Map.Entry<Character, Integer>> sortedList = new
		ArrayList<>(charCount.entrySet());
		sortedList.sort((entry1, entry2) ->
		entry2.getValue().compareTo(entry1.getValue()));
		// Build sorted string
		StringBuilder sortedString = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : sortedList) {
		char c = entry.getKey();
		int count = entry.getValue();
		for (int i = 0; i < count; i++) {
		sortedString.append(c);
		}
		}
		return sortedString.toString();
		}
		public static void main(String[] args) {
		String input = "qrssaqqzibbssraib";
		System.out.println("Original string: " + input);
		System.out.println("Sorted string by occurrences: " +
		sortStringByOccurrences(input));
		}
		

}

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Assignment1 {

    public static void main(String[] args) {
        String input = "qrssaqqzibbssraib";
        System.out.println("Input: " + input);
        System.out.println("Output: " + Occurrences(input));
    }

    public static String Occurrences(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> sortedChar = charCount.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        StringBuilder sortedString = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedChar.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                sortedString.append(entry.getKey());
            }
        }

       
        StringBuilder finalSortedString = new StringBuilder();
        for (char c : sortedString.toString().toCharArray()) {
            if (!Character.isWhitespace(c) && finalSortedString.indexOf("" + c) < 0) {
                finalSortedString.append(c);
            }
        }


        return finalSortedString.toString();
    }
}
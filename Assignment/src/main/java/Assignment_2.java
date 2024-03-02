import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_2 {
	public static void fairprize(String[][] input) {
		Map<Integer, List<String>> fareroute = new HashMap<>();
		// Populate fareRouteMap
		for (String[] entry : input) {
		String route = entry[0];
		int fare = Integer.parseInt(entry[1]);
		fareroute.putIfAbsent(fare, new ArrayList<>());
		fareroute.get(fare).add(route);
		}
		// Print the result
		System.out.println("Fare Route");
		for (Map.Entry<Integer, List<String>> entry : fareroute.entrySet()) {
		int fare = entry.getKey();
		List<String> routes = entry.getValue();
		System.out.println(fare + " " + routes);
		}
		}
		public static void main(String args[])
		{
		String[][] input = {
		{"13", "10"},
		{"13-C", "15"},
		{"342-R", "10"},
		{"146-Q", "10"},
		{"27", "15"},
		{"29-A", "12"},
		{"215-U", "12"},
		{"27-E1", "15"},
		{"13J", "12"},
		{"SBS-D34G", "10"}
		};
		fairprize(input);
		}
		

}

import java.util.HashMap;

public class hashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("Faizan", 210);
		points.put("Labeeb", 205);
		points.put("Qadees", 250);
		if (points.get(args[0]) != null)
			System.out.println(args[0] + "'s points are = " + points.get(args[0]));

		else
			System.out.println("No data found for '" + args[0] + "'");
	}
}

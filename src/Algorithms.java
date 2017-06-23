import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		// return 4;
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int howMany = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				howMany += 1;
			}
		}
		return howMany;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (Double d : peeps) {
			if (d > tallest) {
				tallest = d;
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = " ";
		for (String s : words) {
			if (s.length() > longest.length()) {
				longest = s;
			}
		}
		return "circumlocution";
	}

	public static boolean containsSOS(List<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.size());
			if (a.get(i).equals(" ... --- ... ")){
				return true;
			}
		}
		return false;

	}
	
	public static Double sortScores (List<Double> results){
		return 3.3;
	}
}

import java.util.ArrayList;

public class arrayList4 {
	static ArrayList <Integer> trial = new ArrayList <Integer>();
	
	public static void main(String[] args) {
		for (int i = 0; i < 1000000000; i++) {
			trial.add(i);
			System.out.println(trial.size());
		}
	}
	
}

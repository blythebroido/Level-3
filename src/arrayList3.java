import java.util.ArrayList;
import java.util.Random;

public class arrayList3 {
	static ArrayList <String> adj = new ArrayList <String> ();
	static ArrayList <String> noun = new ArrayList <String> ();
	
	public static void main(String[] args) {
		adj.add("rad");
		adj.add("sad");
		adj.add("mad");
		
		noun.add("clad");
		noun.add("chad");
		noun.add("triad");
		
		Random arand = new Random();
		int a = arand.nextInt(3);
		
		if(a == 0){
			System.out.println(adj.get(0));
		}
		if(a == 1){
			System.out.println(adj.get(2));
		}
		if(a ==2){
			System.out.println(adj.get(1));
		}
		
		Random nrand = new Random();
		int n = nrand.nextInt(3);
		
		if(n == 0){
			System.out.println(noun.get(1));
		}
		if(n == 1){
			System.out.println(noun.get(0));
		}
		if(n ==2){
			System.out.println(noun.get(2));
		}
	}
}

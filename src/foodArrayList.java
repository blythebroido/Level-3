import java.util.ArrayList;
import java.util.Random;

public class foodArrayList {
	
	static ArrayList<String> dinner = new ArrayList<String>();

	public static void main(String[] args) {
		dinner.add("pizza");
		dinner.add("potatoes");
		dinner.add("salad");

		Random a = new Random();
		int b = a.nextInt(3);
		if(b==0){
			System.out.println(dinner.get(0));
		}
		if(b==1){
			System.out.println(dinner.get(1));
		}
		if(b==2){
			System.out.println(dinner.get(2));
		}

	}
}

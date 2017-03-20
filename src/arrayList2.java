import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class arrayList2 {
	static ArrayList <String> jokes = new ArrayList <String>();
	static ArrayList <String> punchlines = new ArrayList <String>();
	
	public static void main(String[] args) {
		jokes.add("Why did the dolphin cross the bay?");
		jokes.add("What does a seagull use to call his friends?");
		punchlines.add("To get to the other tide!");
		punchlines.add("A shell-phone!");
		
		Random rand = new Random();
		int a = rand.nextInt(2);
		
		if(a==0){
			JOptionPane.showMessageDialog(null, jokes.get(0));
			JOptionPane.showMessageDialog(null, punchlines.get(0));
		}
		if(a==1){
			JOptionPane.showMessageDialog(null, jokes.get(1));
			JOptionPane.showMessageDialog(null, punchlines.get(1));
		}
	}
}

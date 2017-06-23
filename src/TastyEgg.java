import javax.swing.JOptionPane;

public class TastyEgg {
	public static void main(String[] args) {
		KinderSurprise myKinderSurprise = new KinderSurprise(new Egg(new Toy()));
		Toy toy = myKinderSurprise.getKinderSurpriseContents().getEggContents();
		System.out.println(toy);
		
		// Your mission: Find out what toy is inside your KinderSurprise.
		
	}
}
import java.util.Random;
 
class KinderSurprise {
	private Egg egg;
 
	public KinderSurprise(Egg egg) {
		this.egg = egg;
	}
 
	Egg getKinderSurpriseContents() {
		return egg;
		// ADD CODE HERE
	}
}
 
class Egg {
 
	private Toy toy;
 
	public Egg(Toy toy) {
		this.toy = toy;
	}
 
	Toy getEggContents() {
		return toy;
		// ADD CODE HERE
	}
	
	public String toString(){
		return toy.getToyName();
	}
 
}
 
class Toy {
	String getToyName() {
		int randomToySelector = new Random().nextInt(3);
		if (randomToySelector == 0)
			return "play doh";
		else if (randomToySelector == 1)
			return "train";
		else
			return "spongebob";
	}
	
	public String toString(){
		return getToyName();
	}
 
}
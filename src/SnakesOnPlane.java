import java.util.ArrayList;
import java.util.Random;

public class SnakesOnPlane {
	public static void main(String[] args) {
		SnakesOnPlane snakesonplane = new SnakesOnPlane();
		snakesonplane.go();
	}

	private void go() {
		Plane plane = new Plane(100);
		System.out.println(plane.probOfDeath());
	}

	public static class Randomness {
		public static boolean trueOrFalse() {
			int random;
			Random rand = new Random();
			random = rand.nextInt(1);
			if (random == 0) {
				return true;
			} else {
				return false;
			}
		}

		public static int number() {
			int random;
			Random rand = new Random();
			random = rand.nextInt((9) + 1);
			return random;
		}
	}

	public class Snake {
		int viciousness;
		boolean venomous;

		Snake(int viciousness, boolean venomous) {
			this.viciousness = viciousness;
			this.venomous = venomous;
		}

		public int getViciousness() {
			return viciousness;
		}

		public boolean getVenomous() {
			return venomous;
		}
	}

	public class Plane {
		int numberOfPassengers;
		ArrayList<Snake> snakes = new ArrayList<Snake>();
		Plane(int numberofPassengers){
			for (int i = 0; i < 100; i++) {
				snakes.add(new Snake(Randomness.number(), Randomness.trueOrFalse()));
			}
			this.numberOfPassengers = numberofPassengers;
		}
		
		public int totalVenom(){
			int totalVenom = 0;
			for(Snake a: snakes){
				if(a.getVenomous()){
					totalVenom += a.getViciousness();
				}
			}
			return totalVenom;
		}
		
		public int probOfDeath(){
			int totalVenom = totalVenom();
			int a = totalVenom*10;
			int b = a/numberOfPassengers;
			return b;
		}
		
	}
}

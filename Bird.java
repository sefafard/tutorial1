public class Bird extends Animal {

		public Bird(String animalType, int numberOfLegs, String eyeColor){
			super (animalType, numberOfLegs, eyeColor);			
		}

		String birdType;
		int weightInOunces;
		String beakColor;

		{
		birdType = animalType;
		weightInOunces = numberOfLegs;
		beakColor = eyeColor;
    	}
		
		public void speak() { 
			System.out.println ("Squawk, I am a bird type known as a(n) " + birdType + ".");
			System.out.println ("I weigh " + weightInOunces + " oz.");			
			System.out.println ("My beak is " + beakColor+ ".");
		}
		
		public void eat() {
			System.out.println ("I am eating like a bird...");
		}

		public void sleep() {
			System.out.println ("I am sleeping (most likely on one leg...)");
		}
		
		public void move() {
			System.out.println("Flapping wings...");
		}
}
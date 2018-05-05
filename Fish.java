public class Fish extends Animal{

		public Fish(String animalType, int numberOfLegs, String eyeColor){
			super ( animalType, numberOfLegs, eyeColor);			
		}
		
		public void speak() {
			System.out.println ("I am a fish known as a(n) " + animalType + ".");
			System.out.println ("I weigh " + numberOfLegs+ " oz.");		
			System.out.println ("I live in " + eyeColor+ " water.");
		}
		
		public void eat() {
			System.out.println ("I am eating...");
		}
		
		public void sleep() {
			System.out.println ("I am trying to sleep...");
		}
		
		public void move() {
			System.out.println("The fish is swimming...");
		}
}
public abstract class Animal {
		String animalType;
		int numberOfLegs; //zero is an acceptable number of legs
		String eyeColor;

		public Animal(String animalType, int numberOfLegs, String eyeColor){
			this.animalType = animalType;
			this.numberOfLegs= numberOfLegs;
			this.eyeColor = eyeColor;
		}
		
		public void speak() {
			System.out.println ("Hello, I am a " + animalType + ".");
			System.out.println ("I have " + numberOfLegs+ " legs.");			
			System.out.println ("My eyes are " + eyeColor+ ".");
		}
		
		public void eat() {
			System.out.println ("I am eating...");
		}
		
		public void sleep() {
			System.out.println ("I am falling to sleep in animal slumberland...");
		}
		
		public abstract void move();

}
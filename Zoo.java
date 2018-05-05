public class Zoo {

	// constructor
	public Zoo() {
	
	}
	
	// set some variables

		Fish fish1 = new Fish("bass", 58, "salt");
		
		Reptile reptile1 = new Reptile(4, 14, "Yes");
		Chicken chick1 = new Chicken("Chicken", 32, "orange");
		Sparrow sparrow1 = new Sparrow("Sparrow", 44, "black");

		Insect insect1 = new Insect (8, "YES");
		
		// the Animal class is now abstract so a generic animal can't be created
		// Animal animal1 = new Animal ("cow", 4, "brown");
		// Animal animal2 = new Animal ("monkey", 2, "black");

		Bird bird1 = new Bird ("robin", 13, "yellow");
			
	// Methods start here

		public void advertise () {
			System.out.println ("HEY EVERYONE!  COME TO THE ZOO!  WE HAVE:");
			System.out.println (" ");
			fish1.speak();
			fish1.sleep();
			System.out.println (" ");
			bird1.speak();
			bird1.sleep();
			System.out.println (" ");
			insect1.crawl();
			System.out.println (" ");
			reptile1.hiss();
			System.out.println (" ");
			chick1.speak();
			chick1.sleep();
			chick1.fly();
			chick1.move();
			System.out.println (" ");
			sparrow1.speak();
			sparrow1.sleep();
			sparrow1.fly();
			sparrow1.move();
			System.out.println (" ");
			System.out.println ("THANK YOU FOR CONSIDERING THE ZOO!");
			System.out.println (" ");
	}

}
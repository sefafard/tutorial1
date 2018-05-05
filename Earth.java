public class Earth {

	public static void main(String[] args){
	
	Human tom;
	tom = new Human("Tom Fafard", 54, 60, "blue");
	Human steve;
	steve = new Human("Steve Fafard", 58, 72, "blue");
	Zoo zoo;
	zoo = new Zoo();

	System.out.println ("HELLO AND WELCOME TO EARTH.  i'D LIKE TO INTRODUCE YOU TO A COUPLE OF HUMANS:");
	System.out.println (" ");	
	tom.speak();
	System.out.println (" ");	
	steve.speak();
	System.out.println (" ");
	System.out.println ("HERE ON EARTH, IN ADDITION TO HUMANS, WE HAVE A NICE ZOO");
	System.out.println (" ");
	zoo.advertise();

	Plant plant1 = new Plant("Yes", 43, "Yes");
	Plant plant2 = new Plant("Yes", 22, "No");

	System.out.println ("WELCOME BACK... IN ADDITION HERE ON EARTH, YOU'LL FIND SOME PLANTS");
	System.out.println (" ");
	plant1.grow();
	System.out.println (" ");
	plant2.grow();
	System.out.println (" ");
	plant2.godormant();
	System.out.println (" ");

	}
}
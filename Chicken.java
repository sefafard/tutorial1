public class Chicken extends Bird implements Flyable {

    public Chicken(String birdType, int weightInOunces, String beakColor){
        super ( birdType, weightInOunces, beakColor);	
    }

    public void fly() {
        System.out.println ("Flapping and strutting like a chicken");
    }
    
}
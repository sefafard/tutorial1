public class Sparrow extends Bird implements Flyable {

    public Sparrow(String birdType, int weightInOz, String beakColor){
        super("Sparrow", weightInOz, "Black");
    }

    public void fly() {
        System.out.println("Sparrow flying high...");
    }
}
public class Plant {
    String flowering;
    int heightInInches;
    String fruit;

    public Plant (String flowering, int heightInInches, String fruit) {
        this.flowering = flowering;
        this.heightInInches = heightInInches;
        this.fruit = fruit;
    }

    public void grow(){
        System.out.println("I am a plant and I am growing");
        System.out.println("I expect to be " + heightInInches + " tall.");
        System.out.println("Flowers=" + flowering + ".  Fruit=" + fruit +".");    
    }

    public void godormant() {
        System.out.println("I am a plant and I am dying but will come back.");
    }
}
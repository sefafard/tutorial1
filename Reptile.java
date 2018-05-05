public class Reptile {
	
	int numberOfLegs;
	int lengthOfTailInInches;
  	String tongueYesNo;

	public Reptile (int numberOfLegs, int lengthOfTailInInches, String tongueYesNo){
		this.numberOfLegs = numberOfLegs;
		this.tongueYesNo = tongueYesNo;
		this.lengthOfTailInInches = lengthOfTailInInches;
		}

	public void hiss() {
		System.out.println("I'm a creepy, crawly reptile with -" + numberOfLegs + "- legs.");
		System.out.println("Do I have a tongue?  " + tongueYesNo + "!!!!");
		System.out.println("My tail is " + lengthOfTailInInches + " inches long.");
		System.out.println("Oh yeah... HISSSSS!");
		}

}
public class Insect {
	
	int numberOfLegs;
  	String wingsYesNo;

	public Insect (int numberOfLegs, String wingsYesNo){
		this.numberOfLegs = numberOfLegs;
		this.wingsYesNo = wingsYesNo;
		}

	public void crawl() {
		System.out.println("I'm a creepy, crawly insect with -" + numberOfLegs + "- legs.");
		System.out.println("Do I have wings?  " + wingsYesNo + "!!!!");
		}

}
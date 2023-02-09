package FinalKeyword;

public class Cake {
	protected String flavor;
	final void display() {
		System.out.println("Flavour of a cake is:"+flavor);
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
}

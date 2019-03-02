package lab3;

public abstract class Animal {
	private String name;
	private int numLegs;
	
	public int getLegs() {
		return this.numLegs;
	}
	
	public String getName() {
		return this.name;
	}
	
	Animal(String myName, int myLegs){
		this.name = myName;
		this.numLegs = myLegs;
	}
	
	@Override
	public String toString() {
		return name + ", " + numLegs;
	}
}

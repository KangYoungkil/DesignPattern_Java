public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	} // Same interface

	public abstract double cost();// Same interface
}
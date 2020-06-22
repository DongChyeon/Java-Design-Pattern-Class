

public interface Vehicle {
	public enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOS};
	
	public Engine getEngine();
	public Vehicle.Colour getColour();
	public void paint(Vehicle.Colour colour);
	
	public int getPrice();
}

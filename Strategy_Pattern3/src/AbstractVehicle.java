
public abstract class AbstractVehicle {
	private Engine engine;
	private Vehicle.Colour colour;
	
	public AbstractVehicle(Engine engine) {
		this.engine = engine;
	}
	
	public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
		this.engine = engine;
		this.colour = colour;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public Vehicle.Colour getColour() {
		return colour;
	}
	
	public void paint(Vehicle.Colour colour) {
		this.colour = colour;
	}
}



public class Coupe extends AbstractCar {
	
	public Coupe(Engine engine) {
		super(engine);
	}
	public Coupe(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}
	public int getPrice() {
		return 7000;
	}
}

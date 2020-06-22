

public class Pickup extends AbstractVan {
	
	public Pickup(Engine engine) {
		super(engine);
	}
	public Pickup(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}
	public int getPrice() {
		return 9000;
	}
}

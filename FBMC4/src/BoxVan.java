

public class BoxVan extends AbstractVan {
	
	public BoxVan(Engine engine) {
		super(engine);
	}
	public BoxVan(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}
	public int getPrice() {
		return 10000;
	}
}

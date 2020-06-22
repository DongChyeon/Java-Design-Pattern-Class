

public abstract class AbstractVehicleOption extends AbstractVehicle {
	
	public AbstractVehicleOption(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}
	
	public AbstractVehicleOption(Engine engine) {
		super(engine);
	}

	public abstract int getPrice();
}

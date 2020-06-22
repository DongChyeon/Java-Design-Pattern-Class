

public abstract class AbstractCar extends AbstractVehicle{
	
	public AbstractCar(Engine engine) {
		super(engine, Vehicle.Colour.UNPAINTED);
	}
	public AbstractCar(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}
}

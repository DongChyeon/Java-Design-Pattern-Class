
public abstract class AbstractCar extends AbstractVehicle {
	private GearboxStrategy gearboxStrategy;
	
	public AbstractCar(Engine engine) {
		super(engine);
		setGearboxStrategy(new StandardGearboxStrategy());
	}
	
	public void setGearboxStrategy(GearboxStrategy gs) {
		this.gearboxStrategy = gs;
	}
	
	public GearboxStrategy getGearboxStrategy() {
		return gearboxStrategy;
	}
	
	public void setSpeed(int speed) {
		gearboxStrategy.ensureCorrectGear(getEngine(), speed);
	}
}

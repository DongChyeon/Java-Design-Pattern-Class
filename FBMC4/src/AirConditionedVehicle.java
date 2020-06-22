
public class AirConditionedVehicle extends AbstractVehicleOption {
	private Vehicle vehicle;
	
	public AirConditionedVehicle(Vehicle vehicle) {
		super(vehicle.getEngine(), vehicle.getColour());
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice() + 660;
	}
	
	public void setTemperature() {
		// To do
	}
}


public class SatNavVehicle extends AbstractVehicleOption {
	private Vehicle vehicle;
	
	public SatNavVehicle(Vehicle vehicle) {
		super(vehicle.getEngine(), vehicle.getColour());
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice() + 1500;
	}
	
	public void setDestincation() {
		// To do
	}
}

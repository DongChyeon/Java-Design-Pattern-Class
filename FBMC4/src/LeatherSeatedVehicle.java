
public class LeatherSeatedVehicle extends AbstractVehicleOption {
	private Vehicle vehicle;
	
	public LeatherSeatedVehicle(Vehicle vehicle) {
		super(vehicle.getEngine(), vehicle.getColour());
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice() + 1200;
	}
	
}

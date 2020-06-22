
public class MetallicPaintedVehicle extends AbstractVehicleOption {
	private Vehicle vehicle;
	
	public MetallicPaintedVehicle(Vehicle vehicle) {
		super(vehicle.getEngine(), vehicle.getColour());
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice() + 750;
	}
	
}

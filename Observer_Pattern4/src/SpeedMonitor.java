
public class SpeedMonitor implements Observer {
	private int speed;
	private Subject speedData;
	
	public static final int SPEED_TO_ALERT = 70;
	
	public SpeedMonitor(Subject speedData) {
		this.speedData = speedData;
		speedData.registerObserver(this);
	}
	
	public void update(int speed) {
		this.speed = speed;
		display();
	}
	
	public void display() {
		if (speed > SPEED_TO_ALERT)
			System.out.println("** ALERT ** Driving too fast!(" + speed +")");
		else
			System.out.println("... nice and steady... (" + speed +")");
	}
}

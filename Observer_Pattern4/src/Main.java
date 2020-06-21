
public class Main {

	public static void main(String[] args) {
		Speedometer speedometer = new Speedometer();
		SpeedMonitor speedMonitor = new SpeedMonitor(speedometer);
		
		speedometer.setCurrentSpeed(50);
		speedometer.setCurrentSpeed(70);
		speedometer.setCurrentSpeed(40);
		speedometer.setCurrentSpeed(100);
		speedometer.setCurrentSpeed(69);
	}

}

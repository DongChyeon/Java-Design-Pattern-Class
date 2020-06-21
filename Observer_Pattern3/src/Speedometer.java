import java.util.Observable;

public class Speedometer extends Observable {
	private int currentSpeed = 0;
	
	public void setCurrentSpeed(int speed) {
		currentSpeed = speed;
		setChanged();
		notifyObservers();
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
}

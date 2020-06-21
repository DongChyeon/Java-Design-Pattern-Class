import java.util.ArrayList;

public class Speedometer implements Subject {
	private ArrayList<Observer> observers;
	private int currentSpeed = 0;
	
	public Speedometer() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(currentSpeed);
		}
	}
	
	public void setCurrentSpeed(int speed) {
		currentSpeed = speed;
		notifyObservers();
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
}

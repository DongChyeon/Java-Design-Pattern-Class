
public class Singleton4 {
	private volatile static Singleton4 uniqueInstance;
	
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton4.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton4();
				}
			}
		}
		return uniqueInstance;
	}
	// 쓰레드가 나눠쓰는 구간을 줄여줌
}

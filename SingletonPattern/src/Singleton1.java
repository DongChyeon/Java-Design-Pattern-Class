
public class Singleton1 {
	private static Singleton1 uniqueInstance;
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton1();
		}
		return uniqueInstance;
	}
	// 가장 간단한 형태의 싱글톤 패턴
}

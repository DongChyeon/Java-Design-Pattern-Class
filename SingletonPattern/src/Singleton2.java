
public class Singleton2 {
	private static Singleton2 uniqueInstance;
	
	private Singleton2() {}
	
	public static synchronized Singleton2 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton2();
		}
		return uniqueInstance;
	}
	// synchronized : 모든 쓰레드가 자신의 차례가 오기까지 기다리게 됨 (쓰레드 충돌 방지)

}

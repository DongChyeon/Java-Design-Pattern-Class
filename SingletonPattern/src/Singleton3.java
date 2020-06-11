
public class Singleton3 {
	private static Singleton3 uniqueInstance = new Singleton3();
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		return uniqueInstance;
	}
	// 속도 저하를 방지, 하지만 객체가 항상 생성되어 있음(객체가 클 경우 부적합)
}

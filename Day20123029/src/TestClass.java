
public class TestClass {
	void instanceMethod() {}// 인스턴스메서드
	static void staticMethod() {} //static메서드
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
static void staticMehtod2() {
	instanceMethod();// 에러 인스턴스메소드 호출 x
	staticMethod();
	
}
}

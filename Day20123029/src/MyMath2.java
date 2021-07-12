
public class MyMath2 {
	long a,b;
	
	
	long add() {  //인스턴스 메서드 new
		return a+b;
	}
	
	
	static long add(long a,long b) { // new라는 연산자 관계 x
		return a+b;
				
	}
}

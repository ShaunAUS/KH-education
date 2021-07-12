package kr.or.kh;

interface Interface1{		//오직 상수와 추상메서드로 구성
	public static int interVar=10;
	public abstract void interface1Method();
}

class Interface1Impl implements Interface1{

	@Override
	public void interface1Method() {
		System.out.println("interface1Method 구현");
		
	}
	
}
public class InterafaceTest1 {

	public static void main(String[] args) {
		//Interface1 in1 = new Interface1();
		Interface1Impl in1Impl= new Interface1Impl();
		System.out.println("in1Impl.intervar="+in1Impl.interVar);
		System.out.println("ddddd="+Interface1.interVar);
		in1Impl.interface1Method();
	}

}

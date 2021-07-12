package kr.or.kh;
//인터페이스 상속 -구현
interface In1{
	public static int x=10;
	public abstract void in1Method();
	
	
}

interface In2{
	public static int x=20;
	public abstract void in1Method();
	public abstract void in2Method();
}

interface In3 extends In1,In2{
	
}

class ExtendsTest implements In3{

	@Override
	public void in1Method() {
		
		
	}

	@Override
	public void in2Method() {
		
		
	}
	
}
public class InterfaceTest3 {

	public static void main(String[] args) {
	ExtendsTest et= new ExtendsTest();  //인터로 객체 못만듬
	et.in1Method();
	et.in2Method();

	}

}

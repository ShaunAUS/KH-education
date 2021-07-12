package kr.or.kh;

public class AutoBoxingTest {

	public static void main(String[] args) {
		int var_int1=3;
		Integer intObj1 = new Integer(var_int1);
			//기본형 (int) ->클래스  ==오토박싱
		intObj1=var_int1;
		//클래스 ->기본형==(언박싱)
		
		Integer intObj2=new Integer("4");
		int var_int2 = intObj2.intValue();
		var int2=intObj2;
	}

}

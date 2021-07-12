package kr.or.oh;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1= "shaun";                        //같은 문자열 = 같은곳 가르킨다(주소 같다)(힙 메모리)
		String strVar2= "shaun";
		String strVar3= new String("shaun");
		
		
		System.out.println(strVar1==strVar2);
		System.out.println(strVar1==strVar3);          //저장위치 해쉬코드 다르다
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));   // 문자열은 같다

	}

}

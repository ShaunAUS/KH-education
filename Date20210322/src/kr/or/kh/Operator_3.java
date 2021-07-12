package kr.or.kh;

public class Operator_3 {

	public static void main(String[] args) {
		int num1= 15;
		int num2= 23;
		int num3= 33;
		int num4= 44;
		String result1=(num1>10 && num1<20)?"10대":"10대아니다";
		System.out.println(result1);
		String result2=(num2>20 && num2<30)?"20대":"20대아니다";
		System.out.println(result2);
		String result3=(num3>30 && num3<40)?"30대":"30대아니다";
		System.out.println(result3);
		String result4=(num4>40 && num4<50)?"40대":"40대아니다";
		System.out.println(result4);
	}

}

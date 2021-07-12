package kr.or.kh;

public class FromInToFloat {

	public static void main(String[] args) {
		
		char ai='A';
		int result = ai+1;                   //문자(유니코드) +숫자
		char na = (char)result;
		System.out.println(na);
		
		
		/*
		int num1= 123456780;
		int num2= 123456780;
		double num3= num2;
		num2= (int)num3;
		int result = num1-num2;
		System.out.println(result);
		*/
	}

}

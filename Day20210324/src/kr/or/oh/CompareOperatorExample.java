package kr.or.oh;

public class CompareOperatorExample {

	public static void main(String[] args) {
		
		
		int num1 =10;
		int num2 = 10;
		boolean result1 = (num1==2);
		boolean result2= (num1!=num2);
		boolean result3= (num1 <=num2);
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);
		
		
		char char1 = 'A';								//문자 =아스키코드 숫자
		char char2 = 'B';
		char char3 = 'C';
		boolean result4 = (char1<char2);
		System.out.println("result4="+result4);
	}

}

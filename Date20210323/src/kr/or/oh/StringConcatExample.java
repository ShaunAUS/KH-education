package kr.or.oh;

public class StringConcatExample {

	public static void main(String[] args) {
		
		System.out.println('A'<'B'); //아스키코드 숫자값으로 비교
		
		String str1 = "JDK"+6.0;
		String str2 = str1+"특징";
		System.out.println(str1);
		System.out.println(str2);
		
		
		String str3 = "JDK"+3+3.0;
		String str4 = 3+3.0+"JDK"; //---------------------------------------------
		System.out.println(str3);
		System.out.println(str4);
		

	}

}

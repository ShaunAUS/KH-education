package kr.or.oh;

public class LogicTest6 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);  //string 문자열 기본형으로 전환
		int num2 = Integer.parseInt(args[1]);	//string 문자열 기본형으로 전환
		
		String operation = args[2];
		int result = 0 ;    					//result(빈것) 선언
		
		if(operation.equals("+")) {
			result = num1 + num2;
		}else if (operation.equals("-")) {
			result= num1 - num2; 
		}else if (operation.equals("x")||operation.equals("X")) {
			result = num1 *num2;
		}else if (operation.equals("/")) {
			result = num1 / num2;
		}else if (operation.equals("%")) {
			result = num1 % num2;
		}else {
			System.out.println("+,-,x,/중에 입력하세요");
			
		}
		System.out.println(num1+operation+num2+"="+result);
		

		}
}
		

	



package kr.or.oh;

public class SwitchCase2 {

	public static void main(String[] args) {
		String operator = args [0];
		switch(operator) {
		
		
		case "+":
		System.out.println("덧셈");
		break;

		case "-":
		System.out.println("뺼셈");
		break;
		
		case "x": case"X":
			System.out.println("곱셈");
		break;

		case "/":
			System.out.println("나누기");
			break;
			
		case "%":
			System.out.println("나머지");
			break;
			
		default:
			System.out.println("연산자가 없습니다");
             }
		}
	}
		

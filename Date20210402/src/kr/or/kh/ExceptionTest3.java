package kr.or.kh;

public class ExceptionTest3 {
  //catch 예외문 외우기 
	public static void main(String[] args) {
		try {
			int num= Integer.parseInt(args[0]);		
			int result =10/num;
			System.out.println("result="+result);
			
			
		} catch (ArrayIndexOutOfBoundsException e1) {
				//배열방 갯수 잘못 처리됐을떄
			System.out.println("인자를 하나 입력해주세요");
			
			
		}catch (NumberFormatException e2) {
			System.out.println("인자를 정수타입 입력해주세요");
			//숫자 들어와야돼는데 문자들어옴
			
			
			
		}catch (ArithmeticException e3) {
			System.out.println("정수 0으로 나누면 안돼요");
		}
		System.out.println("프로그램 계속 실행");
	}

}

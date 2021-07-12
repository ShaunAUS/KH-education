package kr.or.kh;

public class ExceptionTest2 {
  //오류나도 반드시 끝까지실행  = try catch
	public static void main(String[] args) {
		int num= Integer.parseInt(args[0]);
		try {
			int result =10/num;
			System.out.println("result="+result);
		} catch (Exception e) {
			
			//e.printStackTrace(); 
			System.out.println("정수를 0으로 나누면 x");     //개발자가 에러메세지 만들수잇다
		}
		System.out.println("프로그램 계속 실행됌");
	}

}

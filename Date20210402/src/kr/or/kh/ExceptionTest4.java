package kr.or.kh;

public class ExceptionTest4 {

	//finally 무조건 수행 !! 예외 나던 말던
		try {
			int num =Integer.parseInt(args[0]);
			int result= 10/num;
			System.out.println("result="+result);
			return;
		} catch (ArrayIndexOutOfBoundsException e1) {
			
			e1.printStackTrace();
			
		}catch(NumberFormatException e2) {
		e2.printStackTrace();

	} catch(ArithmeticException e3) {
		e3.printStackTrace();
	}finally {
		System.out.println("예외가 일어나는 안나든 무조건 수행");
	}
		

public static void main(String[] args) {
	ExceptionTest4 et4= new ExceptionTest4();
	et4.exceptionMethod(args);
}	
}}


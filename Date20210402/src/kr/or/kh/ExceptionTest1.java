package kr.or.kh;

public class ExceptionTest1 {
	//비정상적 종류,  // 반드시 실행해야함
	
	//실행할떄오류 vs컴파일할떄오류
	public static void main(String[] args) {
		try {
			int num= Integer.parseInt(args[0]);
			int result =10/num;
			System.out.println("result="+result);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

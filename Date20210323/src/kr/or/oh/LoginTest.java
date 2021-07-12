package kr.or.oh;

public class LoginTest {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		
		//느낌표 주의
		if(!id.equals("kh")) {					//다르면 참
			System.out.println("id가 틀렸습니다");
		}else if(!pw.equals("user11")) {
			System.out.println("pw가 틀렸습니다.");
		}else {
			System.out.println("환영합니다");
		}
		
	}

}

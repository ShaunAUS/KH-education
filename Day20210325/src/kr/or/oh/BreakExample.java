package kr.or.oh;

public class BreakExample {

	public static void main(String[] args) {
		
		//FOR vs while
		while(true) {
			int num = (int)(Math.random()*6)+1;  ///math.random 0.0~1무작위 숫자
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}

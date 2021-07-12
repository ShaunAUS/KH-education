package kr.or.oh;

public class LogicTest3 {
	//윤년구하기
	
	public static void main(String[] args) {
		int year= Integer.parseInt(args[0]);
		boolean result=false;
		result = (year%4==0 && year%100!=0||year%400==0);
		if(resut) {
			System.out.println(year+"년은 윤년입니다"));
		}else {
			System.out.println(year+"년은 윤년이 아닙니다");
		}
	}

}

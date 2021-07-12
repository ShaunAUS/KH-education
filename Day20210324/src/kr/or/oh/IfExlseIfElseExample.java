package kr.or.oh;

public class IfExlseIfElseExample {

	public static void main(String[] args) {
		int score= 60;
		if(score>=90) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급은 A입니다");
		}else if(score>=80) {
			System.out.println("점수가80~90입니다");
			System.out.println("등급은 b입니다");
			
		}else if (score>=70) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급은 c입니다");
		}else {
			System.out.println("점수가 70미만 입니다");
			System.out.println("등급은 d입니다");
		}

	}

}

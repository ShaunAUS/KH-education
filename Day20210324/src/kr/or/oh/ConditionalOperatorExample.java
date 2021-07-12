package kr.or.oh;

public class ConditionalOperatorExample {
	
	//삼함연산자 두번

	public static void main(String[] args) {
		int score= 85;
		char grade = (score>90)? 'A':((score>80))?'B':'C';
		System.out.println(score+"점은"+grade+"입니다");
	
		

	}

}

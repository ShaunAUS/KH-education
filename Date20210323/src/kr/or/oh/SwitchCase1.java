package kr.or.oh;

public class SwitchCase1 {

	public static void main(String[] args) {
		String job= args[0];
		String salary = "";  						//문자열 비우기
		
		switch(job) {
			case "사원":
				salary="2천만원";
				break;
			case"대리":
				salary="3천만원";
				break;
			case"과장":
				salary="3천만원";
				break;
				
			case"부장":
				salary="5천";
				break;
				
				default:
					System.out.println("직급을 잘못 입력했습니다");
		}
		System.out.println("당신의 연봉은"+salary+"입니다");
	}

}

package kr.or.oh;

public class Logic7 {

	public static void main(String[] args) {
		int kor= Integer.parseInt(args[0]);
		int eng= Integer.parseInt(args[1]);
		int mat= Integer.parseInt(args[2]);
		int total= 0;
		total= kor +eng +mat ;
		
		
		if(total>=180) {
			if(kor<40||eng<40||mat<40) {
				System.out.println("당신은 불합격입니다");
			}else {
				System.out.println("합격입니다");
			}
		}else {
			System.out.println("총점이 부족합니다 불합격 입니다");
		}
		
	}	
}

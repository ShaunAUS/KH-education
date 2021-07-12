package kr.or.oh;

public class JuExecuter2 {

	public static void main(String[] args) {
		System.out.println("주문하시겠습니까yes/no");
		String ju = args[0];                            //"yes" 문자열로 받아  charAt(0) x
		
		
		//대소문자 만족시키는거 ||
		if(ju.equals("yes")||ju.equals("YES")) {
			System.out.println("주문선택");
			System.out.println("메뉴1.자장면2.짬뽕3.탕수육");
			
			
			int menu = Integer.parseInt(args[1]);                   //숫자받음 숫자=문자
			
			
			
			switch(menu) {
				case 1:                                             //case(띄어쓰기)1
					System.out.println("자장면 선택");
					System.out.println("자장면곱배기선택yes/no");
					
					String gob = args[2];
					
					if(gob.equals("yes")||gob.equals("YES")) {
						System.out.println("자장면 곱배기 선택");
					}else {
						System.out.println("자장면 보통선택");
					}
						
					break;
					
					
				case 2:
					System.out.println("짬뽕 선택");
					 gob = args[2];
					if(gob.equals("yes")||gob.equals("YES")) {
						System.out.println("짬뽕곱배기선택");
					}else{
						System.out.println("짬봉보통선택");
					}
						break;
						
						
				case 3:
					System.out.println("탕수육 선택");
					System.out.println("메뉴1.대2.중3.소");
					int tang = Integer.parseInt(args[2]);
					if(tang==1) {
						System.out.println("탕수육 대");
					}else if(tang==2) {
						System.out.println("탕수육 중");
					
					}else if(tang==3) {
						System.out.println("탕수육 대");
					}
					break;
					
					
				default:    //case에 맞는게 없다면 default
					System.out.println("1,2,3,번중에 선택하세여");
			}
		}else {
			System.out.println("주문취소");
		}
	}

}

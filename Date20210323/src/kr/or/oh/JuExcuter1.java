package kr.or.oh;

public class JuExcuter1 {

	public static void main(String[] args) {
		
		//Run figuration2 --program argument 첫번쨰가 배열 0번쨰방
		
		char ju= args[0].charAt(0);  //charAt= 문자열을 문자로 잘라준다
		if(ju=='y'||ju=='Y') {
			System.out.println("주문선택");
			System.out.println("메뉴:1.자장면2.짬뽕");
			
			
			
			int menu=Integer.parseInt(args[1]);
			if(menu==1) {
				System.out.println("자장면선택");
				System.out.println("자장면곱배기선택y/n");
				char gob=args[2].charAt(0);              //charAt(0)----------------------------
			if(gob =='y'||gob=='Y') {
				System.out.println("자장면 곱배기선택");
			}else {
				System.out.println("자장면 보통선택");
			}
				
			
			
			
			}else if(menu==2){
				System.out.println("짬뽕선택");
				System.out.println("짬뽕 곱배기선택y/n");
				char gob = args[2].charAt(0);                   //args 두번째
				if(gob=='y'||gob=='Y') {
					System.out.println("짬뽕 곱배기 선택");
				}
			}else {
				System.out.println("1.2.번중 선택");
			}
		}else {
			System.out.println("주문취소");
		}
	}

}

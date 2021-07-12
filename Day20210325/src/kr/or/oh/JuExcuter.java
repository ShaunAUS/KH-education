package kr.or.oh;

import java.util.Scanner;

public class JuExcuter {

	public static void main(String[] args) {
		
		String[] ju = new String[2];
		int[] menu=new int[2];
		
		
		Scanner input=new Scanner(System.in);
		
		
		while(true) {//반복문
		System.out.println("주문하세요");
		
		
		ju[0]=input.next();         //문자열 읽어드린다
		
		if(ju[0].equals("yes")||ju[0].equals("YES")) {
			System.out.println("주문선택");
			System.out.println("메뉴1.자장면2.짬뽕3.탕수육");
			menu[0]=input.nextInt();    				//숫자 읽음
			if(menu[0]==1) {
			System.out.println("자장면선택");
			System.out.println("자장면 곱뺴기선택");
			ju[1]=input.next();
			if(ju[1].equals("yes")||ju[1].equals("YES")){
				System.out.println("짜장곱배기");
			}else {
				System.out.println("자장 보통");
			}
			
			
			
			
			
			}else if(menu[0]==2) {
				System.out.println("짬뽕선택");
				System.out.println("짬뽕 곱배기 선택");
				ju[1]=input.next();
				if(ju[1].equals("yes")||ju[1].equals("YES")) {
					System.out.println("짬뽕곱배기");
				}else {
					System.out.println("짬봉 보통");
				}
				
				
				
				
				
				
			}else if(menu[0]==3) {
				System.out.println("탕수육 선택");
				System.out.println("메뉴1.대2.중3.소");
				menu[1]=input.nextInt();
			}if(menu[1]==1) {
				System.out.println("탕수육 대");
			}else if(menu[1]==2) {
				System.out.println("탕수육 중");
			}else if(menu[1]==3) {
				System.out.println("탕수육 소");
			}
		}else {
			System.out.println("주문취소");
		}
	}//반복문
}

}

package kr.or.oh;

import java.util.Scanner;

public class JuExcuter2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] menu= new int[2][2];
		
		
		
		while(true) {
		System.out.println("주문하세요y/n");
		menu[0][0]=input.next().charAt(0);					//'문자'  입력
		if(menu[0][0]=='y'||menu[0][0]=='Y') {
			System.out.println("주문선택");
			System.out.println("메뉴1.자장면2.짬뽕3.탕수육");
			menu[0][1]=input.nextInt();             		//'숫자'입력
			if(menu[0][1]==1) {
				System.out.println("자장면선택");
				System.out.println("자장면 곱배기y/n");
				menu[1][0]=input.next().charAt(0);			//'문자' 입력
				if(menu[1][0]=='y'||menu[1][0]=='Y') {
					System.out.println("자장면 곱배기선택");
				}else {
					System.out.println("자장면보통 선택");
				}
				
				
				
				
			}else if(menu[0][1]==2) {
				System.out.println("짬뽕 선택");
				System.out.println("짬뽕 곱배기 선택y/n");
				menu[1][0]=input.next().charAt(0);
				if(menu[1][0]=='y'||menu[1][0]=='Y') {
					System.out.println("짬뽕 곱뺴기 선택");
				}else {
					System.out.println("짬뽕 보통 선택");
				}
				
				
				
				
				
			}else if(menu[0][1]==3) {
				System.out.println("탕수육선택");
				System.out.println("메뉴1.대.2중.3소");
				menu[1][1]=input.nextInt();
				if(menu[1][1]==1) {
					System.out.println("탕수육 대 선택");
				}else if(menu[1][1]==2) {
					System.out.println("탕수육 중 선택");
				}else if(menu[1][1]==3) {
					System.out.println("탕수육 소 선택");
				}
			}
		}else {
			System.out.println("주문취소");
		}
	}
	}
}

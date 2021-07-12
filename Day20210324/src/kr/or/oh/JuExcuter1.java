package kr.or.oh;

import java.util.Scanner;

public class JuExcuter1 {
					//구조를 보고 메소드를 만든다
	public static void juDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("주문선택");
		}else {
			System.out.println("주문취소");
		}
	};

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);       					//콘솔창 키보드
		
		
		while(true) { 													// 반복문시작
			System.out.println("주문하세요y/n");
			
		
		char ju =input.next().charAt(0);    							//args[0].cahrAt(0)으로 받으면 무한루트
		
		
		if(ju=='y'||ju=='Y') {
			juDisplay(1);
			System.out.println("주문선택");
			System.out.println("메뉴1.자장면2.짬뽕3.탕수육");
			int menu = input.nextInt();                                //숫자를 직접 키보드로 읽는다.
			
			
			if(menu==1) {
				System.out.println("자장면선택");
				System.out.println("자장면 곱빼기 선택y/n");
				
				
				char gob = input.next().charAt(0);                //커서
				
				
				if(gob=='y'||gob=='Y') {
					System.out.println("자장면 곱배기선택");
				}else {
					System.out.println("자장면 보통 선택");
				
				}
				
				
				
				
				
				
			}else if(menu==2) {
				System.out.println("짬뽕선택");
				System.out.println("짬뽕 곱빼기선택 y/n");
				
				char gob = input.next().charAt(0);
				if(gob=='y'||gob=='Y') {
					System.out.println("짬뽕 곱배기선택");
				}else {
					System.out.println("짬뽕 보통 선택");
				}
				
				
				
				
				
				
				
			}else if (menu==3) {
				System.out.println("탕수육 선택");
				System.out.println("메뉴1.대2.중3.");
				int tang = input.nextInt();
				if(tang==1) {
					System.out.println("탕수육 대");
				}else if (tang==2) {
					System.out.println("탕수육 중");
				}
				
					
				}
			else {
				System.out.println("1.2.3.중 선택 하세요");
			}
			}else {
			  juDisplay(2);
		}
		
		}																// 반복문의 끝
		

	}

}

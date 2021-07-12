package kr.or.oh;

import java.util.Scanner;

public class JuExecuter1 {
		//continue 활용
	public static void main(String[] args) {
		System.out.println("주문하세요y/n");
		
		
		while(true) {//반복문 시작
			
			
		Scanner input= new Scanner(System.in);
		char ju=input.next().charAt(0);
		
		
		if(ju=='y'||ju=='Y') {
			System.out.println("주문선택");
			System.out.println("메뉴1.자장면.2짬뽕3.탕수육4.이전메뉴");
			
			int menu = input.nextInt();									//커서 (숫자)
			
			if(menu==1) {
				System.out.println("자장면 선택");
				break;
			}else if(menu==2) {
				System.out.println("짬뽕 선택");
				break;
			}else if(menu==3) {
				System.out.println("탕수육 선택");
				break;
			}else if (menu==4) {
				System.out.println("이전메뉴");
				continue;
			}
			}
		else {
			System.out.println("주문취소");
			System.exit(0);
			
		}
		}//반복문 끝

	}
	}



package kr.or.oh;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		
		
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램종료 q입력");
		
		String inputString="";
		
		
		
		do {
			System.out.println(">");
			 inputString=input.nextLine();      					//커서
			System.out.println(inputString);
		}while(!inputString.equals("q"));               			//while 참이면 do 안의 문장수행!!!!==반복
		System.out.println();
		System.out.println("프로그램 종료");

	}

}

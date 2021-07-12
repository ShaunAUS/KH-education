package kr.or.oh;

import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("등급입력");
			char grade=input.next().charAt(0);      //문자 하나 가져오는거
		
		
			
			
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("우수회원");
			break;
		case'B' :
		case 'b':
			System.out.println("일반회원");
			break;
			default :
				System.out.println("손님");
		}

	}

}

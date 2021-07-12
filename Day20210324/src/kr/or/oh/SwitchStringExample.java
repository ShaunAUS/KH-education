package kr.or.oh;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("부장");
		System.out.println("과장");
		System.out.println("차장");
		System.out.println("직급입력");
		//System.out.println("직급 입력");
		String position = input.next();       //커서위치
		
		
		//String position = "과장";
		switch(position) {          
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("600만원");
			break;
			default :
			System.out.println("309만원");
		}

	}

}

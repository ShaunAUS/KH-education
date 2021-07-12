package kr.or.oh;

import java.util.Scanner;

public class Dowhile_Test6 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		String result= "서울";
		
		
			do {
				System.out.println("대한민국의 수도를 입력하세요");
				String inputString = input.next();
				
				
				if(inputString.equals(result)) {
					System.out.println("대한민국의 수도는="+result+"입니다");
					break;
				}
				System.out.println("다시입력해주세요");
			}while(true);

	}

}

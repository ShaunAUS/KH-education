package kr.or.oh;

import java.util.Scanner;

public class DowhileTest_5 {
    
	  //무작위 숫자 맞추기   
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int randomNumber = (int)(Math.random()*100)+1;
		
		
				
		do {
			System.out.println("숫자를 입력 하세요");
			int inputNumber = input.nextInt();
			if(inputNumber==randomNumber) {
				System.out.println("맞혔습니다");
				break;
			}
			
			
			
		 if(inputNumber<randomNumber) {
			System.out.println("숫자가 너무 작아요");
		}else {
			System.out.println("숫자가 너무 커요");
		}
			}
		while(true);						// do로 다시감
		
	}
	}


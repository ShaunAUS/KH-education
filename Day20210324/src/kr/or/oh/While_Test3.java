package kr.or.oh;

import java.util.Scanner;

public class While_Test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("구구단 입력하세요");
		
		int danNumber = input.nextInt();
		if(danNumber>=2 && danNumber<=9) {
			int num=1;
			int result=0;
			while(num<=9) {
				result = danNumber*num;
				System.out.println(danNumber+"*"+num+"="+result);
				num++;
			}
		

	else {
		System.out.println("단값이 잘못 되었습니다");}
	}
		
	}
}
	



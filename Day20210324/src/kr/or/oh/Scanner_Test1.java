package kr.or.oh;

import java.util.Scanner;

public class Scanner_Test1 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);       		 //scanner 불러오기
				
		System.out.println("문자열을 입력하세요");        		
		String nextString=input.next();  				//input "문자열"임  커서	//커서위치	
		System.out.println("입력한값은="+nextString);
		
		
		
		System.out.println("숫자입력");
		int nextIntNum = input.nextInt();       	//"숫자" 커서//커서위치
		System.out.println("nextNum="+nextIntNum);
		
				
		System.out.println("문자 입력");				//'문자 ' 입력
		int nextChar=input.next().charAt(0);
		
		
		//char  a=input.next().charAt(0);        //  "문자" 하나 가져오기
	}

}

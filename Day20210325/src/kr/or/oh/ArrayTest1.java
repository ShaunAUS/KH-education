package kr.or.oh;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		int[] arrayNumber=new int[3];						//숫자 배열
		String[] names=new String[3];						//문자 배열
		
		for(int i=0;i<3;i++) {
			System.out.println("숫자 입력");
			arrayNumber[i]=input.nextInt();          //
		}
		
		
		
		
		for(int i=0;i<3;i++) {
			System.out.println("문자열 입력");
			names[i]=input.next();
		}
		
		
		
		
		for(int i =0;i<=3;i++) {
			System.out.println(arrayNumber[i]);
			System.out.println(names[i]);
		}
		
		
		

	}

}

package kr.or.oh;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		//숫자,문자 배열 다가능    //문자열은 초기값 무조건 null
		int[] arg= new int[3];
		
		
		Scanner input= new Scanner(System.in);         //스캐너 생성
		String[] kh= new String[3];
		
		
		for(int i = 0; i<kh.length;i++) {
			System.out.println("kh문자열 입력");
			kh[i]=input.next();       					//문자열 입력 커서
		}
		
				
		/*
		
		
			for(int i =0; i<arg.length;i++) {
			System.out.println("숫자입력");               //없으면 커서만 깜빡 뭘입력?
			arg[i]=input.nextInt();                    //숫자 입력 커서
			
			
		}
		//arg[0]=1;
		//arg[1]=2;
		System.out.println(arg[0]);
		System.out.println(arg[1]);
		System.out.println(arg[2]);
		*/
				
		

	}

}

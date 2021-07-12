package kr.or.oh;

import java.util.Scanner;

public class ArrayTest2 {
			//문자 입력 배열
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("한문자 입력");
		char[] ju = new char[2];
		ju[0]=input.next().charAt(0);
		ju[1]=input.next().charAt(0);
	}

}

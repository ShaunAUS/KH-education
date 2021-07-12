package kr.or.kh;

import java.util.Scanner;

public class Test1 {

	// | 기준으로 앞뒤 자르기 문자열
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("제목|내용");
		String titleContent=input.next();
		
		int indexI = titleContent.indexOf("|");  //=2
		System.out.println(indexI);
		
		String title = titleContent.substring(0,indexI); //짜르기
		System.out.println(title);
		
		String content= titleContent.substring(indexI+1);
		System.out.println(content);
	}

}

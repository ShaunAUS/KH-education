package kr.or.kh.obj3;

import java.util.Scanner;

public class ChinaMain {
	
	
	public static void main(String[] args) {
		Scanner input2= new Scanner(System.in);
		
		SeongnamChina seongnamChina=new SeongnamChina();
		SeoulChina seoulChina=new SeoulChina();
		
		
		while(true) {
		System.out.println("1번 서울중국집2.성남 중국집");
		int number= input2.nextInt();
		
		if(number==1) {
			System.out.println("짜장면 입력");				//기본생성자=값이 없다 그래서 하나하나 스캐너로 받음
			int jazzang=input2.nextInt();
			System.out.println("짬뽕입력");
			int jambong = input2.nextInt();
			System.out.println("탕수육입력");
			int tang= input2.nextInt();
			System.out.println("삼선짬뽕");
			int samsun=input2.nextInt();
			seoulChina.setJazaang(jazzang);
			seoulChina.setJambong(jambong);
			seoulChina.setTang(tang);
			seoulChina.setSamsun(samsun);
			
		}else{
			if(number==2) {
				System.out.println("짜장면 입력");
				int jazzang=input2.nextInt();
				System.out.println("짬뽕입력");
				int jambong = input2.nextInt();
				System.out.println("탕수육입력");
				int tang= input2.nextInt();
				System.out.println("쟁반짜장입력");
				int jaengban=input2.nextInt();
				seongnamChina.setJazaang(jazzang);
				seongnamChina.setJambong(jambong);
				seongnamChina.setTang(tang);
				seongnamChina.setJaengban(jaengban);
			}
			
		}
		}}
}

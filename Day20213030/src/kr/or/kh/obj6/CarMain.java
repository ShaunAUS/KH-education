package kr.or.kh.obj6;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		HyundaCar hyundaCar= new HyundaCar();
		GmCar gmCar=new GmCar();
		
		while(true){
		System.out.println("1.대우자동차2.현대자동차");
		System.out.println("번호입력");
		int number=input.nextInt();
		
		if(number==1) {
			gmCar.engine.kind="대우엔진";
			gmCar.door.window=4;
			gmCar.wheels=4;
			System.out.println(gmCar.toString());
			break;
		}else if(number==2){
			hyundaCar.engine.kind="헌대엔진";
			hyundaCar.door.window=4;
			hyundaCar.carirum="소나타";
			System.out.println(hyundaCar.toString());
			break;
		}else {
			System.out.println("해당 번호 없습니다 다시 선택해주세요");
		}
		}
	
	
	}
	}



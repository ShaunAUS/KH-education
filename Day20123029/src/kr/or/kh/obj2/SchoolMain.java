package kr.or.kh.obj2;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		WomanSchool ws=new WomanSchool();
		ManSchool ms = new ManSchool();
		ManGongupSchool mgs = new ManGongupSchool();
		
		while(true) {
		System.out.println("1,남자중학교2.여자중학교3.남자공업고등학교4.여자상업고등학교");
		int number=input.nextInt();
		if(number==1) {
			System.out.println("국어입력");
			int kor = input.nextInt();
			System.out.println("영어입력");
			int eng= input.nextInt();
			System.out.println("수학입력");
			int mat= input.nextInt();
			System.out.println("기술입력");
			int gisul=input.nextInt();
			ms.setKor(kor);
			ms.setGisul(gisul);
			ms.setEng(eng);
			ms.setMat(mat);
			System.out.println(ms.toString());
		}else if(number==2) {
			System.out.println("국어입력");
			int kor = input.nextInt();
			System.out.println("영어입력");
			int eng= input.nextInt();
			System.out.println("수학입력");
			int mat= input.nextInt();
			System.out.println("가정입력");
			int gajong=input.nextInt();
			ws.setKor(kor);
			ws.setGajong(gajong);
			ws.setEng(eng);
			ws.setMat(mat);
			System.out.println(ws.toString());
		}else if(number==3) {
			System.out.println("국어입력");
			int kor = input.nextInt();
			System.out.println("영어입력");
			int eng= input.nextInt();
			System.out.println("수학입력");
			int mat= input.nextInt();
			System.out.println("기술입력");
			int gisul=input.nextInt();
			System.out.println("공업입력");
			int gongup=input.nextInt();
			mgs.setKor(kor);
			mgs.setGisul(gisul);
			mgs.setEng(eng);
			mgs.setMat(mat);
			mgs.setGongup(gongup);
			System.out.println(mgs.toString());
		}else if(number==4) {
			
			
		}else {System.out.println("1.2.3.4.번중에 선택");}
	}
	}
}

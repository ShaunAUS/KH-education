package kr.or.kh.obj2;

import java.util.Scanner;

public class WomanSchool extends School {
	protected int gajong;

	
		public WomanSchool() {
			super();										//조상 생성자 먼저 호출
			
			
			
		}
	
		public WomanSchool(int kor, int eng, int mat,int gajong) {
			super(kor, eng, mat);							//조상 생성자 먼저 호출
			this.gajong=gajong;
			
		}
	
		
		
		
		
		
		public int getGajong() {
			return gajong;
		}

		public void setGajong(int gajong) {
			this.gajong = gajong;
		}

		
		
		
		@Override
		public String toString() {
			
			return super.toString()+"WomanSchool [gajong=" + gajong + "]";
			
		}
		
		
		public static void main(String[] args) {
			WomanSchool womanSchool = new WomanSchool(90,90,80,70);
			Scanner input= new Scanner(System.in);
			System.out.println("국어입력");
			int kor= input.nextInt();
			System.out.println("영어입력");
			int eng=input.nextInt();
			System.out.println("수학입력");
			int mat=input.nextInt();
			System.out.println("가정입력");
			int gajong=input.nextInt();
			womanSchool.setKor(kor);
			womanSchool.setEng(eng);
			womanSchool.setMat(mat);
			womanSchool.setGajong(gajong);
			System.out.println(womanSchool.toString());
		}
}

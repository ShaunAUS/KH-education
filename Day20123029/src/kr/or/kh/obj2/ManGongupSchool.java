package kr.or.kh.obj2;

import java.util.Scanner;

//생성자 함수는 상속 ㄴㄴ
public class ManGongupSchool extends ManSchool {
	protected int gongup;

	public ManGongupSchool() {
		super();       //부모 생성자 함수 상속 안돼니까 super
		
	}

	public ManGongupSchool(int kor, int eng, int mat, int gisul,int gongup) {
		super(kor, eng, mat, gisul);
		this.gongup=gongup;
	}

	
	
	public int getGongup() {
		return gongup;
	}

	public void setGongup(int gongup) {
		this.gongup = gongup;
	}

	
	
	@Override
	public String toString() {
		return super.toString()+"ManGongupSchool [gongup=" + gongup + "]";
	}
	public static void main(String[] args) {
		ManGongupSchool manGongupSchool=new ManGongupSchool(90,80,70,60,50);
		//System.out.println(manGongupSchool.toString());
		Scanner input= new Scanner(System.in);
		System.out.println("국어입력");
		int kor=input.nextInt();
		System.out.println("영어입력");
		int Eng=input.nextInt();
		System.out.println("수학입력");
		int Mat=input.nextInt();
		System.out.println("기술입력");
		int gisul=input.nextInt();
		System.out.println("공업입력");
		int gongup=input.nextInt();
		manGongupSchool.setKor(kor);
		manGongupSchool.setKor(Eng);
		manGongupSchool.setKor(Mat);
		
		
	}
}

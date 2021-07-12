package kr.or.oh;

import java.util.Scanner;

public class TestT {
	
	//다차원은 for문 두개여야함 forfor
	public static void main(String[] args) {
		
		int[][] a=new int[2][2];
		
		Scanner input=new Scanner(System.in);
		
		
		
		
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
		System.out.println("숫자입력");
		a[i][j]=input.nextInt();
		
			}
		}
		
		
		
		
		for(int i = 0;i<a.length;i++) {
			for(int j=0; j <a.length;j++) {
				System.out.println(a[i][j]);
				
				
				
			}
		}
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		
		
	}

}

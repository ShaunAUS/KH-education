package kr.or.kh;

import java.util.Random;

public class RandomTest2 {
	public static void main(String[] args) {
		
		Random random1= new Random(5);
		Random random2= new Random(5);
		
		
		for(int i=0;i<9;i++) {								//i값이 없어도 그냥 반복 가능
			System.out.println("random1의 난수값:"+random1.nextInt());
	}
		System.out.println();
		System.out.println();
		for(int i=0;i<9;i++) {
			System.out.println("random2의 난수값:"+random2.nextInt());
		}
	}
}

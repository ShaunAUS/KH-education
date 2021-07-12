package kr.or.kh;

import java.util.Random;

public class RandomTest1 {
	public static void main(String[] args) {
		
		Random random = new Random();      //랜덤 객체 만들어야댐
		System.out.println("1부터 100까지의 난수:"+random.nextInt(101));
		System.out.println("1부터 50까지의 난수:"+random.nextInt(51));
		System.out.println("1터 20까지의 난수:"+random.nextInt(21));
		System.out.println("int형 전체범위의 난수발생:"+random.nextInt());
		System.out.println("double타입의 난수발생"+random.nextDouble());
	}
}

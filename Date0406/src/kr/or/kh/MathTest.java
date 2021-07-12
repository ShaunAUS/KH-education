package kr.or.kh;

public class MathTest {

	public static void main(String[] args) {
		
		System.out.println("1부터 100까지 난수 발생");				//   0.0~ 1.0    양옆으로 곱한다고 생각
		int num =(int)(Math.random()*100)+1;
		System.out.println("1부터 100사이의 숫자"+num);
		num=(int)(Math.random()*50)+1;
		System.out.println("1부터 50까지의 숫자"+num);
		
		num= (int)(Math.random()*20)+1;
		System.out.println("1부터 20까지의 숫자 ");

	}

}

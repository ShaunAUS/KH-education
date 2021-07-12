package kr.or.kh;

public class Aircon {
		//변수의 정의
		String company; //제조사
		String color;//색
		int price;//가격
		int size;//에어컨 크기
		int temp;//에어컨 온도
		
		
		//메소드 정의
		public void  powerOn() {
			System.out.println("전원 킴");
		}
		public void powerOff(){
			System.out.println("전원 끈다");
		}
		public void tempUp() {
			temp++;
		}public void tempDown() {
			temp--;
		}
		public static void main(String[] args) {
			Aircon glass= new Aircon();   						//메모리라는 기억공간에 생성
			glass.price=5000;
			glass.tempUp();
			glass.tempDown();
			System.out.println(glass.temp);
		}
}

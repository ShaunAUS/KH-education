package kr.or.oh;

public class IfDiceExample {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {                          //i 해당돼는게 없어도 그냥 반복 돌릴떄 사용
		int num = (int)(Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1번");
			
		}else if(num==2) {
			System.out.println("2번이 나왔다");
		}else if(num==3) {
			System.out.println("3번이 나왔다");
		}else if(num==4) {
			System.out.println("4번이 나왔다");
		}else if(num==5) {
			System.out.println("5번이 나왔다");
		}else if(num==6) {
			System.out.println("6번이 나왔다");
		}
		}
	
	}
}

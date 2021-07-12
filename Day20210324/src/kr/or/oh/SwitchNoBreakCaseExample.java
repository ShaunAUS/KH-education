package kr.or.oh;

public class SwitchNoBreakCaseExample {
			public static void main(String[] args) {
				
				
				int time= (int)(Math.random()*4)+8;
				System.out.println("[현재시간:"+time+"시]");
				switch(time) {
				case 8 :
					System.out.println("출근");
				case 9 :
					System.out.println("휴식");
				case 10 :
					System.out.println("회의");
				case 11 :
					System.out.println("업무");
				case 12 :
					System.out.println("외근");
				}
			}
			
}

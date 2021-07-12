package kr.or.oh;

public class BreakOuterExample {
	
	
				//break  vs break 이름    //292p
	public static void main(String[] args) {
		
		
		Outer: for(char upper='A';upper<='X';upper++) {
			
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
			if(lower=='g') {
				break Outer;    								//break 그냥쓰면  안쪽 for문만 탈출
		}
			
		 }
		}
		System.out.println("프로그램실행종료");
     }
 }
   

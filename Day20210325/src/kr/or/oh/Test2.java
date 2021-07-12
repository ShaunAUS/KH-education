package kr.or.oh;

public class Test2 {
	public static void main(String[] args) {
		
		
		//렬 줄이기   //렬 나중에 쓰기 기능
		int[][] khArray=new int[2][];
		
		khArray[0]=new int[2];
		khArray[1]=new int[1];
		System.out.println("숫자입력");
		khArray[0][0]=10;
		khArray[0][1]=20;
		khArray[1][0]=30;
		System.out.println(khArray[0][0]);
		System.out.println(khArray[0][1]);
		System.out.println(khArray[1][0]);
		System.out.println(khArray[1][1]);     					//0값이 아니라 오류
		
	}
}

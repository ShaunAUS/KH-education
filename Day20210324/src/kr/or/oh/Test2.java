package kr.or.oh;

public class Test2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {     					//x축 행
			for(int j=1;j<=5;j++){  					//y축 렬   j=i면 삼각형됀다
				System.out.print("*");
			}
			System.out.println();             //밖 for문 // 줄바꾸기
		}
	}

}

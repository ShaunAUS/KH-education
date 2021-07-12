package kr.or.oh;

public class Continue {

	public static void main(String[] args) {
				for(int i =1;i<=10;i++) {
						if(i%2!=0) { 			//짝수만 뽑기// 홀수는 continue로 출력 x
						continue;				// 증감식으론
			}
			System.out.println(i);
		}

	}

}

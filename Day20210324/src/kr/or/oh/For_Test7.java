package kr.or.oh;

public class For_Test7 {

	public static void main(String[] args) {
		
															//반복문 숫자말고 문자도 된다
		aaa:for(char c = 'A'; c<='C';c++) {
			
				for(int x=1;x<=3;x++) {
					if(x==2) continue;						//continue 실행되면 증가식으로 간다 //밑에꺼 수행 ㄴㄴ
					if(c=='B')continue aaa;
					System.out.println("c="+c+",x="+x);
			}
		}

	}

}

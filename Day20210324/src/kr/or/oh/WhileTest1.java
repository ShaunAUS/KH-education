package kr.or.oh;

public class WhileTest1 {

	public static void main(String[] args) {
		int sum=0;
		
		int i =1;
		while(i<=50) {                  //for문과 차이점= i초기화값, i++값 직접쓴다
			sum+=i;
			i++;
			
		}
		System.out.println("1부터 50까지 합은="+sum+"입니다");
		
	

	}

}

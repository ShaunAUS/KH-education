package kr.or.kh;

public class Operation_2 {

	public static void main(String[] args) {
		System.out.println("논리연산자 && 0 부터 9사이 숫자 범위 설정");
		int logic =5;
		int logic2= 10;
		String result= "";
		
		result=(logic>0 && logic2<9)?"0부터 9사이 범위":"0부터 9사이 범위 아니다";
		System.out.println(result);
		
		

	}

}

package kr.or.oh;

public class For_Test4 {

	public static void main(String[] args) {
		
		//짝수만 더하기
		int sum= 0;
		String exp="";
		for(int i=1;i<=10;i++) {
			if(i%2==0) { 								//2의 배수, 2 4 6 8 10
				sum+=i;									//sum=2, sum=6 ---
				exp+=(i==2)?""+i:"+"+i;					//처음값 + + + +
			}
		}
				System.out.println(exp+"="+sum);

	}

}

 package kr.or.oh;

public class For_Test2 {

	public static void main(String[] args) {
		int sum = 0;
		String exp="";
		
		for(int i=0;i<=5;i++) {
			sum+=i;										//sum=sum+i
			exp+=(i==0)?i:"+"+i;						//exp= exp+(i==0)?""+i:"+"+i;
														//exp=0
														//exp=0+1
	}
		System.out.println(exp+"="+sum);
}}


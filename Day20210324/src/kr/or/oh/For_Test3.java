package kr.or.oh;

public class For_Test3 {

	public static void main(String[] args) {
		
		
		int num =Integer.parseInt(args[0]);         		//변수선언
		int sum = 0;
		String exp = "";
		
		
		for(int i=num; i>=1;i--) {       
			sum+=i;						 		//sum=sum+i,  sum값 생성  //총합
		exp+=(i==num)?""+i:"+"+i;        	//exp=exp+(  )  , exp값 생성,  ----------------------왜 +i??????? i는 무조건 양수인데
											
		}
		System.out.println(exp+"="+sum);
	}

}

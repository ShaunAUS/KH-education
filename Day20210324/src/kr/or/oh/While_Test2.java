package kr.or.oh;

public class While_Test2 {

	public static void main(String[] args) {
		int sum= 0;
		int i =1;
		
		
		while(true) {
			sum+=i;
			i++;
			if(i==6) break;       //6번까지 돌아야 5번돈다
		}
		System.out.println("1부터 5까지합="+sum);
	}

}

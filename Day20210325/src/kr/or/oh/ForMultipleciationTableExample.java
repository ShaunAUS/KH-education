package kr.or.oh;

public class ForMultipleciationTableExample {

	public static void main(String[] args) {
		
		
		for(int m =2;m<=9;m++) {
			System.out.println("***"+m+"단***");
			for(int n=1;n<=9;n++) {
				System.out.print(m+"x"+n+"="+(m*n)+" ");				//print
			}
			System.out.println();
			
		}

	}

}

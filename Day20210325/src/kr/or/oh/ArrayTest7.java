package kr.or.oh;

public class ArrayTest7 {

	public static void main(String[] args) {
		
		//배열 초기화 안하면 기본적으로 0이다  //0으로 채워진걸 1로바꾸는거
			int[][] recArray=new int[5][5];
			for(int i = 0;i<recArray.length;i++) {
				for(int j=0;j<recArray[i].length;j++) {
					if(i==0||i==recArray.length-1||j==0||j==recArray[i].length-1) {
						recArray[i][j]=1;
					}
				}
			}
			
			
			
			for(int i=0;i<recArray.length;i++) {
				for(int j=0;j<recArray[i].length;j++) {
					System.out.print(recArray[i][j]+"");
					
				
				}
				System.out.println();
			}	
	}

}

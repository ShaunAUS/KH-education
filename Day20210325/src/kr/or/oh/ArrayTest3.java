package kr.or.oh;

public class ArrayTest3 {

	public static void main(String[] args) {
		int num=3;
		int[] array1= new int[3];
		
		for(int i=0;i<array1.length;i++) {
			array1[i]=num++;
			
		}
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}

	}

}

package kr.or.oh;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		
		String v1BinaryString = Integer.toBinaryString(10);  //-------------------------------
		System.out.println(v1BinaryString);
		
		
		
		//byte v1 = 10;
		//int v2 = -v1 +1; // -10이 v2에 저장
		//System.out.println(v2);

		
		
	}
	public static String toBinaryString(int value) {
		String str= Integer.toBinaryString(value);
		while(str.length()<32) {
			 str="0"+str;
		}
		return str;
	}
	
}

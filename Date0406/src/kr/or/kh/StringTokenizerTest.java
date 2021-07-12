package kr.or.kh;

import java.util.StringTokenizer;

public class StringTokenizerTest {
													//짜르기
	public static void main(String[] args) {
		//String의 split()
		
		// String text= 민재,두잉$두부&
		// string[] names= text.split(",|$|&")  == , $ & 뺴고 호출해서 배열에다 저장
		
		//StringTokenizer
		String source1= "111-111|강원도|춘천시|퇴꼐동";
		StringTokenizer st1 = new StringTokenizer(source1,"|");      		//구분자 | 을뺴고 나머지 // hasMoreTokens() 토큰 더잇는지 확인 다음 넥스트토큰
		
		
		String zip= st1.nextToken();										//토큰 가져오기
		String dou = st1.nextToken();
		String si = st1.nextToken();
		String dong = st1.nextToken();
		
		//출력
		System.out.println("우편번호:"+zip);
		System.out.println("도:"+dou);
		System.out.println("시:"+si);
		System.out.println("동:"+dong);
	}

}

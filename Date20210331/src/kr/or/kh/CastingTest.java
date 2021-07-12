package kr.or.kh;
public class CastingTest {

	public static void main(String[] args) {
		
		
		President president1=new President();
		
		Persoon persoon1= president1; //up casting//자동 형변환    // 측소//자식이 가지고있던 메소드 변수 사용 불가//부모꺼만
		
		
		
		President president2=(President)persoon1; //다운 캐스팅//확대//자식꺼 부모꺼 사용 가능
		
		Persoon persoon2 = new Persoon();
		
		President president3 = (President)persoon2;
		

	}

}

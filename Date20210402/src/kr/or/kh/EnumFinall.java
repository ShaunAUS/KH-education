package kr.or.kh;

public class EnumFinall {
	public static final String Male="MALE";
	public static final String FeMale="FEMALE";
	
	
	
	gender Gender;			//enum 형 객체생성
	
	
	gender Gender=gender.MALE;			//객체에 무슨값 있다고 쐐기 박기		//자료형.값
	gender Gender=gender.FEMALE;
	
	
	enum gender{
		MALE,FEMALE;
	}
}

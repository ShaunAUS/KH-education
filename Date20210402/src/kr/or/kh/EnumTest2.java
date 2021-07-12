package kr.or.kh;

// 특정값만 사용 해야된다면 열거형 enum
	
	SchoolType school;
	
	
	public Student1(SchoolType school) {
		this.school=school;
		
	}


enum SchoolType{								//schoolType= 자료형
	ELEMENTARY,MIDDLE,HIGH,UNIVERSITY;
}



// SchoolType school
//school= schoolType.ELEMENTARY						//자료형.값

//school= schoolType.MIDDLE


public class EnumTest2 {
	private void mani() {
		Student1 st1= new Student1(SchoolType.ELEMENTARY);
		Student1 st2= new Student1(SchoolType.MIDDLE);
		Student1 st3= new Student1(SchoolType.HIGH);
		Student1 st4= new Student1(SchoolType.UNIVERSITY);
		
		
		System.out.println("상수값을 출력한 경우");
		System.out.println("st1.school="+st1.school);
		
		
		if(st1.school==SchoolType.ELEMENTARY) {
			System.out.println("당신은 초딩");
		}if(st1.school==SchoolType.MIDDLE) {
			System.out.println("당신은 중딩");
		}if(st1.school==SchoolType.HIGH) {
			System.out.println("당신은 고딩");
		}if(st1.school==SchoolType.UNIVERSITY) {
			System.out.println("당신은 다핵생");
		}
		

	}
}

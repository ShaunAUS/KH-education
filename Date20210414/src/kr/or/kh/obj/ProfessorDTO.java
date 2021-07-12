package kr.or.kh.obj;

public class ProfessorDTO {
	public String age;
	public String irum;
	public String subject;
	public int no;
	public ProfessorDTO() {
		super();
		
	}
	public ProfessorDTO(String age, String irum, String subject, int no) {
		super();
		this.age = age;
		this.irum = irum;
		this.subject = subject;
		this.no = no;
	}
	
	
	public String getAge() {
		return age;
	}
	public void setAge() {
		 System.out.println("나이입력:");
			age = RegisterOld.input.next();
			if(age==null||age=="") {
				System.out.println("에러");
			}
	}
	
	public String getIrum() {
		return irum;
	}
	
	
	public void setIrum() {
		System.out.println("이름입력:");
		irum =RegisterOld.input.next();
		if(irum==null||irum=="") {
			System.out.println("에러");
		}
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject() {
		System.out.println("과목입력:");
		String subject = RegisterOld.input.next();
		if(subject==null||subject=="") {
			System.out.println("에러");
		}
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	
	@Override
	public String toString() {
		return "ProfessorDTO [age=" + age + ", irum=" + irum + ", subject=" + subject + ", no=" + no + "]";
	}
	  
}

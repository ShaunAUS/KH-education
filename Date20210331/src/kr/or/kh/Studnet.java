package kr.or.kh;

public class Studnet extends Persoon {
	private String schoolKind;
	private String grade;
	
	public Studnet() {
		this(null,null);
	}
	public Studnet(String schoolkind,String grade) {
		this.schoolKind=schoolKind;
		this.grade=grade;
	}
	public String getSchoolKind() {
		return schoolKind;
	}
	public void setSchoolKind(String schoolKind) {
		this.schoolKind = schoolKind;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public void showSleepStyle() {
		System.out.println("학생 수면시간 규칙적");
	}
	public void study() {
		System.out.println("공부를 한다");
	}
}

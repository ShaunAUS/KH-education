package kr.or.kh;

public class President extends Persoon {
	private int salary;
	private String nation;
	public President() {
		this(0,null);
	}
	public President(int salary, String nation) {
		this.salary=salary;
		this.nation=nation;
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	@Override
	public void showSleepStyle() {
		System.out.println("대통령 수면시간 부족");
	}
}

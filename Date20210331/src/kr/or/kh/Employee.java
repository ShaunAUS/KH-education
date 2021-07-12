package kr.or.kh;
public class Employee extends Persoon {
	
	private String department;
	int x;
	
	public Employee(int age, String name, String addr,int x) {
		this.department=department;
		this.x=x;
	}
	
	public Employee() {
		this(0,null,null,0);
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public void sleep() {
		System.out.println("직장인은 7시간잔다 ");
		
	}
	@Override
	public void showSleepStyle() {
		System.out.println("직장인 수면시간은 다양하다");
	}
	
}

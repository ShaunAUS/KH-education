package kr.or.kh;

public class OverridingTest {

	public static void main(String[] args) {
		
		Employee employee= new Employee();
		
		Persoon persoon=employee;
		
		System.out.println("employee="+employee.x);
		System.out.println("persoon.x="+persoon.x);
		employee.sleep();
		persoon.sleep();
	}

}

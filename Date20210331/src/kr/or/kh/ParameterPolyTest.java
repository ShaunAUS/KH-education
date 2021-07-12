package kr.or.kh;

public class ParameterPolyTest {

	public static void main(String[] args) {
		
		Persoon person=new Employee();
		Persoon person2=new Studnet();
		Persoon person3= new President();
		
		person.showSleepStyle();
		person2.showSleepStyle();
		person3.showSleepStyle();
				
				
		
		PersonInfo pf = new PersonInfo();
		Persoon person= new Persoon();
		Employee employee= new Employee();
		Studnet student=new Studnet();
		President president=new President();
		pf.showSleepType(person);
		pf.showSleepType(president);
		pf.showSleepType(employee);
		
	}

}

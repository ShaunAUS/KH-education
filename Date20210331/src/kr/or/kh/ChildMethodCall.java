package kr.or.kh;

public class ChildMethodCall {

	public static void main(String[] args) {
		Studnet student= new Studnet();
		Persoon person = (persoon)student;
		person.study();

	}

}

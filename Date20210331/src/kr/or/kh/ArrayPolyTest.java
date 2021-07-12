package kr.or.kh;

public class ArrayPolyTest {
		//배열 다형성
	public static void main(String[] args) {
		Persoon[] pArray= new Persoon[3];
		
		
		Employee employee= new Employee();
		Studnet student= new Studnet();
		President president= new President();
		
		
		
		pArray[0] = employee;				// = Persoon parray= new Employee();
		pArray[1]= student;
		pArray[2]=president;
		for(int i=0;i<pArray.length;i++) {
			pArray[i].showSleepStyle();
		}
	}

}

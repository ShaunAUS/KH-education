package kr.or.kh;


class Student3{
	String name;
	int number;
	public Student3(String name, int numver) {
		this.name=name;
		this.number=number;
	}
}
public class EqualsTest1 {
	public static void main(String[] args) {
		Student3 st1= new Student3("김민재",1);
		Student3 st2= new Student3("김민재",1);
		System.out.println("==으로 비교");
		System.out.println("st1==st2:"+(st1==st2));
		
		
		System.out.println("equals비교");		
		System.out.println("st1.equals(st2):"+(st1.equals(st2)));
	}
}

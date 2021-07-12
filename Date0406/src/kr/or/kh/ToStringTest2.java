package kr.or.kh;


class Student7{
	
	String name;
	int number;
	public Student7(String name, int number) {
		super();
		this.name=name;
		this.number=number;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Student7 st = null;
		if(obj instanceof Student7) {
			st=(Student7)obj;
		}
		return(st!=null&&name.equals(name)&&st.number==number);
	}
	
	
	@Override
	public String toString() {
		return "이름:"+name+"숫자:"+number;
	}
}

public class ToStringTest2 {

	
	
	
	public static void main(String[] args) {
		Student7 st1= new Student7("김민재",1);
		Student7 st2= new Student7("김두부",2);
		System.out.println(st1);
		System.out.println(st2.toString());
		System.out.println(st2);
	}

}

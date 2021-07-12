package kr.or.kh;

class Student5{
	String name;
	int number;
	
	
	public Student5(String name, int number) {
		super();
		this.name=name;
		this.number=number;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		Student5 st = null;
		if(obj instanceof Student5) {
			st=(Student5)obj;
		}
		return (st!=null&& name.equals(name)&&st.number==number);
	}
}
public class ToStringTest {

	
	
	public static void main(String[] args) {
		
		Student5 st1= new Student5("민재",1);
		Student5 st2= new Student5("김두부",2);
		System.out.println(st1);
		System.out.println(st2.toString());
	}

}

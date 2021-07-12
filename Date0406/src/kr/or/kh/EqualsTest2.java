package kr.or.kh;



class Student4{
	
	String name;
	
	int number;
	
	public Student4(String name,int number) {
		
		super();
		this.name=name;
		this.number=number;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		
		Student4 st = null;			//
		
		if(obj instanceof Student4) {
			st=(Student4)obj;
		}
		
		return (st !=null&& st.name.equals(name)&& st.number==number);
		
	}
}
public class EqualsTest2 {

	public static void main(String[] args) {
		Student4 st= new Student4("민재",1);	
		Student4 st2= new Student4("민재",1);
		
		System.out.println("==비교==");
		System.out.println("st1==st2:"+(st==st2));
		System.out.println("st1.equals(st2):"+(st.equals(st2)));
				
	}

}

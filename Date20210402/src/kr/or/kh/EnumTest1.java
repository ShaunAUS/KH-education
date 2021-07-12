package kr.or.kh;
			//ENUM
class Student{
	
	int school;
	
	
	public Student(int school) {
		this.school=school;
		
	}
	public static int ELEMENTARY=1;
	public static int MIDDLE=2;
	public static int HIGH=3;
	public static int UNIVERSITY=4;
}

public class EnumTest1 {

	public static void main(String[] args) {
		
			Student st1= new Student(1); //매개변수 숫자가능 but 가독성 떨어짐
			Student st2= new Student(Student.MIDDLE);    //static 이름으로 부를수잇닫
			Student st3= new Student(Student.HIGH);
			Student st4= new Student(Student.UNIVERSITY);
			System.out.println("상수값을 출력한 경우");
			System.out.println(":"+st1.school);
			System.out.println(":"+st2.school);
			System.out.println(":"+st3.school);
			System.out.println(":"+st4.school);
			if(st1.school==Student.ELEMENTARY) {
				System.out.println("당신은 초딩");
			}
			if(st2.school==Student.MIDDLE) {
				System.out.println("당신은 중학생입니다");
				
			}
			if(st3.school==Student.HIGH) {
				System.out.println("당신은 고등학생입니다");
				if(st4.school==Student.UNIVERSITY) {
					System.out.println("당신은 대학생");
				}
			}
			
	}

}

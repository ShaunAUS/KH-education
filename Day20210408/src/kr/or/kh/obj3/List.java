package kr.or.kh.obj3;


public class List {
   private String gubun;
   public List() {
	   
   }
   public void listDisplay(StudentDTO student) {
	   System.out.println("===전체출력====");
	   System.out.print("이름: " );
	   System.out.print(student.getIrum()+"\t");
	   System.out.print("나이: " );
	   System.out.print(student.getAge()+"\t");
	   System.out.print("학번: " );
	   System.out.print(student.getHakbun()+"\n");
	}
   public void listDisplay(ProfessorDTO professor) {
	   System.out.println("===전체출력====");
	   System.out.print("이름: " );
	   System.out.print(professor.getIrum()+"\t");
	   System.out.print("나이: " );
	   System.out.print(professor.getAge()+"\t");
	   System.out.print("과목: " );
	   System.out.print(professor.getSubject()+"\n");
	}
   public void listDisplay(ManagerDTO manager) {
	   System.out.println("===전체출력====");
	   System.out.print("이름: " );
	   System.out.print(manager.getIrum()+"\t");
	   System.out.print("나이: " );
	   System.out.print(manager.getAge()+"\t");
	   System.out.print("부서: " );
	   System.out.print(manager.getPart()+"\n");
	}
   public void list() {//전체출력의시작
	   for(int i=0;i<Register.studentList.size();i++) {
		   StudentDTO student = Register.studentList.get(i);
		   gubun=student.getGubun();
		   if(gubun.equals(student.getGubun())) {
			   listDisplay(student);
		   }
	   }
	   for(int i=0;i<Register.professorList.size();i++) {
		   ProfessorDTO professor = Register.professorList.get(i);
		   gubun = professor.getGubun();
		   if(gubun.equals(professor.getGubun())) {
			   listDisplay(professor);
		   }
	   }
	   for(int i=0;i<Register.managerList.size();i++) {
		   ManagerDTO manager = Register.managerList.get(i);
		   gubun= manager.getGubun();
		   if(gubun.equals(manager.getGubun())) {
			   listDisplay(manager);
		   }
	   }	  	
	  }//전체출력의끝
	
}
package kr.or.kh.obj7;


public class List extends Haksa implements IList{
   private String gubun;
   public List() {
	   
   }
   @Override
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
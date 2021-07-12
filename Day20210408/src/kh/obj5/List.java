package kh.obj5;


public class List {
   public Haksa haksa;
   public List() {
	   haksa = new Haksa();
   }
   
   public void list() {//전체출력의시작
	   for(int i=0;i<Haksa.studentList.size();i++) {
		   StudentDTO student = Haksa.studentList.get(i);
		   haksa.gubun=student.getGubun();
		   if(haksa.gubun.equals(student.getGubun())) {
			   haksa.listDisplay(student);
		   }
	   }
	   for(int i=0;i<Haksa.professorList.size();i++) {
		   ProfessorDTO professor = Haksa.professorList.get(i);
		   haksa.gubun = professor.getGubun();
		   if(haksa.gubun.equals(professor.getGubun())) {
			   haksa.listDisplay(professor);
		   }
	   }
	   for(int i=0;i<Haksa.managerList.size();i++) {
		   ManagerDTO manager = Haksa.managerList.get(i);
		   haksa.gubun= manager.getGubun();
		   if(haksa.gubun.equals(manager.getGubun())) {
			   haksa.listDisplay(manager);
		   }
	   }	  	
	  }//전체출력의끝
	
}
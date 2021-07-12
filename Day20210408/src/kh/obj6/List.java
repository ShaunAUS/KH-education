package kh.obj6;


public class List extends Haksa {
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

@Override
public void registerStudent() throws StudentHakbunException {
	// TODO Auto-generated method stub
	
}

@Override
public void registerProfessor() throws ProfessorSubjectException {
	// TODO Auto-generated method stub
	
}

@Override
public void registerManager() throws ManagerPartException {
	// TODO Auto-generated method stub
	
}

@Override
public void register() {
	// TODO Auto-generated method stub
	
}

@Override
public void search() {
	// TODO Auto-generated method stub
	
}

@Override
public void studentDelete(int i, StudentDTO student) {
	// TODO Auto-generated method stub
	
}

@Override
public void professorDelete(int i, ProfessorDTO professor) {
	// TODO Auto-generated method stub
	
}

@Override
public void managerDelete(int i, ManagerDTO manager) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete() {
	// TODO Auto-generated method stub
	
}
@Override
public void updateStudent(StudentDTO student, int i) {
	// TODO Auto-generated method stub
	
}
@Override
public void updateProfessor(ProfessorDTO professor, int i) {
	// TODO Auto-generated method stub
	
}
@Override
public void updateManager(ManagerDTO manager, int i) {
	// TODO Auto-generated method stub
	
}
@Override
public void update() {
	// TODO Auto-generated method stub
	
}
	
}
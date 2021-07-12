package kr.or.kh.obj7;

public class Delete extends Haksa implements IDelete {

	
	public Delete() {
		
	}
	
	@Override
	public void studentDelete(int i,StudentDTO student) {
		Register.studentList.remove(i);
	}
	@Override
	public void professorDelete(int i,ProfessorDTO professor) {
		Register.professorList.remove(i);
	}
	@Override
	public void managerDelete(int i,ManagerDTO manager) {
  		Register.managerList.remove(i);
	}
	@Override
	public void delete() {//삭제함수의시작
	  	try {
			deleteMenu();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		} catch (GubunException e) {
			e.printStackTrace();
		}
	  	for(int i=0;i<Register.studentList.size();i++) {
	  		StudentDTO student = Register.studentList.get(i);
	  		if(gubun.equals(student.getGubun())) {
	  			if(irum.equals(student.getIrum())) {
	  				studentDelete(i,student);
	  			}
	  		}
	  	}
	  	for(int i=0;i<Register.professorList.size();i++) {
	  		ProfessorDTO professor = Register.professorList.get(i);
	  		if(gubun.equals(professor.getGubun())) {
	  			if(irum.equals(professor.getIrum())) {
	  				professorDelete(i,professor);
	  			}
	  		}
	  	}
	  	for(int i=0;i<Register.managerList.size();i++) {
	  		ManagerDTO manager = Register.managerList.get(i);
	  		if(gubun.equals(manager.getGubun())) {
	  			if(irum.equals(manager.getIrum())) {
	  				managerDelete(i,manager);
	  			}
	  		}
	  	}	     
	    deleteDisplay();
	  }//삭제함수의끝
}

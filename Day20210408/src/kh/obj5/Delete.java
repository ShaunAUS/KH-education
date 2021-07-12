package kh.obj5;

public class Delete{
    public Haksa haksa;
	
	public Delete() {
		haksa = new Haksa();
	}
	
	public void studentDelete(int i,StudentDTO student) {
		Haksa.studentList.remove(i);
	}
	public void professorDelete(int i,ProfessorDTO professor) {
		Haksa.professorList.remove(i);
	}
	public void managerDelete(int i,ManagerDTO manager) {
  		Haksa.managerList.remove(i);
	}
	
	public void delete() {//삭제함수의시작
	  	try {
			haksa.deleteMenu();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		} catch (GubunException e) {
			e.printStackTrace();
		}
	  	for(int i=0;i<Haksa.studentList.size();i++) {
	  		StudentDTO student = Haksa.studentList.get(i);
	  		if(haksa.gubun.equals(student.getGubun())) {
	  			if(haksa.irum.equals(student.getIrum())) {
	  				studentDelete(i,student);
	  			}
	  		}
	  	}
	  	for(int i=0;i<Haksa.professorList.size();i++) {
	  		ProfessorDTO professor = Haksa.professorList.get(i);
	  		if(haksa.gubun.equals(professor.getGubun())) {
	  			if(haksa.irum.equals(professor.getIrum())) {
	  				professorDelete(i,professor);
	  			}
	  		}
	  	}
	  	for(int i=0;i<Haksa.managerList.size();i++) {
	  		ManagerDTO manager = Haksa.managerList.get(i);
	  		if(haksa.gubun.equals(manager.getGubun())) {
	  			if(haksa.irum.equals(manager.getIrum())) {
	  				managerDelete(i,manager);
	  			}
	  		}
	  	}	     
	    haksa.deleteDisplay();
	  }//삭제함수의끝
}

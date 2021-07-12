package kr.or.kh.obj2;

public class Delete {
	private String irum;
	private String gubun;
	
	public Delete() {
		
	}
	public void deleteMenu() {
		System.out.println("삭제할사람의 이름을 입력해 주세요.");
	  	System.out.print("이름 : ");	  	
	  	irum = Register.input.next();
	  	System.out.println("학생,교수,관리자,중삭제할문자열을입력하세요");
	  	gubun = Register.input.next();
	  	if(gubun==null||gubun=="") {
	  		System.out.println("에러");
	  	}
	}
	public void studentDelete(int i,StudentDTO student) {
		Register.studentList.remove(i);
	}
	public void professorDelete(int i,ProfessorDTO professor) {
		Register.professorList.remove(i);
	}
	public void managerDelete(int i,ManagerDTO manager) {
  		Register.managerList.remove(i);
	}
	public void deleteDisplay() {
		 System.out.println(irum+"님삭제하였습니다.");
	}
	public void delete() {//삭제함수의시작
	  	deleteMenu();
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

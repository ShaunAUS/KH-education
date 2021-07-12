package kh.obj5;


public class Register {
	public Haksa haksa;
	public StudentDTO student;
	
	public Register() {
		haksa = new Haksa();
		student = new StudentDTO();
	}
	
	
	public void registerStudent()throws StudentHakbunException {
		StudentDTO student = new StudentDTO();  					
				try {
					haksa.registerAgeIrum(student);
				} catch (HaksaNaiException e) {
					e.printStackTrace();
				} catch (HaksaIrumException e) {
					e.printStackTrace();
				}		
  		haksa.studentHakbun();
  		student.setAge(haksa.age);
  		student.setIrum(haksa.irum);
  		student.setHakbun(haksa.hakbun);
  		student.setGubun("학생");
  		Haksa.studentList.add(student);
	}
	
	public void registerProfessor()throws ProfessorSubjectException {
		ProfessorDTO professor = new ProfessorDTO();
		try {
			haksa.registerAgeIrum(professor);
		} catch (HaksaNaiException e) {
			e.printStackTrace();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		}		
		haksa.professorSubject();
  		professor.setAge(haksa.age);
  		professor.setIrum(haksa.irum);
  		professor.setSubject(haksa.subject);
  		professor.setGubun("교수");
  		Haksa.professorList.add(professor);
	}
	
	public void registerManager() throws ManagerPartException {
		ManagerDTO manager = new ManagerDTO();
  		try {
			haksa.registerAgeIrum(manager);
		} catch (HaksaNaiException e) {
			e.printStackTrace();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		}
  		haksa.managerPart();
  		manager.setAge(haksa.age);
  		manager.setIrum(haksa.irum);
  		manager.setPart(haksa.part);
  		manager.setGubun("관리자");
  		Haksa.managerList.add(manager);
	}
	public void register() {//등록함수
		try {
			haksa.registerMenu();
		} catch (HaksaMenuException e1) {
			e1.printStackTrace();
		}
	  	if(haksa.cnt==1) {//학생시작
	  		try {
				registerStudent();
			} catch (StudentHakbunException e) {
				e.printStackTrace();
			}
	  		haksa.registerDisplay(1);
	  		       	
	  	}//학생의끝
	  	else if(haksa.cnt==2) {//교수의시작
	  		try {
				registerProfessor();
			} catch (ProfessorSubjectException e) {
				e.printStackTrace();
			}
	  		haksa.registerDisplay(2);  	
	  	}//교수의끝
	  	else if(haksa.cnt==3) {//관리자의시작
	  		try {
				registerManager();
			} catch (ManagerPartException e) {
				e.printStackTrace();
			}
	  		haksa.registerDisplay(3);	  		
	  	}//관리자의끝 
	}    
}


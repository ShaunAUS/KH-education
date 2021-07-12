package kh.obj6;


public class Register extends Haksa {
	
	public Register() {
		
	}
	
	@Override
	public void registerStudent()throws StudentHakbunException {
		StudentDTO student = new StudentDTO();  					
				try {
					registerAgeIrum(student);
				} catch (HaksaNaiException e) {
					e.printStackTrace();
				} catch (HaksaIrumException e) {
					e.printStackTrace();
				}		
  		studentHakbun();
  		student.setAge(age);
  		student.setIrum(irum);
  		student.setHakbun(hakbun);
  		student.setGubun("학생");
  		studentList.add(student);
	}
	@Override
	public void registerProfessor()throws ProfessorSubjectException {
		ProfessorDTO professor = new ProfessorDTO();
		try {
			registerAgeIrum(professor);
		} catch (HaksaNaiException e) {
			e.printStackTrace();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		}		
		professorSubject();
  		professor.setAge(age);
  		professor.setIrum(irum);
  		professor.setSubject(subject);
  		professor.setGubun("교수");
  		professorList.add(professor);
	}
	
	@Override
	public void registerManager() throws ManagerPartException {
		ManagerDTO manager = new ManagerDTO();
  		try {
			registerAgeIrum(manager);
		} catch (HaksaNaiException e) {
			e.printStackTrace();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		}
  		managerPart();
  		manager.setAge(age);
  		manager.setIrum(irum);
  		manager.setPart(part);
  		manager.setGubun("관리자");
  		managerList.add(manager);
	}
	@Override
	public void register() {//등록함수
		try {
			registerMenu();
		} catch (HaksaMenuException e1) {
			e1.printStackTrace();
		}
	  	if(cnt==1) {//학생시작
	  		try {
				registerStudent();
			} catch (StudentHakbunException e) {
				e.printStackTrace();
			}
	  		registerDisplay(1);
	  		       	
	  	}//학생의끝
	  	else if(cnt==2) {//교수의시작
	  		try {
				registerProfessor();
			} catch (ProfessorSubjectException e) {
				e.printStackTrace();
			}
	  		registerDisplay(2);  	
	  	}//교수의끝
	  	else if(cnt==3) {//관리자의시작
	  		try {
				registerManager();
			} catch (ManagerPartException e) {
				e.printStackTrace();
			}
	  		registerDisplay(3);	  		
	  	}//관리자의끝 
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
	public void list() {
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


package kr.or.kh.obj4;

public class Update extends Haksa {
     
   public Update() {
	   
   }

    
   public void updateStudent(StudentDTO student,int i) {
   	        student.setAge(age);
   	        student.setIrum(irum);
   	        student.setHakbun(hakbun);
			student.setGubun("학생");
			Register.studentList.set(i, student);
   }
   
   public void updateProfessor(ProfessorDTO professor,int i) {
   	    professor.setAge(age);
   	    professor.setIrum(irum);
   	    professor.setSubject(subject);
		professor.setGubun("교수");
		Register.professorList.set(i, professor);
   }
   
   public void updateManager(ManagerDTO manager,int i) {
   	        manager.setAge(age);
   	        manager.setIrum(irum);
   	        manager.setPart(part);
			manager.setGubun("관리자");
		    Register.managerList.set(i, manager);
   }
   public void update() {//수정의시작
        try {
			updateMenu();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		} catch (GubunException e) {
			e.printStackTrace();
		}
        for(int i=0;i<Register.studentList.size();i++) {
        	StudentDTO student = Register.studentList.get(i);
        	if(gubun.equals(student.getGubun())) {
        		if(irum.equals(student.getIrum())) {
        			updateConfirmDisplay(student);
        			try {
						updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
        			if(commit.equals("yes")||commit.equals("YES")) {
        				student = new StudentDTO();
        				try {
							updateRegister(1);
						} catch (StudentHakbunException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagerPartException e) {
							e.printStackTrace();
						}
        				updateStudent(student,i);
        				updateDisplay(1);
        			}
        		}
        	}
        }
        for(int i=0;i<Register.professorList.size();i++) {
        	ProfessorDTO professor = Register.professorList.get(i);
        	if(gubun.equals(professor.getGubun())) {
        		if(irum.equals(professor.getIrum())) {
        			updateConfirmDisplay(professor);
        			try {
						updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
        			if(commit.equals("yes")||commit.equals("YES")) {
        				professor = new ProfessorDTO();
        				try {
							updateRegister(2);
						} catch (StudentHakbunException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagerPartException e) {
							e.printStackTrace();
						}
        				updateProfessor(professor,i);
        				updateDisplay(2);
        			}
        		}
        	}
        }
        for(int i=0;i<Register.managerList.size();i++) {
        	ManagerDTO manager = Register.managerList.get(i);
        	if(gubun.equals(manager.getGubun())) {
        		if(irum.equals(manager.getIrum())) {
        			updateConfirmDisplay(manager);
        			try {
						updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
        			if(commit.equals("yes")||commit.equals("YES")) {
        				manager = new ManagerDTO();
        				try {
							updateRegister(3);
						} catch (StudentHakbunException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagerPartException e) {
							e.printStackTrace();
						}
        				updateManager(manager,i);
        				updateDisplay(3);
        			}
        			
        		}
        	}
        }
	  	
	  }//수정의끝
}

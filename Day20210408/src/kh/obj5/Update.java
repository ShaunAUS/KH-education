package kh.obj5;

public class Update {
     public Haksa haksa;
   public Update() {
	   haksa = new Haksa();
   }

    
   public void updateStudent(StudentDTO student,int i) {
   	        student.setAge(haksa.age);
   	        student.setIrum(haksa.irum);
   	        student.setHakbun(haksa.hakbun);
			student.setGubun("학생");
			Haksa.studentList.set(i, student);
   }
   
   public void updateProfessor(ProfessorDTO professor,int i) {
   	    professor.setAge(haksa.age);
   	    professor.setIrum(haksa.irum);
   	    professor.setSubject(haksa.subject);
		professor.setGubun("교수");
		Haksa.professorList.set(i, professor);
   }
   
   public void updateManager(ManagerDTO manager,int i) {
   	        manager.setAge(haksa.age);
   	        manager.setIrum(haksa.irum);
   	        manager.setPart(haksa.part);
			manager.setGubun("관리자");
		    Haksa.managerList.set(i, manager);
   }
   public void update() {//수정의시작
        try {
			haksa.updateMenu();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		} catch (GubunException e) {
			e.printStackTrace();
		}
        for(int i=0;i<Haksa.studentList.size();i++) {
        	StudentDTO student = Haksa.studentList.get(i);
        	if(haksa.gubun.equals(student.getGubun())) {
        		if(haksa.irum.equals(student.getIrum())) {
        			haksa.updateConfirmDisplay(student);
        			try {
						haksa.updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
        			if(haksa.commit.equals("yes")||haksa.commit.equals("YES")) {
        				student = new StudentDTO();
        				try {
							haksa.updateRegister(1);
						} catch (StudentHakbunException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagerPartException e) {
							e.printStackTrace();
						}
        				updateStudent(student,i);
        				haksa.updateDisplay(1);
        			}
        		}
        	}
        }
        for(int i=0;i<Haksa.professorList.size();i++) {
        	ProfessorDTO professor = Haksa.professorList.get(i);
        	if(haksa.gubun.equals(professor.getGubun())) {
        		if(haksa.irum.equals(professor.getIrum())) {
        			haksa.updateConfirmDisplay(professor);
        			try {
						haksa.updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
        			if(haksa.commit.equals("yes")||haksa.commit.equals("YES")) {
        				professor = new ProfessorDTO();
        				try {
							haksa.updateRegister(2);
						} catch (StudentHakbunException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagerPartException e) {
							e.printStackTrace();
						}
        				updateProfessor(professor,i);
        				haksa.updateDisplay(2);
        			}
        		}
        	}
        }
        for(int i=0;i<Haksa.managerList.size();i++) {
        	ManagerDTO manager = Haksa.managerList.get(i);
        	if(haksa.gubun.equals(manager.getGubun())) {
        		if(haksa.irum.equals(manager.getIrum())) {
        			haksa.updateConfirmDisplay(manager);
        			try {
						haksa.updateConfirmMenu();
					} catch (CommitException e) {
						e.printStackTrace();
					}
        			if(haksa.commit.equals("yes")||haksa.commit.equals("YES")) {
        				manager = new ManagerDTO();
        				try {
							haksa.updateRegister(3);
						} catch (StudentHakbunException e) {
							e.printStackTrace();
						} catch (ProfessorSubjectException e) {
							e.printStackTrace();
						} catch (ManagerPartException e) {
							e.printStackTrace();
						}
        				updateManager(manager,i);
        				haksa.updateDisplay(3);
        			}
        			
        		}
        	}
        }
	  	
	  }//수정의끝
}

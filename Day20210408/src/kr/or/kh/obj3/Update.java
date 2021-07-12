package kr.or.kh.obj3;

public class Update {
   private String irum;
   private String gubun;
   private String commit;
   private String age;
   private String hakbun;
   private String subject;
   private String part;
   
   public Update() {
	   
   }
	
   public void updateMenu() throws HaksaIrumException,GubunException {
		System.out.println("수정할이름을입력하세요.");
	  	System.out.println("이름:");
	  	irum = Register.input.next();
	  	if(irum==null||irum=="") {
	  		throw new HaksaIrumException("수정할이름이null이거나공백입니다.");
	  	}
		System.out.println("학생,교수,관리자,중수정할문자열을입력하세요");
	  	gubun = Register.input.next();
	  	if(gubun==null||gubun=="") {
	  		throw new GubunException("수정 학생,교수,관리자중에입력하세요");
	  	}
	}
   public void updateConfirmDisplay(StudentDTO student) {
	    System.out.print("나이:"+student.getAge()+"\t");
		System.out.print("이름:"+student.getIrum()+"\t");
		System.out.print("학번:"+student.getHakbun()+"\n");
	}
   public void updateConfirmDisplay(ProfessorDTO professor) {
	    System.out.print("나이:"+professor.getAge()+"\t");
		System.out.print("이름:"+professor.getIrum()+"\t");
		System.out.print("과목:"+professor.getSubject()+"\n");
	}
   public void updateConfirmDisplay(ManagerDTO manager) {
	    System.out.print("나이:"+manager.getAge()+"\t");
		System.out.print("이름:"+manager.getIrum()+"\t");
		System.out.print("부서:"+manager.getPart()+"\n");
	}
   
   public void updateConfirmMenu() throws CommitException {
		System.out.println("변경하기전내용입니다.수정할까요yes/no");
		commit = Register.input.next();
		if(commit==null||commit=="") {
			throw new CommitException("최종수정yes와no중입력하세요");
		}
	}
   public void updateNaiIrum()throws HaksaIrumException,HaksaNaiException {
	   System.out.println("나이:");
		  age = Register.input.next();
		  if(age==null||age=="") {
			  throw new HaksaNaiException("나이가null이거나공백입니다.");
		  }
		  System.out.println("이름:");
		  irum = Register.input.next();
		  if(irum==null||irum=="") {
			  throw new HaksaIrumException("이름이null이거나공백입니다.");
		  }
   }
   public void updateRegister(int cnt)throws StudentHakbunException,ProfessorSubjectException,ManagerPartException {
	    if(cnt==1) {
	      try {
			updateNaiIrum();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		} catch (HaksaNaiException e) {
			e.printStackTrace();
		}
		  System.out.println("학번:");
		  hakbun = Register.input.next();
		  if(hakbun==null||hakbun=="") {
			  throw new StudentHakbunException("학번이null이거나공백입니다.");
		  }
	    }else if(cnt==2) {
	      try {
			updateNaiIrum();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		} catch (HaksaNaiException e) {			
			e.printStackTrace();
		}
		  System.out.println("과목:");
		  subject = Register.input.next();
		  if(subject==null||subject=="") {
			  throw new ProfessorSubjectException("과목이null이거나공백입니다.");
		  }
	    }
	    else if(cnt==3) {
	            try {
					updateNaiIrum();
				} catch (HaksaIrumException e) {
					e.printStackTrace();
				} catch (HaksaNaiException e) {
					e.printStackTrace();
				}
				System.out.println("부서:");
				part = Register.input.next();
				if(part==null||part=="") {
					throw new ManagerPartException("부서가null이거나공백입니다.");
				}
	    }
}
   public void updateDisplay(int cnt) {
		if(cnt==1) {
		System.out.println("학생이수정되었습니다.");
		}else if(cnt==2) {
	    System.out.println("교수님수정되었습니다.");	
		}else if(cnt==3) {
		System.out.println("관리자님수정되었습니다.");
		}
		
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

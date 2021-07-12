package kr.or.kh.obj2;



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
	
   public void updateMenu() {
		System.out.println("수정할이름을입력하세요.");
	  	System.out.println("이름:");
	  	irum = Register.input.next();
	  	if(irum==null||irum=="") {
	  		System.out.println("error");
	  	}
		System.out.println("학생,교수,관리자,중수정할문자열을입력하세요");
	  	gubun = Register.input.next();
	  	if(gubun==null||gubun=="") {
	  		System.out.println("에러");
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
   
   public void updateConfirmMenu() {
		System.out.println("변경하기전내용입니다.수정할까요yes/no");
		commit = Register.input.next();
		if(commit==null||commit=="") {
			System.out.println("error");
		}
	}
   public void updateNaiIrum() {
	   System.out.println("나이:");
		  age = Register.input.next();
		  if(age==null||age=="") {
			  System.out.println("error");
		  }
		  System.out.println("이름:");
		  irum = Register.input.next();
		  if(irum==null||irum=="") {
			  System.out.println("error");
		  }
   }
   public void updateRegister(int cnt) {
	    if(cnt==1) {
	      updateNaiIrum();
		  System.out.println("학번:");
		  hakbun = Register.input.next();
		  if(hakbun==null||hakbun=="") {
			  System.out.println("error");
		  }
	    }else if(cnt==2) {
	      updateNaiIrum();
		  System.out.println("과목:");
		  subject = Register.input.next();
		  if(subject==null||subject=="") {
			  System.out.println("error");
		  }
	    }
	    else if(cnt==3) {
	            updateNaiIrum();
				System.out.println("부서:");
				part = Register.input.next();
				if(part==null||part=="") {
					System.out.println("error");
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
        updateMenu();
        for(int i=0;i<Register.studentList.size();i++) {
        	StudentDTO student = Register.studentList.get(i);
        	if(gubun.equals(student.getGubun())) {
        		if(irum.equals(student.getIrum())) {
        			updateConfirmDisplay(student);
        			updateConfirmMenu();
        			if(commit.equals("yes")||commit.equals("YES")) {
        				student = new StudentDTO();
        				updateRegister(1);
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
        			updateConfirmMenu();
        			if(commit.equals("yes")||commit.equals("YES")) {
        				professor = new ProfessorDTO();
        				updateRegister(2);
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
        			updateConfirmMenu();
        			if(commit.equals("yes")||commit.equals("YES")) {
        				manager = new ManagerDTO();
        				updateRegister(3);
        				updateManager(manager,i);
        				updateDisplay(3);
        			}
        			
        		}
        	}
        }
	  	
	  }//수정의끝
}

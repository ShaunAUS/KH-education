package kh.obj5;

import java.util.ArrayList;
import java.util.Scanner;

public class Haksa {
	public int cnt;	
	public String age;
	public String irum;
	public String hakbun;
	public String subject;
	public String part;
	public String gubun;
	public String irumSearch;
	public String commit;
	public static Scanner input;	
	public static ArrayList<StudentDTO> studentList;
	public static ArrayList<ProfessorDTO> professorList;
	public static ArrayList<ManagerDTO> managerList;
	public Haksa() {
		
	}
	static {
		input = new Scanner(System.in);
		studentList = new ArrayList<StudentDTO>();
		professorList = new ArrayList<ProfessorDTO>();
		managerList = new ArrayList<ManagerDTO>();
	}
	public void registerAgeIrum(StudentDTO student)throws HaksaNaiException,HaksaIrumException {
		System.out.println("나이:");
		age = input.next();
  		if(age==null||age=="") {
   			throw new HaksaNaiException("학생나이가null이거나공백입니다.");
   		}
  		System.out.println("이름:");
  		irum = input.next();
  		if(irum==null||irum=="") {
   			throw new HaksaIrumException("학생이름이null이거나공백입니다.");
   		}
	}
	public void registerAgeIrum(ProfessorDTO professor)throws HaksaNaiException,HaksaIrumException {
		System.out.println("나이:");
		age = input.next();		
  		if(age==null||age=="") {
   			throw new HaksaNaiException("교수나이가null이거나공백입니다.");
   		}
  		System.out.println("이름:");
  		irum=input.next();
  		if(irum==null||irum=="") {
   			throw new HaksaIrumException("교수의이름이null이거나공백입니다.");
   		}
	}
	public void registerAgeIrum(ManagerDTO manager)throws HaksaNaiException,HaksaIrumException {
		System.out.println("나이:");
		age = input.next();
  		if(age==null||age=="") {
   			throw new HaksaNaiException("관리자나이가null이거나공백입니다.");
   		}
  		System.out.println("이름:");
  		irum = input.next();
  		if(irum==null||irum=="") {
   			throw new HaksaIrumException("관리자이름이null이거나공백입니다.");
   		}
	}
	public void registerDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("학생이등록되었습니다.");
		}else if(cnt==2) {
			System.out.println("교수님이등록되었습니다.");
		}else if(cnt==3) {
			System.out.println("관리자님이등록되었습니다.");
		}
	}
	public void studentHakbun()throws StudentHakbunException {
		System.out.println("학번:");
  		hakbun = input.next();   
  		if(hakbun==null||hakbun=="") {
   			throw new StudentHakbunException("학생의학번이null이거나공백입니다.");
   		}
	}
	public void professorSubject()throws ProfessorSubjectException {
		System.out.println("과목:");
  		subject = input.next();
  		if(subject==null||subject=="") {
  			throw new ProfessorSubjectException("교수의과목이null이거나공백입니다.");
  		}
	}
	public void registerMenu()throws HaksaMenuException{
		//등록의시작
	  	System.out.println("등록");
	  	System.out.println("=======메뉴 선택======");
	  	System.out.println("1.학생");
	  	System.out.println("2.교수");
	  	System.out.println("3.관리자");
	  	System.out.println("4.이전메뉴");
	  	System.out.println("번호를 선택해 주세요..");
	  	cnt = input.nextInt();
	  	if(cnt<0||cnt>4) {
	   		throw new HaksaMenuException("등록메뉴에서번호가음수이거나4이상숫자를입력하지마세요");	   		
	   	}
	}
	public void managerPart()throws ManagerPartException {
		System.out.println("부서:");
  		part = input.next();
  		if(part==null||part=="") {
  			throw new ManagerPartException("관리자부서가null이거나공백입니다.");
  		}
	}
	public void searchMenu()throws GubunException,HaksaIrumException {
		System.out.println("찾을이름을 입력해주세요.");
    	System.out.println("이름:");
    	irumSearch = input.next();
    	if(irumSearch==null||irumSearch=="") {
    		throw new HaksaIrumException("이름검색에서null이거나공백입니다.");
    	}
    	System.out.println("학생,교수,관리자,중찾는문자열을입력하세요");
    	gubun = input.next();
    	if(gubun==null||gubun=="") {
    		throw new GubunException("학생교수관리자중입력하세요");
    	}
    	
	}
	public void searchDisplay(StudentDTO student) {		
		System.out.print("나이:"+student.getAge()+"\t");
		System.out.print("이름:"+student.getIrum()+"\t");
		System.out.print("학번:"+student.getHakbun()+"\n");
	
	}
	public void searchDisplay(ProfessorDTO professor) {		
	System.out.print("나이:"+professor.getAge()+"\t");
	System.out.print("이름:"+professor.getIrum()+"\t");
	System.out.print("과목:"+professor.getSubject()+"\n");

	} 
	public void searchDisplay(ManagerDTO manager) {		
	System.out.print("나이:"+manager.getAge()+"\t");
	System.out.print("이름:"+manager.getIrum()+"\t");
	System.out.print("부서:"+manager.getPart()+"\n");

	}
	public void deleteMenu() throws HaksaIrumException,GubunException{
		System.out.println("삭제할사람의 이름을 입력해 주세요.");
	  	System.out.print("이름 : ");	  	
	  	irum = input.next();
	  	if(irum==null||irum=="") {
	  		throw new HaksaIrumException("삭제할이름이null이거나공백입니다.");
	  	}
	  	System.out.println("학생,교수,관리자,중삭제할문자열을입력하세요");
	  	gubun = input.next();
	  	if(gubun==null||gubun=="") {
	  		throw new GubunException("삭제학생,교수,관리자중에입력하세요");
	  	}
	}
	public void deleteDisplay() {
		 System.out.println(irum+"님삭제하였습니다.");
	}
	public void listDisplay(StudentDTO student) {
		   System.out.println("===전체출력====");
		   System.out.print("이름: " );
		   System.out.print(student.getIrum()+"\t");
		   System.out.print("나이: " );
		   System.out.print(student.getAge()+"\t");
		   System.out.print("학번: " );
		   System.out.print(student.getHakbun()+"\n");
		}
	   public void listDisplay(ProfessorDTO professor) {
		   System.out.println("===전체출력====");
		   System.out.print("이름: " );
		   System.out.print(professor.getIrum()+"\t");
		   System.out.print("나이: " );
		   System.out.print(professor.getAge()+"\t");
		   System.out.print("과목: " );
		   System.out.print(professor.getSubject()+"\n");
		}
	   public void listDisplay(ManagerDTO manager) {
		   System.out.println("===전체출력====");
		   System.out.print("이름: " );
		   System.out.print(manager.getIrum()+"\t");
		   System.out.print("나이: " );
		   System.out.print(manager.getAge()+"\t");
		   System.out.print("부서: " );
		   System.out.print(manager.getPart()+"\n");
		}
	   public void updateMenu() throws HaksaIrumException,GubunException {
			System.out.println("수정할이름을입력하세요.");
		  	System.out.println("이름:");
		  	irum = input.next();
		  	if(irum==null||irum=="") {
		  		throw new HaksaIrumException("수정할이름이null이거나공백입니다.");
		  	}
			System.out.println("학생,교수,관리자,중수정할문자열을입력하세요");
		  	gubun = input.next();
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
			commit = input.next();
			if(commit==null||commit=="") {
				throw new CommitException("최종수정yes와no중입력하세요");
			}
		}
	   public void updateNaiIrum()throws HaksaIrumException,HaksaNaiException {
		   System.out.println("나이:");
			  age = input.next();
			  if(age==null||age=="") {
				  throw new HaksaNaiException("나이가null이거나공백입니다.");
			  }
			  System.out.println("이름:");
			  irum = input.next();
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
		      studentHakbun();			  
		    }else if(cnt==2) {
		      try {
				updateNaiIrum();
			} catch (HaksaIrumException e) {
				e.printStackTrace();
			} catch (HaksaNaiException e) {			
				e.printStackTrace();
			}
			  professorSubject();
		    }
		    else if(cnt==3) {
		            try {
						updateNaiIrum();
					} catch (HaksaIrumException e) {
						e.printStackTrace();
					} catch (HaksaNaiException e) {
						e.printStackTrace();
					}
			  managerPart();
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
}

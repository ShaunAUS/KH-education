package kr.or.kh.obj3;

import java.util.ArrayList;
import java.util.Scanner;


public class Register {
	private int cnt;	
	private String age;
	private String irum;
	private String hakbun;
	private String subject;
	private String part;
	public static Scanner input;	
	public static ArrayList<StudentDTO> studentList;
	public static ArrayList<ProfessorDTO> professorList;
	public static ArrayList<ManagerDTO> managerList;
	public Register() {
		
	}
	static {
		input = new Scanner(System.in);
		studentList = new ArrayList<StudentDTO>();
		professorList = new ArrayList<ProfessorDTO>();
		managerList = new ArrayList<ManagerDTO>();
	}
	
	public void registerStudent()throws StudentHakbunException {
		StudentDTO student = new StudentDTO();  					
				try {
					registerAgeIrum(student);
				} catch (HaksaNaiException e) {
					e.printStackTrace();
				} catch (HaksaIrumException e) {
					e.printStackTrace();
				}
			
		
  		System.out.println("학번:");
  		hakbun = Register.input.next();   
  		if(hakbun==null||hakbun=="") {
   			throw new StudentHakbunException("학생의학번이null이거나공백입니다.");
   		}
  		student.setAge(age);
  		student.setIrum(irum);
  		student.setHakbun(hakbun);
  		student.setGubun("학생");
  		studentList.add(student);
	}
	public void registerAgeIrum(StudentDTO student)throws HaksaNaiException,HaksaIrumException {
		System.out.println("나이:");
		age = Register.input.next();
  		if(age==null||age=="") {
   			throw new HaksaNaiException("학생나이가null이거나공백입니다.");
   		}
  		System.out.println("이름:");
  		irum = Register.input.next();
  		if(irum==null||irum=="") {
   			throw new HaksaIrumException("학생이름이null이거나공백입니다.");
   		}
	}
	public void registerAgeIrum(ProfessorDTO professor)throws HaksaNaiException,HaksaIrumException {
		System.out.println("나이:");
		age = Register.input.next();		
  		if(age==null||age=="") {
   			throw new HaksaNaiException("교수나이가null이거나공백입니다.");
   		}
  		System.out.println("이름:");
  		irum=Register.input.next();
  		if(irum==null||irum=="") {
   			throw new HaksaIrumException("교수의이름이null이거나공백입니다.");
   		}
	}
	public void registerAgeIrum(ManagerDTO manager)throws HaksaNaiException,HaksaIrumException {
		System.out.println("나이:");
		age = Register.input.next();
  		if(age==null||age=="") {
   			throw new HaksaNaiException("관리자나이가null이거나공백입니다.");
   		}
  		System.out.println("이름:");
  		irum = Register.input.next();
  		if(irum==null||irum=="") {
   			throw new HaksaIrumException("관리자이름이null이거나공백입니다.");
   		}
	}
	public void registerProfessor()throws ProfessorSubjectException {
		ProfessorDTO professor = new ProfessorDTO();
		try {
			registerAgeIrum(professor);
		} catch (HaksaNaiException e) {
			e.printStackTrace();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		}
		
		System.out.println("과목:");
  		subject = Register.input.next();
  		if(subject==null||subject=="") {
  			throw new ProfessorSubjectException("교수의과목이null이거나공백입니다.");
  		}
  		professor.setAge(age);
  		professor.setIrum(irum);
  		professor.setSubject(subject);
  		professor.setGubun("교수");
  		professorList.add(professor);
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
	  	cnt = Register.input.nextInt();
	  	if(cnt<0||cnt>4) {
	   		throw new HaksaMenuException("등록메뉴에서번호가음수이거나4이상숫자를입력하지마세요");	   		
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
	public void registerManager() throws ManagerPartException {
		ManagerDTO manager = new ManagerDTO();
  		try {
			registerAgeIrum(manager);
		} catch (HaksaNaiException e) {
			e.printStackTrace();
		} catch (HaksaIrumException e) {
			e.printStackTrace();
		}
  		System.out.println("부서:");
  		part = Register.input.next();
  		if(part==null||part=="") {
  			throw new ManagerPartException("관리자부서가null이거나공백입니다.");
  		}
  		manager.setAge(age);
  		manager.setIrum(irum);
  		manager.setPart(part);
  		manager.setGubun("관리자");
  		managerList.add(manager);
	}
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
}


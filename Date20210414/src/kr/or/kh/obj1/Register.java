	package kr.or.kh.obj1;
	
	import java.sql.SQLException;
	
	public class Register extends Haksa {  
	  private StudentDTO student;
	  private ProfessorDTO professor;
	  private ManagerDTO manager;
	  public Register() {	  
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manager = new ManagerDTO();	
	  }
	   
	  @Override
	  public void setStudentSql()throws SQLException {
		  sql = "insert into student(age,irum,hakbun) values('"+student.getAge()+"','"+student.getIrum()+"','"+student.getHakbun()+"')";
		  stmt = conn.createStatement();
	  }
	  @Override
	  public void setProfessorSql() throws SQLException {
		  sql = "INSERT INTO professor(age,irum,subject) values('"+professor.getAge()+"','"+professor.getIrum()+"','"+professor.getSubject()+"')";
		  stmt = conn.createStatement();
	  }
	  @Override
	  public void setManagerSql() throws SQLException {
		  sql = "insert into manager(age,irum,part) values('"+manager.getAge()+"','"+manager.getIrum()+"','"+manager.getPart()+"')";
		  stmt = conn.createStatement();
	  }
	  
	  @Override
	  public void setAgeIrum(String gubun) {
		  if(gubun.equals("학생")) {
		     student.setAge();
		     student.setIrum();
		  }else if(gubun.equals("교수")) {
			 professor.setAge();
			 professor.setIrum();
		  }else if(gubun.equals("관리자")) {
			 manager.setAge();
			 manager.setIrum();
		  }
			
	  }
	  @Override							//줄인거	//입출력
	  public void setHakbun() {
		  student.setHakbun();
	  }
	  @Override
	  public void setSubject() {
		  professor.setSubject();
	  }
	  @Override
	  public void setPart() {
		  manager.setPart();   			//줄인거끝 //입출력
	  }
	  @Override
	  public void register() {
			System.out.println("=======메뉴 선택======");
			System.out.println("1.학생");
			System.out.println("2.교수");
			System.out.println("3.관리자");
			System.out.println("4.이전메뉴");
			System.out.println("번호를 선택해 주세요.."); 
			cnt = input.nextInt();
			if(cnt<0||cnt>4) {
				System.out.println("에러");
			}
			if(cnt==1) {//학생등록
				setAgeIrum("학생");		
				setHakbun();			
				try {
					conn=getConnection();
					setStudentSql();
					cnt=studentExecuter();
					displayAll("학생",cnt);
					close("등록");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//학생등록
			else if(cnt==2) {//교수등록
				setAgeIrum("교수");
				setSubject();
				try {
					conn=getConnection();
					setProfessorSql();
					cnt=professorExecuter();
					displayAll("교수",cnt);
					close("등록");
				} catch (SQLException e) {
					e.printStackTrace();
				}			    		            		
			}//교수등록
			else if(cnt==3) {//관리자
				setAgeIrum("관리자");
				setPart();
				try {
					conn=getConnection();
					setManagerSql();
					cnt=managerExecuter();
					displayAll("관리자",cnt);
					close("등록");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//관리자
		}
	  
	  
	  
	  
	// 부모클래스때문에 시바 필요없는것도 상속됌 ㅅㅂ
	  
	@Override
	public void deleteStudent() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deleteProfessor() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deleteManager() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void irumSearch() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void gubunSearch() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void searchStudent() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void searchProfessor() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void searchManager() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void studentSearchExecute() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void professorSearchExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void managerSearchExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void listStudent() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void listProfessor() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void listManager() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentSearchUpdate() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentUpdateView() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentUpdateExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentExecuterView() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentViewDisplay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentFinal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReAge(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReIrum(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReHakbun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudentFinal() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void professorUpdate() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void professorUpdateExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void professorUpdateView() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void professorExecuterView() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfessorFinal() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updateProfessorExecuter() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void professorViewDisplay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void professorFinal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReSubject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfessorDisplay(int cnt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managerUpdate() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managerUpdateExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managerUpdateView() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managerExecuterView() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managaerViewDisplay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managerFinal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRePart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateManagerFinal() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	} 
	}
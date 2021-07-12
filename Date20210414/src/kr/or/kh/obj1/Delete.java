	package kr.or.kh.obj1;
	
	import java.sql.SQLException;
	
	public class Delete extends Haksa {   
	   private String irumDelete;
	   private String gubun;
	   public Delete() {
		  
	   }
	   public void deleteIrum() {
		    System.out.println("삭제할이름을 입력:");
			irumDelete = Register.input.next();
			if(irumDelete==null||irumDelete=="") {
				System.out.println("에러");
			}
	   }
	   public void deleteGubun() {
		   System.out.println("학생,교수,관리자,중입력");
			gubun = Register.input.next();
			if(gubun==null||gubun=="") {
				System.out.println("에러");
			}
	   }
	   
	  
	@Override
	   public void deleteStudent() throws SQLException {
		   sql = "delete from student where irum='"+irumDelete+"'";
		   stmt = conn.createStatement();
	   }
	   @Override
	   public void deleteProfessor() throws SQLException {
		   sql = "delete from professor where irum='"+irumDelete+"'";
		   stmt = conn.createStatement();
	   }
	   @Override
	   public void deleteManager() throws SQLException {
		    sql = "delete from manager where irum='"+irumDelete+"'";
			stmt = conn.createStatement();
	   }
	
	   @Override
	   public void delete() {
	       deleteIrum();
	       deleteGubun();	   	
			if(gubun.equals("학생")) {//학생삭제    						
				try {
					conn = Register.getConnection();
					deleteStudent();
					studentExecuter();
					studentDisplay();		
					close("삭제");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		   }//학생삭제
			else if(gubun.equals("교수")) {//교수삭제	
					try {
						conn = Register.getConnection();
						deleteProfessor();
						professorExecuter();
						professorDisplay();
						close("삭제");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				
			}//교수삭제
			else if(gubun.equals("관리자")) {//관리자			
					try {
						conn = Register.getConnection();
						deleteManager();
						managerExecuter();
						managerDisplay();
					} catch (SQLException e) {
						e.printStackTrace();
					}
		  
			}//관리자
	}
	@Override
	public void setStudentSql() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setProfessorSql() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setManagerSql() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setAgeIrum(String gubun) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setHakbun() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSubject() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPart() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void register() {
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
